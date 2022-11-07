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

not_run: Mobile.startExistingApplication('com.maybanksfapp.sit', FailureHandling.STOP_ON_FAILURE)

'Customer  Onboarding'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 61)]), 0), findTestData(
        'TestData').getValue(4, 61))

'Step 3 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 83)]), 0), findTestData(
        'TestData').getValue(2, 83))

Mobile.takeScreenshot('Sreenshot/Step3/First.png')

'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 83)]), 0), findTestData(
	'TestData').getValue(4, 83))

'Occupation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0), findTestData(
	'TestData').getValue(4, 84))

Occupation = Mobile.getText(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 84)]),0)

if(Occupation == 'Please Select') {
	
	Mobile.tap(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 84)]),0)
	
	Mobile.scrollToText(findTestData('TestData').getValue(5,84),FailureHandling.STOP_ON_FAILURE)
	
	'Tap option'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,84)]),0)
	
}

'Occupation Sector'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 85)]), 0), findTestData(
	'TestData').getValue(4, 85))

Sector = Mobile.getText(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 85)]),0)

if(Sector == 'Please Select') {
	
	Mobile.tap(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 85)]),0)
	
	Mobile.scrollToText(findTestData('TestData').getValue(5,85),FailureHandling.STOP_ON_FAILURE)
	
	'Tap option'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,85)]),0)
	
}

'Employer Name'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 86)]), 0), findTestData(
	'TestData').getValue(4, 86))

Employer = Mobile.getText(findTestObject('FollowingInput',[('Verify'):findTestData('TestData').getValue(4,86)]),0)

if(Employer == '') {
	
	'set employer name'
	Mobile.setText(findTestObject('FollowingInput'),findTestData('TestData').getValue(5,86),0)
	
}

'Employment Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 87)]), 0), findTestData(
	'TestData').getValue(4, 87))

Type = Mobile.getText(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 87)]),0)

if(Type == 'Please Select') {
	
	Mobile.tap(findTestObject('Object Repository/FollowingText'[('Verify') : findTestData('TestData').getValue(4, 87)]),0)
	
	Mobile.scrollToText(findTestData('TestData').getValue(5,87),FailureHandling.STOP_ON_FAILURE)
	
	'Tap option'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,87)]),0)
	
}

'Country Code'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 88)]), 0), findTestData(
		'TestData').getValue(4, 88))

'Chosen Country Code'
CC = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 88)]), 0)

if ((CC == 'Please Select') || (CC != findTestData('TestData').getValue(5, 88))) {
	'Tap Please Select'
	Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 88)]),
		0)

	'scroll to the choosen Country Code'
	Mobile.scrollToText(findTestData('TestData').getValue(5, 88))

	'tap choosen Country Code'
	Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 88)]), 0)

	'verify chosen is same as shown'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
						4, 88)]), 0), findTestData('TestData').getValue(5, 88))
}

'Phone Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 89)]), 0), findTestData(
		'TestData').getValue(4, 89))

'Get Phone Number'
Phone1 = Mobile.getText(findTestObject('Object Repository/InputNo', [('No') : 1]), 0)

if ((Phone1 == '') || (Phone1.length() < 9)) {
	Mobile.setText(findTestObject('FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 89)]), findTestData('TestData').getValue(5, 89),
		0)
}

'Duration of Service'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 90)]), 0), findTestData(
	'TestData').getValue(4, 90))

Year = Mobile.getText()

























