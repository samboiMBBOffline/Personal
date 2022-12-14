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
import com.my.keywords.android.scrollNew as scrollNew

'Confirmation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), 
    findTestData('TestData').getValue(2, 112))

Mobile.takeScreenshot('Screenshot/Confirmation/Screen.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ButtonNo', [('No') : 1]), 0)

'Step 5 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 110)]), 0), 
    findTestData('TestData').getValue(4, 110))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)

Mobile.delay(4)

'Personal Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
        'TestData').getValue(4, 62))

Mobile.takeScreenshot('Screenshot/Confirmation/Personal Details.png')

ArrayList<String> Name = new ArrayList<String>()

for (i = 1; i < 13; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
            0), findTestData('Drop Down').getValue(10, i))

    A = findTestData('Drop Down').getValue(10, i)

    if ((i == 1) || (i == 4)) {
        Name.add(Mobile.getText(findTestObject('followingTextnoView', [('Verify') : A]), 0))
    } else {
        Name.add(Mobile.getText(findTestObject('followingTextnoView2', [('Verify') : A]), 0))
    }
    
    println(Name[(i - 1)])
}

Mobile.tap(findTestObject('EditNo', [('No') : 1]), 0)

for (i = 1; i < 13; i++) {
    if (i == 3) {
        WrongText = 'ID Number'

        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : WrongText]), 0), WrongText)
    } else if (i == 9) {
        Code = (Name[8]).substring(0, 3)

        Number2 = (Name[8]).substring(4)

        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
                0), findTestData('Drop Down').getValue(10, i))

        Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : Code]), 0), Code)

        Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : Number2]), 0), Number2)
    } else {
        scrollNew.textDown(findTestData('Drop Down').getValue(10, i))

        Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
                0), findTestData('Drop Down').getValue(10, i))

        Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : Name[(i - 1)]]), 0), Name[(i - 1)])
    }
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Save']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Details updated']), 0), 'Details updated')

'Back to confirmation screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), 
    findTestData('TestData').getValue(2, 112))

for (i = 1; i < 13; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
            0), findTestData('Drop Down').getValue(10, i))

    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : Name[(i - 1)]]), 0), Name[(i - 1)])
}

scrollNew.textDownSmall(findTestData('Drop Down').getValue(10, 16))
Mobile.takeScreenshot('Screenshot/Confirmation/Home and Mailing Address.png')

ArrayList<String> AddressList = new ArrayList<String>()

j = 0

for (i = 13; i < 17; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
            0), findTestData('Drop Down').getValue(10, i))

    B = findTestData('Drop Down').getValue(10, i)

    AddressList.add(Mobile.getText(findTestObject('followingTextnoView', [('Verify') : B]), 0))

    println(AddressList[(j - 1)])
}

Mobile.tap(findTestObject('EditNo', [('No') : 1]), 0)

Mobile.delay(10)

'Home Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 74)]), 0), findTestData(
        'TestData').getValue(4, 74))

'Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 75)]), 0), findTestData(
        'TestData').getValue(4, 75))

'Chosen country same'
Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 75)]), 
        0), AddressList[0])

'Home Address Line 1'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 76)]), 0), findTestData(
        'TestData').getValue(4, 76))

Home1 = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 76)]), 0) + 
' ')

'Home Address Line 2'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 77)]), 0), findTestData(
        'TestData').getValue(4, 77))

Home2 = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 77)]), 0) + 
'  ')

'City'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0), findTestData(
        'TestData').getValue(4, 78))

City = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0) + 
' ')

'Postcode'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0), findTestData(
        'TestData').getValue(4, 79))

Postcode = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0) + 
' ')

scrollNew.textDown('No')

'State'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 98)]), 0), findTestData(
        'TestData').getValue(4, 98))

State = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 98)]), 0)

FullAddy = ((((Home1 + Home2) + City) + Postcode) + State)

Mobile.takeScreenshot('Screenshot/Confirmation/Employment.png')

Mobile.tap(findTestObject('Text', [('Verify') : 'Yes']), 0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Details updated']), 0), 'Details updated')

'adddress correct'
Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('Drop down').getValue(
                    10, 14)]), 0), FullAddy)

