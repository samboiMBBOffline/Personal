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
import com.my.keywords.android.scrollNew as scrollNew

not_run: Mobile.startExistingApplication('com.maybanksfapp.sit', FailureHandling.CONTINUE_ON_FAILURE)

Verify = findTestData('TestData').getValue(2, 2)

'Customer  Onboarding'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 61)]), 0), findTestData(
        'TestData').getValue(4, 61))

'Step 1 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 61)]), 0), findTestData(
        'TestData').getValue(2, 61))

'Personal Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
        'TestData').getValue(4, 62))

Mobile.takeScreenshot('Sreenshot/Step1/First.png')

'Name'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
        'TestData').getValue(4, 62))

'get users name'
Name = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 62)]), 0)

'ID Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]), 
        0), findTestData('TestData').getValue(4, 45))

'ID Type Chosen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0), findTestData(
        'TestData').getValue(4, 54))

'ID Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0),
	findTestData('TestData').getValue(4, 55))

'ID Number set'
Mobile.verifyEqual(Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(5, 56)]), 0), 
    findTestData('TestData').getValue(5, 56))




'Religion'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 64)]), 0), findTestData(
        'TestData').getValue(4, 64))

'Chosen Religion'
Religion = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 64)]), 0)

if (Religion == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 64)]), 
        0)

    'scroll to the choosen religion'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 64), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen religion'
    Mobile.tap(findTestData('TestData').getValue(5, 64), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 64)]), 0), findTestData('TestData').getValue(5, 64))
}

'Salutation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 65)]), 0), findTestData(
        'TestData').getValue(4, 65))

'Chosen Salutation'
Salutation = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 65)]), 0)

if (Salutation == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 65)]), 
        0)

    'scroll to the choosen salutation'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 65), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen salutation'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 65)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 65)]), 0), findTestData('TestData').getValue(5, 65))
}

Mobile.dragAndDrop(findTestObject('Text', [('Verify') : 'Salutation']), findTestObject('Text', [('Verify') : 'ID Number']), 
    10)

Mobile.takeScreenshot('Screenshot/Step1/Second.png')

'Gender'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 66)]), 0), findTestData(
        'TestData').getValue(4, 66))

'Chosen Gender'
Gender = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 66)]), 0)

if (Gender == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 66)]), 
        0)

    'scroll to the choosen gender'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 66), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen gender'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 66)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 66)]), 0), findTestData('TestData').getValue(5, 66))
}

'Education'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 67)]), 0), findTestData(
        'TestData').getValue(4, 67))

'Chosen Education'
Education = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 67)]), 0)

if (Education == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 67)]), 
        0)

    'scroll to the choosen education'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 67), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen education'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 67)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 67)]), 0), findTestData('TestData').getValue(5, 67))
}

Mobile.scrollToText('Save & Next')

Mobile.takeScreenshot('Screenshot/Step1/Third.png')

'Marital Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 68)]), 
        0), findTestData('TestData').getValue(4, 68))

'Chosen Marital Status'
Marital = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 68)]), 0)

if (Marital == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 68)]), 
        0)

    'scroll to the choosen Marital Status'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 68), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen Marital Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 68)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 68)]), 0), findTestData('TestData').getValue(5, 68))
}

'Country Code'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 69)]), 0), findTestData(
        'TestData').getValue(4, 69))

'Chosen Country Code'
Code = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 69)]), 0)

if ((Code == 'Please Select') || (Code != findTestData('TestData').getValue(5, 69))) {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 69)]), 
        0)

    'scroll to the choosen Country Code'
    scrollNew.text(findTestData('TestData').getValue(5, 69))

    'tap choosen Country Code'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 69)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 69)]), 0), findTestData('TestData').getValue(5, 69))
}

'Phone Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 70)]), 0), findTestData(
        'TestData').getValue(4, 70))

'Get Phone Number'
Phone = Mobile.getText(findTestObject('Object Repository/InputNo', [('No') : 1]), 0)

if ((Phone == '') || (Phone.length() < 9)) {
    Mobile.setText(findTestObject('Object Repository/InputNo', [('No') : 1]), findTestData('TestData').getValue(5, 70), 
        0)
}

'Resident Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 71)]), 0), findTestData(
        'TestData').getValue(4, 71))

'Chosen Resident Status'
Resident = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 71)]), 0)

if (Resident == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 71)]), 
        0)

    'scroll to the choosen Resident Status'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 71), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen Resident Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 71)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 71)]), 0), findTestData('TestData').getValue(5, 71))

    'Employment Status'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 72)]), 0), 
        findTestData('TestData').getValue(4, 72))
}

'Employment Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 74)]), 0), findTestData(
        'TestData').getValue(4, 72))

'Chosen Employment Status'
Employment = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 72)]), 0)

if (Employment == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 72)]), 
        0)

    'scroll to the choosen Employment Status'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 72), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen Employment Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 72)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 72)]), 0), findTestData('TestData').getValue(5, 72))
}

'Business Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 73)]), 0), findTestData(
        'TestData').getValue(4, 73))

'Chosen Business Type'
Business = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 73)]), 0)

if (Business == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 73)]), 
        0)

    'scroll to the choosen Business Type'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 73), FailureHandling.CONTINUE_ON_FAILURE)

    'tap choosen Business Type'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 73)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 73)]), 0), findTestData('TestData').getValue(5, 73))
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

