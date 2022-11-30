import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.ArrayList

if (Mobile.verifyElementExist(findTestObject('TotalCases'), 0, FailureHandling.OPTIONAL)) {
    'tap draft application'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 27)]), 0)
}

Mobile.scrollToText(findTestData('Draft').getValue(4, 4), FailureHandling.OPTIONAL)

'Pending Applicant\'s Information'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 4)]), 0)

'Pending Applicant\'s Information'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 4)]), 0), findTestData(
        'Draft').getValue(4, 4))

'STP ID: '
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'STP ID: ']), 0), 'STP ID: ')

CustName = Mobile.getText(findTestObject('PrecedingText', [('Verify') : 'STP ID: ']), 0)

CustID = Mobile.getText(findTestObject('FollowingText', [('Verify') : 'STP ID: ']), 0)

Mobile.verifyMatch(CustID,'MSF.*',FailureHandling.CONTINUE_ON_FAILURE)

DateUpdated = (Mobile.getText(findTestObject('Draft/startswith',[('Verify'):'Updated:']),0)).substring(8)

Mobile.takeScreenshot('Screenshot/Draft/UCO1.png')

'tap dropdwon'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 4)]), 0)

'Please complete your app...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 5)]), 0), findTestData(
        'Draft').getValue(4, 5))

Date2 = Mobile.getText(findTestObject('PrecedingText', [('Verify') : findTestData('Draft').getValue(4, 5)]), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('PrecedingText', [('Verify') : Date2]), 0),findTestData('Draft').getValue(4, 4))

Mobile.takeScreenshot('Screenshot/Draft/UCO2.png')

Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 4)]), 0)

'Application Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(2, 3)]), 0), findTestData(
        'Draft').getValue(2, 3))

Mobile.takeScreenshot('Screenshot/Draft/UCO3.png')

'Personal Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
		'TestData').getValue(4, 62))

'Home Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,114)]),0),findTestData('TestData').getValue(4,114))

'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),0),findTestData('TestData').getValue(4,83))

'Income and Commitment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0),findTestData('TestData').getValue(4,101))

'Add info'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Additional Information']),0),'Additional Information')

'tap personal details'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0)

ArrayList<String> Input = new ArrayList<String>()

for(i=1;i<13;i++) {

	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):
		findTestData('Drop Down').getValue(10,i)]),0),findTestData('Drop Down').getValue(10,i))
	
		Input.add(Mobile.getText(findTestObject('FollowingText',[('No'):i]),0))
	
		println(Input[i-1])
	}
Mobile.takeScreenshot('Screenshot/Draft/UCO4.png')
'Name same'
Mobile.verifyEqual(CustName,Input[0])

'New IC'
Mobile.verifyEqual(Input[1],'New IC')

'ID Format'
Mobile.verifyEqual(Input[2],'.*-*.')

'close personal details'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0)

'tap home address'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,114)]),0)

for(i=13;i<17;i++) {
	
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):
			findTestData('Drop Down').getValue(10,i)]),0),findTestData('Drop Down').getValue(10,i))
		
			Input.add(Mobile.getText(findTestObject('FollowingText',[('No'):i]),0))
		
			println(Input[i-1])
		}
	
Mobile.takeScreenshot('Screenshot/Draft/UCO5.png')	
		
'tap home address'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,114)]),0)
		
'tap employment details'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),0)
	
for(i=17;i<24;i++) {
	
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):
			findTestData('Drop Down').getValue(10,i)]),0),findTestData('Drop Down').getValue(10,i))
		
			Input.add(Mobile.getText(findTestObject('FollowingText',[('No'):i]),0))
		
			println(Input[i-1])
		}

		Mobile.takeScreenshot('Screenshot/Draft/UCO6.png')
		
'tap employment details'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),0)
			
'income and commitment dtails'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0)

for(i=24;i<28;i++) {
	
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):
			findTestData('Drop Down').getValue(10,i)]),0),findTestData('Drop Down').getValue(10,i))
		
			Input.add(Mobile.getText(findTestObject('FollowingText',[('No'):i]),0))
		
			println(Input[i-1])
		}

Mobile.takeScreenshot('Screenshot/Draft/UCO7.png')

Mobile.verifyMatch(Input[23],'RM.*',FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(Input[23],'.*.00',FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(Input[25],'RM.*',FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyMatch(Input[25],'.*.00',FailureHandling.CONTINUE_ON_FAILURE)

'income and commitment dtails'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0)

Mobile.tap(findTestObject('Text',[('Verify'):'Additional Information']),0)

for(i=28;i<32;i++) {
	
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):
			findTestData('Drop Down').getValue(10,i)]),0),findTestData('Drop Down').getValue(10,i))
		
			Input.add(Mobile.getText(findTestObject('FollowingText',[('No'):i]),0))
		
			println(Input[i-1])
		}

Mobile.takeScreenshot('Screenshot/Draft/UCO8.png')

Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)

Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 4)]), 0)

Mobile.tap(findTestObject('Text',[('Verify'):'Continue']),0)

Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Step 1 of 5']), 0)

Mobile.takeScreenshot('Screenshot/Draft/UCO9.png')

Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)

Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 4)]), 0)

Mobile.tap(findTestObject('Text',[('Verify'):'Continue']),0)

Mobile.tap(findTestObject('ButtonNo',[('No'):2]),0)

Mobile.takeScreenshot('Screenshot/Draft/UCO10.png')

Mobile.tap(findTestObject('Text',[('Verify'):'Save Now']),0)

'Your application has been saved...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,12)]),0),findTestData('Draft').getValue(4,12))

Mobile.takeScreenshot('Screenshot/Draft/UCO11.png')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,12)]),0),findTestData('Draft').getValue(4,12))

Mobile.verifyElementExist(findTestObject('Draft/startswith',[('Verify'):'Your cases']),0)


