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

'Step 5 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 106)]), 0), findTestData(
		'TestData').getValue(2, 106))

Mobile.takeScreenshot('Sreenshot/Step4/First.png')

Mobile.tap(findTestObject('Object Repository/BackButtonStep1'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 101)]), 0), findTestData(
	'TestData').getValue(2, 101))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)


'Additional information'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 106)]), 0), findTestData(
	'TestData').getValue(4, 106))

'Primary income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 107)]), 0), findTestData(
	'TestData').getValue(4, 107))

Mobile.tap(findTestObject('FollowingText', [('Verify') :  findTestData('TestData').getValue(4, 107)]), 0)

Mobile.scrollToText(findTestData('TestData').getValue(5,107),FailureHandling.STOP_ON_FAILURE)

'Tap chosen one'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5,107)]), 0)

'Primary source of wealth'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 108)]), 0), findTestData(
	'TestData').getValue(4, 108))

Mobile.tap(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 108)]), 0)

Mobile.scrollToText(findTestData('TestData').getValue(5,108),FailureHandling.STOP_ON_FAILURE)

'Tap chosen one'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5,108)]), 0)

'Is the applicant going to be the...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 109)]), 0), findTestData(
	'TestData').getValue(4, 109))

Mobile.tap(findTestObject('Object Repository/Apply/No Button', [('No') : 1]), 0)

Mobile.tap(findTestObject('Object Repository/Apply/Yes Button', [('No') : 1]), 0)



'Is the applicant purchasing...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 110)]), 0), findTestData(
	'TestData').getValue(4, 110))

Mobile.tap(findTestObject('Object Repository/Apply/Yes Button', [('No') : 2]), 0)

Mobile.tap(findTestObject('Object Repository/Apply/No Button', [('No') : 2]), 0)

'Does the applicant have any other pending...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 111)]), 0), findTestData(
	'TestData').getValue(4, 111))

Mobile.tap(findTestObject('Object Repository/Apply/Yes Button', [('No') : 3]), 0)

Mobile.tap(findTestObject('Object Repository/Apply/No Button', [('No') : 3]), 0)

Mobile.tap(findTestObject('Text',[('Verify'):'Save & Next']), 0)






