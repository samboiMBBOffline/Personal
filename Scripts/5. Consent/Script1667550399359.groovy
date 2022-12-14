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

Mobile.delay(3)

Choice= '1'

'Tap back button'
Mobile.tap(findTestObject('Object Repository/ButtonNo', [('No') : 1]), 0)
'Back to previous screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Confirmation']), 0), 'Confirmation')

'Go back to consent screen'
Mobile.tap(findTestObject('Text', [('Verify') : 'Confirm & Continue']), 0)

Mobile.delay(3)

'Tap X button'
Mobile.tap(findTestObject('Object Repository/Consent/X_button'), 0)

'Save your progress'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 126)]), 0), 
    findTestData('TestData').getValue(4, 126))

'You can choose to save...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 127)]), 0), 
    findTestData('TestData').getValue(4, 127))

'Exit'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 128)]), 0), 
    findTestData('TestData').getValue(4, 128))

'Save Now'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 129)]), 0), 
    findTestData('TestData').getValue(4, 129))

Mobile.takeScreenshot('Screenshot/Consent/Exit.png')

Mobile.tap(findTestObject('Text', [('Verify') : 'Exit']), 0)

Mobile.takeScreenshot('Screenshot/Consent/FirstScreen.png')

'whats your cust preferred method...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Consent/Preferred Method'), 0), 
    findTestData('TestData').getValue(4, 119))

'Sign Electronically'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 120)]), 0), 
    findTestData('TestData').getValue(4, 120))

'Meet the applicant in person to get their consent'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 121)]), 0), 
    findTestData('TestData').getValue(4, 121))

//'Generate consent form'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 122)]), 0), 
//    findTestData('TestData').getValue(4, 122))
//
//'Automatically send the consent...'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 123)]), 0), 
//    findTestData('TestData').getValue(4, 123))
//
//'Upload Application Form'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 124)]), 0), 
//    findTestData('TestData').getValue(4, 124))
//
//'Upload applicants mortgage'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Consent/Consent3rd'), 0), 
//    findTestData('TestData').getValue(4, 125))

'Continue button'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Continue']), 0), 'Continue')

Mobile.scrollToText('Save as Draft',FailureHandling.CONTINUE_ON_FAILURE)

'Save as Draft'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Save as Draft']), 0), 'Save as Draft')

if (Choice == '1') {
    'tap sign electronically'
    Mobile.tap(findTestObject('RadioNo',[('No'):1]), 0)

    'tap continue'
    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)
} else if (Choice == '2') {
    'tap generate consent for,'
    Mobile.tap(findTestObject('RadioNo',[('No'):1]), 0)

    'tap continue'
    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)
} else if (Choice == '3') {
    'tap upload application form'
    Mobile.tap(findTestObject('RadioNo',[('No'):1]), 0)

    'tap continue'
    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)
}

