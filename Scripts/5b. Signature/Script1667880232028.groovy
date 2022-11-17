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

'Sign & Consent'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,140)]),0),findTestData('TestData').getValue(4,140))

Mobile.takeScreenshot('Screenshot/Consent/Signature.png')

'Tap back button'
Mobile.tap(findTestObject('Object Repository/ButtonNo',[('No'):1]),0)

'Terms and Condition'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,130)]),0),findTestData('TestData').getValue(4,130))

Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,140)]),0)

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

Mobile.takeScreenshot('Screenshot/Consent/FirstScreen2.png')

CustName = Mobile.getText(findTestObject('PrecedingText',[('Verify') : findTestData('TestData').getValue(4, 141)]),0)


'Please get your customer to sign in the box below'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 141)]), 0),
	findTestData('TestData').getValue(4, 141))

'Clear Signature'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 19)]), 0),
	findTestData('TestData').getValue(4, 19))


Mobile.tapAtPosition(200, 1000)

Mobile.tapAtPosition(400, 1000)

Mobile.tapAtPosition(600, 1000)

Mobile.takeScreenshot('Screenshot/Consent/Sign1.png', FailureHandling.OPTIONAL)

'Clear signature'
Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 19)]), 0)

Mobile.takeScreenshot('Screenshot/Consent/Sign2.png', FailureHandling.OPTIONAL)

'Done button is not clickable'
Mobile.tap(findTestObject('Text', [('Verify') : 'Submit']), 0)

'Verify still stay same screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 141)]),
		0), findTestData('TestData').getValue(4, 141))

Mobile.tapAtPosition(200, 1000)

Mobile.tapAtPosition(400, 1000)

Mobile.tapAtPosition(600, 1000)

Mobile.tap(findTestObject('Text', [('Verify') : 'Submit']), 0)

'ty for your sign'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 180)]),
		0), findTestData('TestData').getValue(4, 180))

'you may now pass..'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 181)]),
	0), findTestData('TestData').getValue(4, 181))

Mobile.takeScreenshot('Screenshot/Sign/2nd Screen.png')
