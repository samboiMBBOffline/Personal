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

if (Mobile.verifyElementExist(findTestObject('TotalCases'), 0, FailureHandling.OPTIONAL)) {
	'tap draft application'
	Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 27)]), 0)
}

Mobile.scrollToText(findTestData('Draft').getValue(4, 10), FailureHandling.OPTIONAL)

Mobile.takeScreenshot('Screenshot/Draft/Entry.png')

'Pending Applicant\'s Entry'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 10)]), 0)

'Pending Applicant\'s Entry'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 10)]), 0), findTestData(
		'Draft').getValue(4, 10))

CustName = Mobile.getText(findTestObject('PrecedingText', [('Verify') : 'STP ID: ']), 0)

CustID = Mobile.getText(findTestObject('FollowingText', [('Verify') : 'STP ID: ']), 0)

Mobile.takeScreenshot('Screenshot/Draft/Entry1.png')

DateUpdated = (Mobile.getText(findTestObject('Draft/startswith',[('Verify'):'Updated:']),0)).substring(8)

'Pending Applicant\'s Entry'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 10)]), 0)

'Kindly submit your applicants consent form to proceed.'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 11)]), 0), findTestData(
	'Draft').getValue(4, 11))

Date2 = Mobile.getText(findTestObject('PrecedingText', [('Verify') : findTestData('Draft').getValue(4, 11)]), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('PrecedingText', [('Verify') : Date2]), 0),findTestData('Draft').getValue(4, 10))

Mobile.takeScreenshot('Screenshot/Draft/Entry2.png')

'Application Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(2, 3)]), 0), findTestData(
		'Draft').getValue(2, 3))

Mobile.takeScreenshot('Screenshot/Draft/Entry3.png')

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
Mobile.takeScreenshot('Screenshot/Draft/Entry4.png')
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
	
Mobile.takeScreenshot('Screenshot/Draft/Entry5.png')
		
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

		Mobile.takeScreenshot('Screenshot/Draft/Entry6.png')
		
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

Mobile.takeScreenshot('Screenshot/Draft/Entry7.png')

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

Mobile.takeScreenshot('Screenshot/Draft/Entry8.png')

Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)

Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 4)]), 0)

'Submit Entry'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 9)]), 0)

if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,13)]),2,FailureHandling.CONTINUE_ON_FAILURE)) {
	
	if (Mobile.verifyElementExist(findTestObject('Text'[('Verify'):findTestData('Draft').getValue(4,15)]),2,FailureHandling.CONTINUE_ON_FAILURE)) {
		
		println('Call BAU PASS')
	}else {
		println('Call STP PASS')
	}
	
	
}else if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,14)]),2,FailureHandling.CONTINUE_ON_FAILURE)) {

	println('Call STP SOFT FAIL')	
	
	
}else if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,16)]),2,FailureHandling.CONTINUE_ON_FAILURE)) {

	println('Call BAU SOFT FAIL')
	
}else if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,14)]),2,FailureHandling.CONTINUE_ON_FAILURE)) {

	println('Call Hard Fail')
	
	
}























