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

'Terms and Condition'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,130)]),0),findTestData('TestData').getValue(4,130))

Mobile.takeScreenshot('Screenshot/Consent/TnC.png')

'Tap back button'
Mobile.tap(findTestObject('Object Repository/BackButtonTnC'),0)

'Sign Electronically'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,120)]),0),findTestData('TestData').getValue(4,120))

//'tap sign electronically'
//Mobile.tap(findTestObject('Object Repository/Consent/Radio1'),0)

'tap continue'
Mobile.tap(findTestObject('Text',[('Verify'):'Continue']),0)

'Tap X button'
Mobile.tap(findTestObject('Object Repository/ButtonNo',[('No'):1]),0)

'Save your progress'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,126)]),0),findTestData('TestData').getValue(4,126))

'You can choose to save...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,127)]),0),findTestData('TestData').getValue(4,127))

'Exit'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,128)]),0),findTestData('TestData').getValue(4,128))

'Save Now'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,129)]),0),findTestData('TestData').getValue(4,129))

Mobile.takeScreenshot('Screenshot/Consent/Exit.png')

Mobile.tap(findTestObject('Text',[('Verify'):'Exit']),0)

Mobile.takeScreenshot('Screenshot/Consent/FirstScreen.png')


Mobile.scrollToText(findTestData('TestData').getValue(4,131))

Text1 = Mobile.getText(findTestObject('TextNo',[('No'):2]),0)

'1st Tnc'
Mobile.verifyEqual(Text1,findTestData('TestData').getValue(4,131))

Mobile.scrollToText(findTestData('TestData').getValue(4,132))

Text2 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text1]),0)

'2nd Tnc'
Mobile.verifyEqual(Text2,findTestData('TestData').getValue(4,132))

Mobile.scrollToText(findTestData('TestData').getValue(4,133))

Text3 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text2]),0)

'3rd Tnc'
Mobile.verifyEqual(Text3,findTestData('TestData').getValue(4,133))

Mobile.scrollToText(findTestData('TestData').getValue(4,134))

//Text4 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text3]),0)

Text4 = Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,134)]),0)

'4th Tnc'
Mobile.verifyEqual(Text4,findTestData('TestData').getValue(4,134))

Mobile.scrollToText(findTestData('TestData').getValue(4,135))

Text5 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text4]),0)

'5th Tnc'
Mobile.verifyEqual(Text5,findTestData('TestData').getValue(4,135))

Mobile.scrollToText(findTestData('TestData').getValue(5,135))

Text6 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text5]),0)

'6th Tnc'
Mobile.verifyEqual(Text6,findTestData('TestData').getValue(5,135))

Mobile.scrollToText(findTestData('TestData').getValue(5,136))

Text7 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text6]),0)

'7th a Tnc'
Mobile.verifyEqual(Text7,findTestData('TestData').getValue(5,136))


Mobile.scrollToText(findTestData('TestData').getValue(4,139))

Text8 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):Text7]),0)

'8th Tnc'
Mobile.verifyEqual(Text8,findTestData('TestData').getValue(4,136))

Mobile.scrollToText(findTestData('TestData').getValue(4,139),FailureHandling.CONTINUE_ON_FAILURE)

Text9 = Mobile.getText(findTestObject('Consent/NextTnc',[('Verify'):findTestData('TestData').getValue(4,138)]),0)

'9th b Tnc'
Mobile.verifyEqual(Text9,findTestData('TestData').getValue(4,139))




'yes i agree'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,137)]),0),findTestData('TestData').getValue(4,137))

'no i do not agree'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,138)]),0),findTestData('TestData').getValue(4,138))


Mobile.scrollToText(findTestData('TestData').getValue(2,140),FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(2,140)]),0)

'still stay in same screen'
Mobile.verifyEqual(Text9,findTestData('TestData').getValue(4,139))

'tap i agree'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,137)]),0)

'Sign & Consent'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,140)]),0),findTestData('TestData').getValue(4,140))

Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(2,140)]),0)





