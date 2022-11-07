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

not_run: Mobile.startExistingApplication('com.maybanksfapp.sit', FailureHandling.STOP_ON_FAILURE)

'Customer  Onboarding'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 61)]), 0), findTestData(
        'TestData').getValue(4, 61))

'Step 2 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 74)]), 0), findTestData(
        'TestData').getValue(2, 74))

'Home Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 74)]), 0), findTestData(
        'TestData').getValue(4, 74))

'Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 75)]), 0), findTestData(
        'TestData').getValue(4, 75))

Mobile.takeScreenshot('Sreenshot/Step2/First.png')

Country = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 75)]), 0)

if (((Country == 'Please Select') || (Country == null)) || (Country == '')) {
    'Tap selection'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 75)]), 
        0)

    scrollNew.text(findTestData('TestData').getValue(5, 75))

    'tap object'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 75)]), 0)
}

'Home Address Line 1'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 76)]), 0), findTestData(
        'TestData').getValue(4, 76))

Home1 = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                4, 76)]), 0)

if (Home1 == 'Home Address Line 1') {
    'set Home Addy 1'
    Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 
                    76)]), findTestData('TestData').getValue(5, 76), 0)
}

'Home Address Line 2'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 77)]), 0), findTestData(
        'TestData').getValue(4, 77))

Home2 = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                4, 77)]), 0)

if (Home2 == 'Home Address Line 2') {
    'set Home Addy 2'
    Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 
                    77)]), findTestData('TestData').getValue(5, 77), 0)
}

'City'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0), findTestData(
        'TestData').getValue(4, 78))

City = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 78)]), 0)

if (City == 'City') {
    'City'
    Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 
                    78)]), findTestData('TestData').getValue(5, 78), 0)
}

'Postcode'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0), findTestData(
        'TestData').getValue(4, 79))

Postcode = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 79)]), 0)

if (Postcode == 'Postcode') {
    'Postcode'
    Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 
                    79)]), findTestData('TestData').getValue(5, 79), 0)
}

Mobile.scrollToText('No')

Mobile.takeScreenshot('Sreenshot/Step2/Second.png')

'Mailing Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 80)]), 0), findTestData(
        'TestData').getValue(4, 80))

'Is the mailing address same as the home address?'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 81)]), 0), findTestData(
        'TestData').getValue(4, 81))

'verify 2nd mailing address not exist'
Mobile.verifyElementExist(findTestObject('Object Repository/2nd Field not exist'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Text', [('Verify') : 'Yes']), 0)

'if yes address and mailing same shouldnt have field'
Mobile.verifyElementNotExist(findTestObject('Object Repository/2nd Field not exist'), 2)

Mobile.tap(findTestObject('Text', [('Verify') : 'No']), 0)


Mobile.verifyEqual(findTestObject('Object Repository/2nd Field not exist'), 'Country')

Choice = findTestData('TestData').getValue(5, 82)

if (Choice == 'N') {
    Mobile.scrollToText('Country', FailureHandling.STOP_ON_FAILURE)

    CountryA = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                    4, 75)]), 0)

	Mobile.takeScreenshot('Sreenshot/Step2/Third.png')
	
    if (((CountryA == 'Please Select') || (CountryA == null)) || (CountryA == '')) {
        'Tap selection'
        Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 
                        75)]), 0)

        scrollNew.text(findTestData('TestData').getValue(5, 75))

        'tap object'
        Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 75)]), 0)
    }
    
    Mobile.scrollToText('Save & Next', FailureHandling.STOP_ON_FAILURE)

    'Home Address Line 1'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 76)]), 0), 
        findTestData('TestData').getValue(4, 76))

    Home1A = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                    4, 76)]), 0)

    if (Home1A == 'Home Address Line 1') {
        'set Home Addy 1'
        Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                        4, 76)]), findTestData('TestData').getValue(5, 76), 0)
    }
    
    'Home Address Line 2'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 77)]), 0), 
        findTestData('TestData').getValue(4, 77))

    Home2A = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                    4, 77)]), 0)

    if (Home2A == 'Home Address Line 2') {
        'set Home Addy 2'
        Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                        4, 77)]), findTestData('TestData').getValue(5, 77), 0)
    }
    
    'City'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0), 
        findTestData('TestData').getValue(4, 78))

    CityA = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                    4, 78)]), 0)

    if (CityA == 'City') {
        'City'
        Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                        4, 78)]), findTestData('TestData').getValue(5, 78), 0)
    }
    
    'Postcode'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0), 
        findTestData('TestData').getValue(4, 79))

    PostcodeA = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                    4, 79)]), 0)

    if (PostcodeA == 'Postcode') {
        'Postcode'
        Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                        4, 79)]), findTestData('TestData').getValue(5, 79), 0)
    }
} else {
    Mobile.tap(findTestObject('Text', [('Verify') : 'Yes']), 0)
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

