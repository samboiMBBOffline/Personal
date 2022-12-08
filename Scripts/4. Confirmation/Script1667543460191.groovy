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
import com.my.keywords.android.scrollNew as scrollNew

'Confirmation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), findTestData(
	'TestData').getValue(2, 112))

Mobile.takeScreenshot('Screenshot/Confirmation/Screen.png',FailureHandling.STOP_ON_FAILURE)



Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)

'Step 5 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 106)]), 0), findTestData(
		'TestData').getValue(2, 106))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

'Personal Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
		'TestData').getValue(4, 62))

Mobile.takeScreenshot('Screenshot/Confirmation/Personal Details.png')

i=4
j=0
ArrayList<String> NameList = new ArrayList<String>()
while (i<28) {
	NameList.add(Mobile.getText(findTestObject('TextNo',[('No'):i]),0))
	println(NameList[j])
	i++
	j++
}

Mobile.tap(findTestObject('EditNo',[('No'):1]),0)
X = Mobile.getDeviceWidth()/2
Y1= Mobile.getDeviceHeight()*2/3
Y2= Mobile.getDeviceHeight()*1/3

for(i=0;i<28;i++) {

	if (Mobile.verifyElementExist(findTestObject('AnyText',[('Verify'):NameList[i]]),3,FailureHandling.OPTIONAL)) {
		
		Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):NameList[i]]),0),NameList[i])}
		else {
		while(Mobile.verifyElementNotExist(findTestObject('AnyText',[('Verify'):NameList[i]]),3,FailureHandling.OPTIONAL)) {

			Mobile.swipe(X,Y1,X,Y2)
		}
		Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):NameList[i]]),0),NameList[i])
		}
	
	
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):NameList[i]]),0),NameList[i])
}

Mobile.tap(findTestObject('Text',[('Verify'):'Save']),0)

'Back to confirmation screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), findTestData(
	'TestData').getValue(2, 112))

Mobile.dragAndDrop(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,114)]),findTestObject('Text',[('Verify'):'Personal Details']),10)

Mobile.takeScreenshot('Screenshot/Confirmation/Home and Mailing Address.png')

i=3
j=0
ArrayList<String> AddressList = new ArrayList<String>()
while (i<11) {
	AddressList.add(Mobile.getText(findTestObject('TextNo',[('No'):i]),0))
	println(AddressList[j])
	i++
	j++
}
Mobile.tap(findTestObject('EditNo',[('No'):1]),0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):AddressList[0]]),0),AddressList[0])

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):AddressList[1]]),0),AddressList[1])

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):AddressList[2]]),0),AddressList[2])



A = Mobile.getText(findTestObject('FollowingInput',[('Verify'):'Home Address Line 1']),0)

B = Mobile.getText(findTestObject('FollowingInput',[('Verify'):'Home Address Line 2']),0)

C = Mobile.getText(findTestObject('FollowingInput',[('Verify'):'City']),0)

D = Mobile.getText(findTestObject('FollowingInput',[('Verify'):'Postcode']),0)

scrollNew.text(findTestData('TestData').getValue(4,81))

E = Mobile.getText(findTestObject('FollowingText',[('Verify'):'State']),0)

F = A + (', ' + (B + (', ' + (C+( ', '+(D+ (', '+(E+ (', ' +AddressList[1])))))))))

if (Mobile.verifyEqual(AddressList[3],F)) {
	
	Mobile.verifyElementNotExist(findTestObject('Object Repository/2nd Field not exist'),0)
}

Mobile.tap(findTestObject('Text',[('Verify'):'Save']),0)

Mobile.dragAndDrop(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,114)]),10)

Mobile.takeScreenshot('Screenshot/Confirmation/Employment Details.png')

'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),0),findTestData('TestData').getValue(4,83))

i=3
j=0
ArrayList<String> EmploymentDeets = new ArrayList<String>()
while (i<15) {
	EmploymentDeets.add(Mobile.getText(findTestObject('TextNo',[('No'):i]),0))
	println(EmploymentDeets[j])
	i++
	j++
}

Mobile.tap(findTestObject('Text',[('Verify'):'Edit']),0)

for (i=0;i<7;i++) {
	
	scrollNew.text(EmploymentDeets[i])
	
	Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):EmploymentDeets[i]]),0),EmploymentDeets[i])
}
	
A1 = Mobile.getText(findTestObject('Object Repository/Apply/DurationofService',[('No'):1]),0)

