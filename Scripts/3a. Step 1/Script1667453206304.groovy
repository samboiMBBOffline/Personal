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

Mobile.tap(findTestObject('Object Repository/BackButtonStep1'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(6, 61)]), 0), findTestData(
        'TestData').getValue(6, 61))

Mobile.tap(findTestObject('TextNo', [('No') : 3]), 0)

'Name'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
        'TestData').getValue(4, 62))

'get users name'
Name = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                4, 62)]), 0)

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 62)]), 
    '@ \'/,.', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

'Business Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 73)]), 0), findTestData(
        'TestData').getValue(4, 73))

Mobile.scrollToText('Name',FailureHandling.OPTIONAL)

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Please remove invalid special characters.']), 3)

Mobile.takeScreenshot('Screenshot/Step1/Validation1.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 62)]), 
    'MA', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

'Business Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 73)]), 0), findTestData(
		'TestData').getValue(4, 73))

Mobile.scrollToText('Name',FailureHandling.OPTIONAL)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Name must contain at least 3 alphabetical characters and space(s) only.']), 
        0), 'Name must contain at least 3 alphabetical characters and space(s) only.')

Mobile.takeScreenshot('Screenshot/Step1/Validation2.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 62)]), 
    '   ', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

'Business Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 73)]), 0), findTestData(
		'TestData').getValue(4, 73))

Mobile.scrollToText('Name',FailureHandling.OPTIONAL)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Name must not contain leading/double spaces.']), 
        0), 'Name must not contain leading/double spaces.')

Mobile.takeScreenshot('Screenshot/Step1/Validation3.png')

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 62)]), 
    '1123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456', 
    0)

NameLength = Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                4, 62)]), 0)

Mobile.verifyEqual(150, NameLength.length())

Mobile.setText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(4, 62)]), 
    Name, 0)

'ID Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]), 0), findTestData(
        'TestData').getValue(4, 45))

'ID Type Chosen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0), findTestData(
        'TestData').getValue(4, 54))

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0), findTestData(
        'TestData').getValue(4, 54))

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 52)]), 2)

Mobile.takeScreenshot('Screenshot/Dropdown/Step1a')

'ID Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0), findTestData(
        'TestData').getValue(4, 55))

'ID Number set'
Mobile.verifyEqual(Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(5, 56)]), 0), 
    findTestData('TestData').getValue(5, 56))

'get IC'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingInput', [('Verify') : findTestData('TestData').getValue(
                    4, 55)]), 0), NRIC1)
NRIC1 = 
Mobile.takeScreenshot('Screenshot/Step1/Validation4.png')
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

    Religion = findTestData('TestData').getValue(5, 64)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 64)]), 0), findTestData('TestData').getValue(5, 64))
}

Mobile.tap(findTestObject('Text', [('Verify') : Religion]), 0)

for (i = 1; i < 7; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(1, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(1, i)]), 0), 
        findTestData('Drop down').getValue(1, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1b')

Mobile.pressBack()

Mobile.dragAndDrop(findTestObject('Text', [('Verify') : 'Salutation']), findTestObject('Text', [('Verify') : 'Name']), 10)

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
	
    Salutation = findTestData('TestData').getValue(5, 65)

    'tap choosen salutation'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 65)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 65)]), 0), findTestData('TestData').getValue(5, 65))
}

Mobile.tap(findTestObject('Text', [('Verify') : Salutation]), 0)

for (i = 1; i < 25; i++) {
    scrollNew.textDownSmall(findTestData('Drop down').getValue(2, i))
	
//	scrollNew.textDown(findTestData('Drop down').getValue(2, i))
//	if(i==4||i==7||i==10||i==13||i==21) {
//		Mobile.dragAndDrop(findTestObject('TextNo',[('No'):4]),findTestObject('TextNo',[('No'):1]),10)
	
	
	
    if (i == 6) {
        Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Apply/dato'), 0), findTestData('Drop down').getValue(
                2, i))
    } else if (i == 7) {
        Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Apply/dato1'), 0), findTestData('Drop down').getValue(
                2, i))
    } else if (i == 8) {
        Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Apply/dato2'), 0), findTestData('Drop down').getValue(
                2, i))
    } else {
        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(2, i)]), 
                0), findTestData('Drop down').getValue(2, i))
    }
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1b.png')

Mobile.verifyElementNotExist(findTestObject('Text', [('Verify') : 'Tun']), 4)

Mobile.pressBack()

//Mobile.dragAndDrop(findTestObject('Text', [('Verify') : 'Salutation']), findTestObject('Text', [('Verify') : 'ID Number']), 
//    10)
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

    Gender = findTestData('TestData').getValue(5, 66)

    'tap choosen gender'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 66)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 66)]), 0), findTestData('TestData').getValue(5, 66))
}

