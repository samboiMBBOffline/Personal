import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor as ScrollFactor
import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection
import com.my.keywords.android.scrollNew as scrollNew
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication('com.maybanksfapp.sit', FailureHandling.STOP_ON_FAILURE)
'Customer  Onboarding'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 61)]), 0), findTestData(
        'TestData').getValue(4, 61))

'Step 3 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 83)]), 0), findTestData(
        'TestData').getValue(2, 83))

Mobile.takeScreenshot('Sreenshot/Step3/First.png')

Mobile.tap(findTestObject('Object Repository/BackButtonStep3'), 0)

'Step 2 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 118)]), 0), 
    findTestData('TestData').getValue(4, 118))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 83)]), 0), findTestData(
        'TestData').getValue(4, 83))

'Occupation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0), findTestData(
        'TestData').getValue(4, 84))

Occupation = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 84)]), 0)

if (Occupation == 'Please Select') {
    Occupation = findTestData('TestData').getValue(5, 84)
}

Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0)

scrollNew.textDownSmall('Retiree')

Mobile.tap(findTestObject('Text', [('Verify') : 'Retiree']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Occupation Sector']), 2)

Mobile.takeScreenshot('Screenshot/Step3/USeries1.png')

Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0)

scrollNew.textDownSmall('Other Outside Labour Force')

Mobile.tap(findTestObject('Text', [('Verify') : 'Other Outside Labour Force']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Occupation Sector']), 2)

Mobile.takeScreenshot('Screenshot/Step3/USeries2.png')

Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0)

scrollNew.textDownSmall('Housewife/Househusband')

Mobile.tap(findTestObject('Text', [('Verify') : 'Housewife/Househusband']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Occupation Sector']), 2)

Mobile.takeScreenshot('Screenshot/Step3/USeries3.png')

Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0)

scrollNew.textDownSmall('Student')

Mobile.tap(findTestObject('Text', [('Verify') : 'Student']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Occupation Sector']), 2)

Mobile.takeScreenshot('Screenshot/Step3/USeries4.png')

Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 84)]), 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Accountants']), 0)

'Occupation Sector'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 85)]), 0), findTestData(
        'TestData').getValue(4, 85))

Sector = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 85)]), 0)

if (Sector == 'Please Select') {
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 85)]), 
        0)

    Mobile.scrollToText(findTestData('TestData').getValue(5, 85), FailureHandling.STOP_ON_FAILURE)

    'Tap option'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 85)]), 0)
}

'Employer Name'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 86)]), 0), findTestData(
        'TestData').getValue(4, 86))

Employer = Mobile.getText(findTestObject('FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 0)

if (Employer == '') {
    Employer = findTestData('TestData').getValue(5, 86)
}

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 
    '1234', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Employer name must be more than 5 characters.']), 
        0), 'Employer name must be more than 5 characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 
    ' Leading Space', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Employer name must not contain leading/double spaces.']), 
        0), 'Employer name must not contain leading/double spaces.')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 
    '!#$%^&*@\'-/\\,.', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Employer name must not contain special characters.']), 
        0), 'Employer name must not contain special characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 
    '12345678902234567890323456789041234567890', 0)

EmployerLimit = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                4, 86)]), 0)

Mobile.verifyEqual(40, EmployerLimit.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 86)]), 
    Employer, 0)

'Duration of Service'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 90)]), 0), findTestData(
        'TestData').getValue(4, 90))

Mobile.tap(findTestObject('Apply/MonthYearNo', [('No') : 1]), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '0 year']), 0), '0 year')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '1 year']), 0), '1 year')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '2 years']), 0), '2 years')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '3 years']), 0), '3 years')

Mobile.scrollToText('50 years', FailureHandling.OPTIONAL)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '50 years']), 0), '50 years')

Mobile.takeScreenshot('Screenshot/Step3/YearDropdown.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Apply/MonthYearNo', [('No') : 1]), 0)

Mobile.tap(findTestObject('Text', [('Verify') : '2 years']), 0)

Mobile.tap(findTestObject('Apply/MonthYearNo', [('No') : 2]), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '0 month']), 0), '0 month')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '1 month']), 0), '1 month')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '2 months']), 0), '2 months')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '3 months']), 0), '3 months')

Mobile.scrollToText('11 months', FailureHandling.OPTIONAL)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '11 months']), 0), '11 months')

Mobile.takeScreenshot('Screenshot/Step3/MonthDropdown.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Apply/MonthYearNo', [('No') : 2]), 0)

Mobile.tap(findTestObject('Text', [('Verify') : '2 months']), 0)

Mobile.dragAndDrop(findTestObject('Text', [('Verify') : 'Office Address']), findTestObject('Text', [('Verify') : 'Employment Details']), 
    10)

'Office Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 92)]), 0), findTestData(
        'TestData').getValue(4, 92))

'Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 93)]), 0), findTestData(
        'TestData').getValue(4, 93))

Country = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 93)]), 0)

if (Country == 'Please Select') {
    Mobile.tap(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 93)]), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'ALGERIA']), 0)
}

'Office Address Line 1'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 94)]), 0), findTestData(
        'TestData').getValue(4, 94))

Office1 = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 94)]), 0)

if (Office1 == 'Office Address Line 1') {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                        4, 94)]), 0), findTestData('TestData').getValue(4, 94))
}

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    '1234', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Address Line 1 must be more than 5 characters.']), 
        0), 'Address Line 1 must be more than 5 characters.')

Mobile.takeScreenshot('Screenshot/Step3/Employererror1.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    ' Leading Space', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Address Line 1 must not contain leading/double spaces.']), 
        0), 'Address Line 1 must not contain leading/double spaces.')

Mobile.takeScreenshot('Screenshot/Step3/Employererror2.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    '!#$%^&*', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 0), 
    'Please remove invalid special characters.')

Mobile.takeScreenshot('Screenshot/Step3/Employererror3.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    '@\'-/\\,.', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 3)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    '12345678902234567890323456789041234567890', 0)

Office1Limit = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 94)]), 0)

Mobile.verifyEqual(40, Office1Limit.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    Office1, 0)

'Office Address Line 2'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 95)]), 0), findTestData(
        'TestData').getValue(4, 95))

Office2 = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 95)]), 0)

if (Office2 == 'Office Address Line 2') {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                        4, 95)]), 0), findTestData('TestData').getValue(4, 95))
}

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    '1234', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Address Line 2 must be more than 5 characters.']), 
        0), 'Address Line 2 must be more than 5 characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    ' Leading Space', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Address Line 2 must not contain leading/double spaces.']), 
        0), 'Address Line 2 must not contain leading/double spaces.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    '!#$%^&*', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 0), 
    'Please remove invalid special characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    '@\'-/\\,.', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 3)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    '12345678902234567890323456789041234567890', 0)

Office2Limit = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 95)]), 0)

Mobile.verifyEqual(40, Office2Limit.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    Office2, 0)

'City'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0), findTestData(
        'TestData').getValue(4, 78))

City = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 78)]), 0)

if (City == 'City') {
    City = findTestData('TestData').getValue(5, 78)
}

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    '1234', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'City must be more than 5 characters.']), 0), 'City must be more than 5 characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    ' Leading Space', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'City must not contain leading/double spaces.']), 
        0), 'City must not contain leading/double spaces.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    '!#$%^&*', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 0), 
    'Please remove invalid special characters.')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    '@\'-/\\,.', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 3)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    '12345678902234567890323456789041234567890', 0)

CityLimit = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 78)]), 0)

Mobile.verifyEqual(40, CityLimit.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    City, 0)

'Postcode'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0), findTestData(
        'TestData').getValue(4, 79))

Postcode1 = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 79)]), 0)

if (Postcode1 == 'Postcode') {
    'Postcode'
    Postcode1 = findTestData('TestData').getValue(5, 79)
}

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 79)]), 
    '12345678902234567890323456789041234567890', 0)

PostcodeLimit = Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                4, 79)]), 0)

Mobile.verifyEqual(5, PostcodeLimit.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 79)]), 
    'ASVB!@#$%^&*(', 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(
                    4, 79)]), 0), 'Postcode')

Mobile.setText(findTestObject('Object Repository/FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 79)]), 
    Postcode1, 0)

'State'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 98)]), 0), findTestData(
        'TestData').getValue(4, 98))

State = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 98)]), 0)

if (State == 'Please Select') {
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 98)]), 
        0)

    Mobile.takeScreenshot('Screenshot/Step3/StateList.png')

    Mobile.scrollToText(findTestData('TestData').getValue(5, 98))

    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 98)]), 0)
}

'Office Contact Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 99)]), 0), findTestData(
        'TestData').getValue(4, 99))

Country = 'MALAYSIA'

if (Country == 'MALAYSIA') {
    Mobile.tap(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 99)]), 0)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '+03']), 0), '+03')

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '+04']), 0), '+04')

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : '+05']), 0), '+05')

    Mobile.takeScreenshot('Screenshot/Step3/CountryCode')

    Mobile.tap(findTestObject('Text', [('Verify') : '+03']), 0)
}

Mobile.setText(findTestObject('FollowingInput1', [('Verify') : 'Office Contact Number']), 'asdv', 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingInput1', [('Verify') : 'Office Contact Number']), 0), 'Phone Number')

Mobile.setText(findTestObject('FollowingInput1', [('Verify') : 'Office Contact Number']), '', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Step 4 of 5']), 0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
}

Mobile.setText(findTestObject('FollowingInput1', [('Verify') : 'Office Contact Number']), findTestData('TestData').getValue(
        4, 100), 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