A2 = Mobile.getText(findTestObject('Object Repository/Apply/DurationofService',[('No'):2]),0)

A3 = A1 + (' ' + A2)

Mobile.verifyEqual(EmploymentDeets[7],A3)

scrollNew.text('Postcode')

Mobile.takeScreenshot('Screenshot/Confirmation/OfficeAddy.png')

Mobile.tap(findTestObject('Text',[('Verify'):'Save']),0)

Mobile.dragAndDrop(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,83)]),10)

Mobile.takeScreenshot('Screenshot/Confirmation')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0),findTestData('TestData').getValue(4,101))

i=3
j=0
ArrayList<String> IncomeDeets = new ArrayList<String>()
while (i<9) {
	IncomeDeets.add(Mobile.getText(findTestObject('TextNo',[('No'):i]),0))
	println(IncomeDeets[j])
	i++
	j++
}

Mobile.tap(findTestObject('Text',[('Verify'):'Edit']),0)

Mobile.tap(findTestObject('Object Repository/BackButtonStep1'),0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0),findTestData('TestData').getValue(4,101))

Mobile.tap(findTestObject('Text',[('Verify'):'Edit']),0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,101)]),0),findTestData('TestData').getValue(4,101))

Mobile.takeScreenshot('Screenshot/Confirmation/MGI screen.png')

'MGI'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[0]]),0),IncomeDeets[0])

'amount without RM'
Mobile.verifyEqual((Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[1]]),0)).substring(3),(IncomeDeets[1]).substring(3))

'Existing Home Financing'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[2]]),0),IncomeDeets[2])

'amount of home'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[3]]),0),IncomeDeets[3])

'Nonbank commitments'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[4]]),0),IncomeDeets[4])

'amount non commitments without RM'
Mobile.verifyEqual((Mobile.getText(findTestObject('AnyText',[('Verify'):IncomeDeets[5]]),0)).substring(3),(IncomeDeets[5]).substring(3))

Mobile.tap(findTestObject('Text',[('Verify'):'Save']),0)

Mobile.scrollToText(findTestData('TestData').getValue(4,111),FailureHandling.OPTIONAL)

'Add info'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Additional Information']),0),'Additional Information')

'Primary Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,107)]),0), findTestData('TestData').getValue(4,107))

'Income'
Info1 = Mobile.getText(findTestObject('PrecedingText',[('Verify'):findTestData('TestData').getValue(4,107)]),0)

'Primary SOW income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,108)]),0), findTestData('TestData').getValue(4,108))

'SOW Income'
Info2 = Mobile.getText(findTestObject('PrecedingText',[('Verify'):findTestData('TestData').getValue(4,108)]),0)

'Is applicant going to be sole owner...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,109)]),0), findTestData('TestData').getValue(4,109))

Info3 = Mobile.getText(findTestObject('PrecedingText',[('Verify'):findTestData('TestData').getValue(4,109)]),0)


'Is applicant purchasing more than 1...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,110)]),0), findTestData('TestData').getValue(4,110))

Info4 = Mobile.getText(findTestObject('PrecedingText',[('Verify'):findTestData('TestData').getValue(4,110)]),0)


'does the applicant have pending...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,111)]),0), findTestData('TestData').getValue(4,111))

Info5 = Mobile.getText(findTestObject('PrecedingText',[('Verify'):findTestData('TestData').getValue(4,111)]),0)

Mobile.tap(findTestObject('Text',[('Verify'):'Edit']),0)


'Add info'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Additional Information']),0),'Additional Information')

'Primary Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,107)]),0), findTestData('TestData').getValue(4,107))

'Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Info1]),0), Info1)

'Primary SOW income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,108)]),0), findTestData('TestData').getValue(4,108))

'SOW Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Info2]),0), Info2)

'Is applicant going to be sole owner...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,109)]),0), findTestData('TestData').getValue(4,109))

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Info3]),0), Info3)


'Is applicant purchasing more than 1...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,110)]),0), findTestData('TestData').getValue(4,110))

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Info4]),0), Info4)


'does the applicant have pending...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,111)]),0), findTestData('TestData').getValue(4,111))

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Info5]),0), Info5)

Mobile.takeScreenshot('Screenshot/Confirmation/Additional Info 2.png')

Mobile.tap(findTestObject('Text',[('Verify'):'Save']),0)

Mobile.tap(findTestObject('Text',[('Verify'):'Confirm & Continue']),0)












