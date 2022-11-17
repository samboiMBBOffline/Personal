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

not_run: Mobile.startExistingApplication('com.maybanksfapp.sit', FailureHandling.STOP_ON_FAILURE)

'Customer  Onboarding'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 61)]), 0), findTestData(
		'TestData').getValue(4, 61))

'Step 4 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 101)]), 0), findTestData(
		'TestData').getValue(2, 101))

Mobile.takeScreenshot('Sreenshot/Step4/First.png')

Mobile.tap(findTestObject('Object Repository/BackButtonStep1'), 0)

'Step 3 of 5'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 83)]), 0), findTestData(
		'TestData').getValue(2, 83))

Mobile.tap(findTestObject('Text', [('Verify') : 'Save & Next']), 0)


'Income and commitment details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 101)]), 0), findTestData(
	'TestData').getValue(4, 101))

'Monthly Gross Income'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 102)]), 0), findTestData(
	'TestData').getValue(4, 102))

'RM'
Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 102)]), 0), 'RM')

'0.00'
Mobile.verifyEqual(Mobile.getText(findTestObject('InputNo', [('No') : 1]), 0), '0.00')

Mobile.tap(findTestObject('Text',[('Verify'):'Save & Next']),0)

Mobile.takeScreenshot('Screenshot/Step4/NoDetails.png')

'Income and commitment details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 101)]), 0), findTestData(
	'TestData').getValue(4, 101))

Mobile.takeScreenshot('Screenshot/Step4/NoDetails.png')

Mobile.setText(findTestObject('InputNo', [('No') : 1]),'1234567890123',0)

Mobile.verifyEqual((Mobile.getText(findTestObject('InputNo', [('No') : 1]),0)).length(),12)

'Set amount MGI'
Mobile.setText(findTestObject('InputNo', [('No') : 1]),findTestData('TestData').getValue(5,102),0)
	
'Existing Home Financing'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 103)]), 0), findTestData(
	'TestData').getValue(4, 103))

'tap amount of home financing'
Mobile.tap(findTestObject('Text', [('Verify') :'Please Select']),0)

Mobile.tap(findTestObject('Text', [('Verify') :findTestData('TestData').getValue(5,103)]),0)

'verify amount chosen is same'
Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText',[('Verify'):findTestData('TestData').getValue(4,103)]),0),findTestData('TestData').getValue(5,103))

'Non-bank commitments'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 104)]), 0), findTestData(
	'TestData').getValue(4, 104))

'RM'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 104)]), 0), 'RM')

'0.00'
Mobile.verifyEqual(Mobile.getText(findTestObject('InputNo', [('No') :2]), 0), '0.00')

Mobile.setText(findTestObject('InputNo', [('No') : 2]),'1234567890123',0)

Mobile.verifyEqual((Mobile.getText(findTestObject('InputNo', [('No') : 2]),0)).length(),12)



'Set other commitments'
Mobile.setText(findTestObject('InputNo', [('No') : 2]),findTestData('TestData').getValue(5,104),0)

Mobile.tap(findTestObject('Text',[('Verify'):'Save & Next']),0)

















