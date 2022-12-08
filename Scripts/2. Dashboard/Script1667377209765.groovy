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
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager

'Hi Name'
Mobile.getText(findTestObject('Hi Name'), 0)

'You currently have 0 cases'
A = Mobile.getText(findTestObject('Object Repository/TotalCases'), 0)

B = Integer.parseInt(Mobile.getText(findTestObject('Object Repository/TotalCases'), 0).substring(19, 25).replaceAll(' ', 
        '').replaceAll('[a-z,A-Z]', ''))

'No1'
No1 = (Mobile.getText(findTestObject('Object Repository/PrecedingText', [('Verify') : findTestData('TestData').getValue(
                4, 23)]), 0)).replaceAll(' ', '')

if (No1 == '-') {
    No1 = 0
}else {
	No1 = Integer.parseInt(No1)
}

'Pending signing of LO'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 23)]), 0), findTestData(
        'TestData').getValue(4, 23))

'No2'
No2 = (Mobile.getText(findTestObject('Object Repository/PrecedingText', [('Verify') : findTestData('TestData').getValue(
                4, 24)]), 0)).replaceAll(' ', '')

if (No2 == '-') {
    No2 = 0
}else {
	No2 = Integer.parseInt(No2)
}

'Pending data entry / LO generation'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 24)]), 0), findTestData(
        'TestData').getValue(4, 24))

'No3'
No3 = (Mobile.getText(findTestObject('Object Repository/PrecedingText', [('Verify') : findTestData('TestData').getValue(
                4, 25)]), 0)).replaceAll(' ', '')

if (No3 == '-') {
    No3 = 0
}else {
	No3 = Integer.parseInt(No3)
}

'Pending assistance'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 25)]), 0), findTestData(
        'TestData').getValue(4, 25))

'No4'
No4 = (Mobile.getText(findTestObject('Object Repository/PrecedingText', [('Verify') : findTestData('TestData').getValue(
                4, 26)]), 0)).replaceAll(' ', '')

if (No4 == '-') {
    No4 = 0
}else {
	No4 = Integer.parseInt(No4)
}

'Pending KYC'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 26)]), 0), findTestData(
        'TestData').getValue(4, 26))

'No5'
No5 = (Mobile.getText(findTestObject('Object Repository/PrecedingText', [('Verify') : findTestData('TestData').getValue(
                4, 27)]), 0)).replaceAll(' ', '')

if (No5 == '-') {
    No5 = 0
}else {
	No5 = Integer.parseInt(No5)
}

'Other action required'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 27)]), 0), findTestData(
        'TestData').getValue(4, 27))

if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 27)]), 0)) {
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 27)]), 0), 
        findTestData('TestData').getValue(5, 27))

    No6 = Integer.parseInt((Mobile.getText(findTestObject('followingTextnoView', [('Verify') : findTestData('TestData').getValue(5, 27)]), 0)).replaceAll(
        ' ', ''))

    Sum = (((((No1 + No2) + No3) + No4) + No5) + No6)
} else {
    Sum = ((((No1 + No2) + No3) + No4) + No5)
}

Mobile.verifyEqual(B, Sum)

'No before leads'
Mobile.getText(findTestObject('PrecedingText', [('Verify') : findTestData('TestData').getValue(4, 28)]), 0)

'New leads available'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 28)]), 0), findTestData(
        'TestData').getValue(4, 28))

'Home button'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Home']), 1), 'Home')

'Cases'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Cases']), 1), 'Cases')

'Chat'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Chat']), 1), 'Chat')

