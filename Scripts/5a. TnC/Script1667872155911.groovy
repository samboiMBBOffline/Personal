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
Mobile.tap(findTestObject('Object Repository/ButtonNo',[('No'):1]),0)

'Sign Electronically'
Mobile.verifyEqual(Mobile.getText(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,120)]),0),0),findTestData('TestData').getValue(4,120))

'tap sign electronically'
Mobile.tap(findTestObject('Object Repository/Consent/Radio1'),0)

'tap continue'
Mobile.tap(findTestObject('Text',[('Verify'):'Continue']),0)

'Tap X button'
Mobile.tap(findTestObject('Object Repository/ButtonNo',[('No'):2]),0)

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

'1st Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,131)]),0),findTestData('TestData').getValue(4,131))

Mobile.scrollToText(findTestData('TestData').getValue(4,132))

'2nd Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,132)]),0),findTestData('TestData').getValue(4,132))

Mobile.scrollToText(findTestData('TestData').getValue(4,133))

'3rd Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,133)]),0),findTestData('TestData').getValue(4,133))

Mobile.scrollToText(findTestData('TestData').getValue(4,134))

'4th Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,134)]),0),findTestData('TestData').getValue(4,134))

Mobile.scrollToText(findTestData('TestData').getValue(4,135))

'5th Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,135)]),0),findTestData('TestData').getValue(4,135))

Mobile.scrollToText(findTestData('TestData').getValue(4,136))

'6th Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,136)]),0),findTestData('TestData').getValue(4,136))

Mobile.scrollToText(findTestData('TestData').getValue(5,135))

'6th a Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,135)]),0),findTestData('TestData').getValue(5,135))


Mobile.scrollToText(findTestData('TestData').getValue(4,139))

'7th Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,137)]),0),findTestData('TestData').getValue(4,139))

Mobile.scrollToText(findTestData('TestData').getValue(5,138))

'6th b Tnc'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,138)]),0),findTestData('TestData').getValue(5,138))




'yes i agree'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,137)]),0),findTestData('TestData').getValue(4,137))

'no i do not agree'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,138)]),0),findTestData('TestData').getValue(4,138))

'tap i agree'
Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,137)]),0)

'Sign & Consent'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,140)]),0),findTestData('TestData').getValue(4,140))

Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(2,140)]),0)





