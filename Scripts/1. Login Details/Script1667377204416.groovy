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

Mobile.startExistingApplication(GlobalVariable.startAPP, FailureHandling.STOP_ON_FAILURE)

String Verify = findTestData('TestData').getValue(2, 2)

'Login to Sales Force'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 3)]), 0), findTestData(
        'TestData').getValue(4, 3))

Mobile.takeScreenshot('Screenshot/Login/FirstScreen.png')

'Please enter your details below.'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 4)]), 0), findTestData(
        'TestData').getValue(4, 4))

'PF Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 5)]), 0), findTestData(
        'TestData').getValue(4, 5))

'Password'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 6)]), 0), findTestData(
        'TestData').getValue(4, 6))

'Note:Use of this...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 7)]), 0), findTestData(
        'TestData').getValue(4, 7))

'For first time login'
if (Verify == 'Y') {
    'Set wrong pf'
    Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 1), 0)

    'set password'
    Mobile.setText(findTestObject('InputNo', [('No') : 2]), findTestData('TestData').getValue(4, 2), 0)

    'tap login'
    Mobile.tap(findTestObject('Text', [('Verify') : 'Login']), 0)

    'PF Number does not exist...'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 7)]), 0), 
        findTestData('TestData').getValue(4, 7))

    Mobile.takeScreenshot('Screenshot/Login/WrongPF.png')
}

'Input PF Number in 4,1'
Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(4, 1), 0)

'Input password in 4,2'
Mobile.setText(findTestObject('InputNo', [('No') : 2]), findTestData('TestData').getValue(4, 2), 0)

'tap login'
Mobile.tap(findTestObject('Text', [('Verify') : 'Login']), 0)

if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 8)]), 5, FailureHandling.OPTIONAL)) {
    'First Time Login'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 8)]), 0), 
        findTestData('TestData').getValue(4, 8))

    Mobile.takeScreenshot('Screenshot/Login/FirstTimeLogin.png')

    'Let us know you preferred name'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 9)]), 0), 
        findTestData('TestData').getValue(4, 9))

    'Tap ? button'
    Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)

    'What is preferred name?'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 10)]), 0), 
        findTestData('TestData').getValue(4, 10))

    'Your preferred name is the name..'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 11)]), 0), 
        findTestData('TestData').getValue(4, 11))

    'I understand'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 12)]), 0), 
        findTestData('TestData').getValue(4, 12))

    Mobile.takeScreenshot('Screenshot/Login/Preferred_i.png')

    'I understand'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 12)]), 0)

    'Preferred name'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 13)]), 0), 
        findTestData('TestData').getValue(4, 13))

    if (Verify == 'Y') {
        'Set wrong password'
        Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 12), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

        'Preferred name must over 3 chara'
        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 14)]), 
                0), findTestData('TestData').getValue(4, 14))

        Mobile.takeScreenshot('Screenshot/Login/WrongPF.png')
    }
    
    'Set correct password'
    Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 13), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

    'Please add your mobileNo'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 15)]), 0), 
        findTestData('TestData').getValue(4, 15))

    Mobile.takeScreenshot('Screenshot/Login/MobileNo.png')

    'First Time Login'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 8)]), 0), 
        findTestData('TestData').getValue(4, 8))

    'eg. 0123456789'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 16)]), 
            0), findTestData('TestData').getValue(4, 16))

    if (Verify == 'Y') {
        'Set wrong no'
        Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 16), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

        'Please enter valid no....'
        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 17)]), 
                0), findTestData('TestData').getValue(4, 17))

        Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

        Mobile.takeScreenshot('Screenshot/Login/WrongNo.png')
    }
    
    'Set MobileNo in 5,17'
    Mobile.setText(findTestObject('InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 17), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

    'Please put your signature'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 18)]), 0), 
        findTestData('TestData').getValue(4, 18))

    'Clear Signature'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 19)]), 0), 
        findTestData('TestData').getValue(4, 19))

    Mobile.takeScreenshot('Screenshot/Login/Signature.png')

    Mobile.tapAtPosition(200, 1000)

    Mobile.tapAtPosition(400, 1000)

    Mobile.tapAtPosition(600, 1000)

    Mobile.takeScreenshot('Screenshot/Login/Sign1.png', FailureHandling.OPTIONAL)

    if (Verify == 'Y') {
        'Clear signature'
        Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 19)]), 0)

        Mobile.takeScreenshot('Screenshot/Login/Sign2.png', FailureHandling.OPTIONAL)

        'Done button is not clickable'
        Mobile.tap(findTestObject('Text', [('Verify') : 'Done']), 0)

        'Verify still stay same screen'
        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 18)]), 
                0), findTestData('TestData').getValue(4, 18))

        Mobile.tapAtPosition(200, 1000)
    }
    
    'Tap Done'
    Mobile.tap(findTestObject('Text', [('Verify') : 'Done']), 0)

    'Welcome to salesforce'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 20)]), 0), 
        findTestData('TestData').getValue(4, 20))

    'Youre set...'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Youre Set'), 0), findTestData('TestData').getValue(4, 21))

    Mobile.takeScreenshot('Screenshot/Login/PopupFirstTimeLogin.png')

    Mobile.tap(findTestObject('Text', [('Verify') : 'Dismiss']), 0)
}

'if skipped if, is subsequent'

'Verify first screen exist'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Home']), 3), 'Home')

Mobile.takeScreenshot('Screenshot/Login/Dashboard.png')