'address correct2'
Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('Drop down').getValue(
                    10, 16)]), 0), FullAddy)

scrollNew.textDownSmall(findTestData('Drop Down').getValue(10, 23))

Mobile.takeScreenshot('Screenshot/Confirmation/Employment Details.png')


'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 
	findTestData('TestData').getValue(4, 83)]), 0), 
	findTestData('TestData').getValue(4, 83))

ArrayList<String> EmploymentDeets = new ArrayList<String>()

k = 0

for (i = 17; i < 24; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
            0), findTestData('Drop Down').getValue(10, i))

    B = findTestData('Drop Down').getValue(10, i)

    EmploymentDeets.add(Mobile.getText(findTestObject('followingTextnoView', [('Verify') : B]), 0))

    println(EmploymentDeets[(k - 1)])
}

CodeOffice = Mobile.getText(findTestObject('followingTextnoView', [('Verify') : findTestData('Drop Down').getValue(10, 23)]), 
    0).substring(0, 3)

NumberOffice = Mobile.getText(findTestObject('followingTextnoView', [('Verify') : findTestData('Drop Down').getValue(10, 
                23)]), 0).substring(4)

Mobile.tap(findTestObject('Text', [('Verify') : 'Edit']), 0)

Mobile.delay(10)

'Employment Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 83)]), 0), findTestData(
        'TestData').getValue(4, 83))

for (i = 0; i < 3; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i + 17)]), 
            0), findTestData('Drop Down').getValue(10, i + 17))

    Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : EmploymentDeets[i]]), 0), EmploymentDeets[
        i])
}

Year = (Mobile.getText(findTestObject('Object Repository/Apply/DurationofService', [('No') : 1]), 0) + ' ')

Year = Year.replaceAll('y', 'Y')

Month = Mobile.getText(findTestObject('Object Repository/Apply/DurationofService', [('No') : 2]), 0)

Month = Month.replaceAll('m', 'M')

Mobile.verifyEqual(EmploymentDeets[3], Year + Month)

'Office Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 92)]), 0), findTestData(
        'TestData').getValue(4, 92))

'Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 93)]), 0), findTestData(
        'TestData').getValue(4, 93))

OfficeCountry = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 93)]), 
    0)

scrollNew.textDown('Postcode')

Mobile.takeScreenshot('Screenshot/Confirmation/OfficeAddy.png')

'Office Address Line 1'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 94)]), 0), findTestData(
        'TestData').getValue(4, 94))

OfficeAddy1 = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 94)]), 
    0) + ' ')

'Office Address Line 2'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 95)]), 0), findTestData(
        'TestData').getValue(4, 95))

OfficeAddy2 = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 95)]), 
    0) + ' ')

'City'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 78)]), 0), findTestData(
        'TestData').getValue(4, 78))

OfficeCity = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 78)]), 
    0) + ' ')

'Postcode'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 79)]), 0), findTestData(
        'TestData').getValue(4, 79))

OfficePost = (Mobile.getText(findTestObject('FollowingInput1', [('Verify') : findTestData('TestData').getValue(4, 79)]), 
    0) + ' ')

'State'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 98)]), 0), findTestData(
        'TestData').getValue(4, 98))

OfficeState = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 98)]), 0)

'Office Contact Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 99)]), 0), findTestData(
        'TestData').getValue(4, 99))

'Code'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : CodeOffice]), 0), CodeOffice)

'Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('AnyText', [('Verify') : NumberOffice]), 0), NumberOffice)

OfficeFullAddy = ((((OfficeAddy1 + OfficeAddy2) + OfficeCity) + OfficePost) + OfficeState)

Mobile.tap(findTestObject('Text', [('Verify') : 'Save']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Details updated']), 0), 'Details updated')

Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : 'Office Address']), 0), OfficeFullAddy)

scrollNew.textDownSmall(findTestData('Drop Down').getValue(10, 27))

Mobile.takeScreenshot('Screenshot/Confirmation')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 101)]), 0), 
    findTestData('TestData').getValue(4, 101))

