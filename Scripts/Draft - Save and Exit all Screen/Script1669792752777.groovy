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
import java.util.ArrayList as ArrayList

not_run: if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Other action required']), 2, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Text', [('Verify') : 'Draft Application: ']), 0)

    Mobile.scrollToText('MAYA KARIN', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Text', [('Verify') : 'MAYA KARIN']), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)
} else if (Mobile.verifyElementExist(findTestObject('Draft/startswith', ['Verify', 'Draft']), 2, FailureHandling.OPTIONAL)) {
    Mobile.scrollToText('MAYA KARIN', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Text', [('Verify') : 'MAYA KARIN']), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)
} else {
}

for (i = 1; i < 6; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : ('Step ' + i) + ' of 5']), 0), ('Step ' + i) + 
        ' of 5')

    Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)

    'Save Your Progress'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 126)]), 
            0), findTestData('TestData').getValue(4, 126))

    'You can choose to save your progress as a draft before leaving and pick up from where you left off at a later time.'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 127)]), 
            0), findTestData('TestData').getValue(4, 127))

    Mobile.takeScreenshot('Screenshot/Draft/Delete1.png')

    'Save Now'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 129)]), 
            0), findTestData('TestData').getValue(4, 129))

    Mobile.tap(findTestObject('Object Repository/Draft/XbuttonSaveyourProgress'), 0)

    'verify go previous screen'
    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : ('Step ' + i) + ' of 5']), 0)

    Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Exit']), 0)

    'verify go previous screen'
    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : ('Step ' + i) + ' of 5']), 0)

    Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)

    'tap save now'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 129)]), 0)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Draft/toastbarSaved'), 0), findTestData('Draft').getValue(
            4, 18))

    Mobile.takeScreenshot('Screenshot/Draft/SavedMessage1.png')

    if (i == 5) {
        break
    }
    
    if (i == 4) {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Cases']), 3)
    } else {
        Mobile.verifyElementExist(findTestObject('Object Repository/Draft/draft applications available'), 0)

        Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)
    }
    
    Mobile.scrollToText('MAYA KARIN', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Text', [('Verify') : 'MAYA KARIN']), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Continue']), 0)

    if (i == 1) {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)
    } else if (i == 2) {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)
    } else if (i == 3) {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)
    } else if (i == 4) {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)
    }
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Home']), 3)

Mobile.tap(findTestObject('Text', [('Verify') : 'Draft Application: ']), 0)

Mobile.scrollToText(findTestData('Draft').getValue(4, 6), FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(4, 6)]), 0)

Mobile.tap(findTestObject('Text', [('Verify') : findTestData('Draft').getValue(5, 7)]), 0)

'whats your applicants preferred...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Consent/Preferred Method'), 0), findTestData('TestData').getValue(
        4, 119))

Mobile.takeScreenshot('Screenshot/Draft/ConsentSaveExit.png')

Mobile.tap(findTestObject('Object Repository/XAfterBack'), 0)

'Save Your Progress'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 126)]), 0), 
    findTestData('TestData').getValue(4, 126))

'You can choose to save your progress as a draft before leaving and pick up from where you left off at a later time.'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 127)]), 0), 
    findTestData('TestData').getValue(4, 127))

Mobile.takeScreenshot('Screenshot/Draft/Delete6.png')

'Save Now'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 129)]), 0), 
    findTestData('TestData').getValue(4, 129))

Mobile.tap(findTestObject('Object Repository/Consent/XbuttonConsent'), 0)

'whats your applicants preferred...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Consent/Preferred Method'), 0), findTestData('TestData').getValue(
        4, 119))

Mobile.tap(findTestObject('Object Repository/XAfterBack'), 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Exit']), 0)

'whats your applicants preferred...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Consent/Preferred Method'), 0), findTestData('TestData').getValue(
        4, 119))

Mobile.tap(findTestObject('Object Repository/XAfterBack'), 0)

'tap save now'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 129)]), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Draft/toastbarSaved'), 0), findTestData('Draft').getValue(
        4, 18))

Mobile.takeScreenshot('Screenshot/Draft/SavedMessage1.png')