Mobile.tap(findTestObject('Text', [('Verify') : Gender]), 0)

'Female'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(3, 1)]), 0), findTestData(
        'Drop down').getValue(3, 1))

'Male'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(3, 2)]), 0), findTestData(
        'Drop down').getValue(3, 2))

Mobile.takeScreenshot('Screenshot/Dropdown/Step1c.png')

Mobile.pressBack()

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

    Education = findTestData('TestData').getValue(5, 67)

    'tap choosen education'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 67)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 67)]), 0), findTestData('TestData').getValue(5, 67))
}

Mobile.tap(findTestObject('Text', [('Verify') : Education]), 0)

for (i = 1; i < 9; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(4, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(4, i)]), 0), 
        findTestData('Drop down').getValue(4, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1d.png')

Mobile.pressBack()

Mobile.takeScreenshot('Screenshot/Step1/Third.png')

'Marital Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 68)]), 0), findTestData(
        'TestData').getValue(4, 68))

'Chosen Marital Status'
Marital = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                4, 68)]), 0)

if (Marital == 'Please Select') {
    'Tap Please Select'
    Mobile.tap(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 68)]), 
        0)

    'scroll to the choosen Marital Status'
    Mobile.scrollToText(findTestData('TestData').getValue(5, 68), FailureHandling.CONTINUE_ON_FAILURE)

    Marital = findTestData('TestData').getValue(5, 68)

    'tap choosen Marital Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 68)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 68)]), 0), findTestData('TestData').getValue(5, 68))
}

Mobile.tap(findTestObject('Text', [('Verify') : Marital]), 0)

for (i = 1; i < 7; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(5, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(5, i)]), 0), 
        findTestData('Drop down').getValue(5, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1e.png')

Mobile.pressBack()

Mobile.dragAndDrop(findTestObject('Text', [('Verify') : 'Education']), findTestObject('Text', [('Verify') : 'Salutation']), 
    10)

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

    Code = findTestData('TestData').getValue(5, 69)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 69)]), 0), findTestData('TestData').getValue(5, 69))
}

Mobile.tap(findTestObject('Text', [('Verify') : Code]), 0)

Mobile.delay(5)

for (i = 1; i < 5; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(6, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(6, i)]), 0), 
        findTestData('Drop down').getValue(6, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1f.png')

Mobile.pressBack()

'Phone Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 70)]), 0), findTestData(
        'TestData').getValue(4, 70))

Mobile.setText(findTestObject('Object Repository/InputNo', [('No') : 1]), '12345678', 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Mobile number must consist of minimum 9 digits.']), 
        0), 'Mobile number must consist of minimum 9 digits.')

Mobile.takeScreenshot('Screenshot/Step1/Validation6.png')

Mobile.setText(findTestObject('Object Repository/InputNo', [('No') : 1]), '12345678123123123123', 0)

CheckLengthPhone = Mobile.getText(findTestObject('Object Repository/InputNo', [('No') : 1]), 0)

Mobile.verifyEqual(10, CheckLengthPhone.length())

Mobile.setText(findTestObject('Object Repository/InputNo', [('No') : 1]), '142255681', 0)

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

    Resident = findTestData('TestData').getValue(5, 71)

    'tap choosen Resident Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 71)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 71)]), 0), findTestData('TestData').getValue(5, 71))

    'Employment Status'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 72)]), 0), 
        findTestData('TestData').getValue(4, 72))
}

Mobile.tap(findTestObject('Text', [('Verify') : Resident]), 0)

for (i = 1; i < 9; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(7, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(7, i)]), 0), 
        findTestData('Drop down').getValue(7, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1g.png')

Mobile.pressBack()

'Employment Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 72)]), 0), findTestData(
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

    Employment = findTestData('TestData').getValue(5, 72)

    'tap choosen Employment Status'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 72)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 72)]), 0), findTestData('TestData').getValue(5, 72))
}

Mobile.tap(findTestObject('Text', [('Verify') : Employment]), 0)

for (i = 1; i < 9; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(8, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(8, i)]), 0), 
        findTestData('Drop down').getValue(8, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1h.png')

Mobile.pressBack()

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

    Business = findTestData('TestData').getValue(5, 73)

    'tap choosen Business Type'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 73)]), 0)

    'verify chosen is same as shown'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
                        4, 73)]), 0), findTestData('TestData').getValue(5, 73))
}

Mobile.tap(findTestObject('Text', [('Verify') : Business]), 0)

for (i = 1; i < 7; i++) {
    Mobile.scrollToText(findTestData('Drop down').getValue(9, i), FailureHandling.OPTIONAL)

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop down').getValue(9, i)]), 0), 
        findTestData('Drop down').getValue(9, i))
}

Mobile.takeScreenshot('Screenshot/Dropdown/Step1i.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