ArrayList<String> IncomeDeets = new ArrayList<String>()

for (i = 24; i < 27; i++) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, i)]), 
            0), findTestData('Drop Down').getValue(10, i))

    IncomeDeets.add(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('Drop Down').getValue(
                        10, i)]), 0))

    println(IncomeDeets[(i - 24)])
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Edit']), 0)

Mobile.delay(4)

'MGI'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, 24)]), 0), 
    findTestData('Drop Down').getValue(10, 24))

Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingInput', [('Verify') : findTestData('Drop Down').getValue(10, 
                    24)]), 0), (IncomeDeets[0]).substring(3))

'Existing Home'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('Drop Down').getValue(10, 25)]), 0), 
    findTestData('Drop Down').getValue(10, 25))

Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('Drop Down').getValue(10, 25)]), 
        0), IncomeDeets[1])

ScreenNBC = (findTestData('Drop Down').getValue(10, 26) + ' (Optional)').replaceAll('C', 'c')

'Non bank'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : ScreenNBC]), 0), ScreenNBC)

Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingInput', [('Verify') : ScreenNBC]), 0), (IncomeDeets[2]).substring(
        3))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Details updated']), 0), 'Details updated')

scrollNew.textDown(findTestData('TestData').getValue(4, 111))

'Add info'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Additional Information']), 0), 'Additional Information')

'Primary Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 107)]), 0), 
    findTestData('TestData').getValue(4, 107))

'Income'
Info1 = Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(4, 107)]), 
    0)

'Primary SOW income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 108)]), 0), 
    findTestData('TestData').getValue(4, 108))

'SOW Income'
Info2 = Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(4, 108)]), 
    0)

'Is applicant going to be sole owner...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 109)]), 0), 
    findTestData('TestData').getValue(4, 109))

Info3 = Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(4, 109)]), 
    0)

'Is applicant purchasing more than 1...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 110)]), 0), 
    findTestData('TestData').getValue(4, 110))

Info4 = Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(4, 110)]), 
    0)

'does the applicant have pending...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 111)]), 0), 
    findTestData('TestData').getValue(4, 111))

Info5 = Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(4, 111)]), 
    0)

Mobile.tap(findTestObject('Text', [('Verify') : 'Edit']), 0)

Mobile.delay(10)

'Add info'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Additional Information']), 0), 'Additional Information')

'Primary Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 107)]), 0), 
    findTestData('TestData').getValue(4, 107))

'Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : Info1]), 0), Info1)

'Primary SOW income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 108)]), 0), 
    findTestData('TestData').getValue(4, 108))

'SOW Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : Info2]), 0), Info2)

'Is applicant going to be sole owner...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 109)]), 0), 
    findTestData('TestData').getValue(4, 109))

Mobile.tap(findTestObject('Object Repository/Draft/YesNo', [('No') : 1]), 0)

'Is applicant purchasing more than 1...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 110)]), 0), 
    findTestData('TestData').getValue(4, 110))

Mobile.tap(findTestObject('Object Repository/Draft/NoNo', [('No') : 2]), 0)

'does the applicant have pending...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 111)]), 0), 
    findTestData('TestData').getValue(4, 111))

Mobile.tap(findTestObject('Object Repository/Draft/NoNo', [('No') : 3]), 0)

Mobile.takeScreenshot('Screenshot/Confirmation/Additional Info 2.png')

Mobile.tap(findTestObject('Text', [('Verify') : 'Save']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Details updated']), 0), 'Details updated')

'info3 is yes'
Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(
                    4, 109)]), 0), 'Yes')

'info4 is no'
Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(
                    4, 110)]), 0), 'No')

'info5 is no'
Mobile.verifyEqual(Mobile.getText(findTestObject('followingTextnoview', [('Verify') : findTestData('TestData').getValue(
                    4, 111)]), 0), 'No')

Mobile.takeScreenshot('Screenshot/Confirmation/Final.png')

Mobile.delay(10)

if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Details updated']), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Text', [('Verify') : 'Details updated']), 0)
}

Mobile.tap(findTestObject('Text', [('Verify') : 'Confirm & Continue']), 0)

