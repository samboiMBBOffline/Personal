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

'Confirmation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), findTestData(
	'TestData').getValue(2, 112))

Mobile.takeScreenshot('Screenshot/Confirmation/Screen.png',FailureHandling.STOP_ON_FAILURE)


'Personal Details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 62)]), 0), findTestData(
		'TestData').getValue(4, 62))

'get users name'
Name = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 62)]), 0)

'ID Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]),
		0), findTestData('TestData').getValue(4, 45))

'ID Type Chosen'
IDType = Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0)

'ID Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0),
	findTestData('TestData').getValue(4, 55))

'ID Number set'
IDNo =Mobile.getText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(5, 56)]), 0)

'Religion'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 64)]), 0), findTestData(
		'TestData').getValue(4, 64))

'Chosen Religion'
Religion = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 64)]), 0)

'Salutation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 65)]), 0), findTestData(
		'TestData').getValue(4, 65))

'Chosen Salutation'
Salutation = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 65)]), 0)

'Gender'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 66)]), 0), findTestData(
		'TestData').getValue(4, 66))

'Chosen Gender'
Gender = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 66)]), 0)

'Education'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 67)]), 0), findTestData(
		'TestData').getValue(4, 67))

'Chosen Education'
Education = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 67)]), 0)

'Marital Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 68)]),
		0), findTestData('TestData').getValue(4, 68))

'Chosen Marital Status'
Marital = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 68)]), 0)

'Phone Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 70)]), 0), findTestData(
		'TestData').getValue(4, 70))

'Get Phone Number'
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(4, 70)]), 0),findTestData('TestData').getValue(4,70))

'Resident Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 71)]), 0), findTestData(
		'TestData').getValue(4, 71))

'Chosen Resident Status'
Resident = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 71)]), 0)

'Employment Status'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 74)]), 0), findTestData(
		'TestData').getValue(4, 72))

'Chosen Employment Status'
Employment = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 72)]), 0)

'Business Type'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 73)]), 0), findTestData(
		'TestData').getValue(4, 73))

'Chosen Business Type'
Business = Mobile.getText(findTestObject('Object Repository/FollowingText', [('Verify') : findTestData('TestData').getValue(
				4, 73)]), 0)

Mobile.tap(findTestObject('Object Repository/FollowingText',[('Verify'):findTestData('TestData').getValue(4,62)]),0)

Mobile.scrollToText(Name,FailureHandling.STOP_ON_FAILURE)
	
Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):Name]),0),Name)

Mobile.takeScreenshot('Screenshot/Confirmation/Edit1')

Mobile.scrollToText(IDType,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):IDType]),0),IDType)

Mobile.scrollToText(IDNo,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):IDNo]),0),IDNo)

Mobile.scrollToText(Religion,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Religion]),0),Religion)

Mobile.scrollToText(Salutation,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Salutation]),0),Salutation)

Mobile.scrollToText(Gender,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Gender]),0),Gender)

Mobile.scrollToText(Education,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Education]),0),Education)

Mobile.scrollToText(Marital,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Marital]),0),Marital)

Mobile.scrollToText(Resident,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Resident]),0),Resident)

Mobile.scrollToText(Employment,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Employment]),0),Employment)

Mobile.scrollToText(Business,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Save']),0),'Save')

Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):Business]),0),Business)

Mobile.scrollToText('Customer Onboarding',FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ButtonNo',[('No'):1]),0)

'Back to confirmation screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(2, 112)]), 0), findTestData(
	'TestData').getValue(2, 112))

'Home and Mailing Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 114)]), 0), findTestData(
	'TestData').getValue(4, 114))

'Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 114)]), 0), findTestData(
	'TestData').getValue(4, 114))

'Country Name'
CountryName1 = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4,114)]), 0)

'Home Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 116)]), 0), findTestData(
	'TestData').getValue(4, 116))

'Address new format'
Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(5, 116)]), 0), findTestData(
	'TestData').getValue(5, 114))

'Mailing Address Country'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 117)]), 0), findTestData(
	'TestData').getValue(4, 117))

'Country Name'
CountryName2 = Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 117)]), 0)

'Mailing Address'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 118)]), 0), findTestData(
	'TestData').getValue(4, 118))

'Address new format'
Mobile.verifyEqual(Mobile.getText(findTestObject('FollowingText', [('Verify') : findTestData('TestData').getValue(4, 118)]), 0), findTestData(
	'TestData').getValue(5, 114))

Mobile.tap(findTestObject('FollowingText',[('Verify'):findTestData('TestData').getValue(4,114)]),0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 118)]), 0), findTestData(
	'TestData').getValue(4, 118))




