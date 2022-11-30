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

if (Mobile.verifyElementExist(findTestObject('TotalCases'),0,FailureHandling.OPTIONAL)) {
	
	'tap draft application'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,27)]),0)

	
	}
	
i=1
Mobile.tap(findTestObject('Apply/Pending Applicant Info',[('No'):i]),0)

if (Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):'View Application Details']),2)) {
	
	while(Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):'View Application Details']),2)) {
		
		i++
		
		Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)
		
		Mobile.tap(findTestObject('Apply/Pending Applicant Info',[('No'):i]),0)
	}
}

Mobile.tap(findTestObject('ButtonNo',[('No'):2]),0)

'Delete Application'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,1)]),0), findTestData('Draft').getValue(4,1))

Mobile.takeScreenshot('Screenshot/Draft/Delete1.png')

Mobile.tap(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,1)]),0)

'This application has been deleted.'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('Draft').getValue(4,2)]),0), findTestData('Draft').getValue(4,2))

Mobile.takeScreenshot('Screenshot/Draft/Delete2.png')

'Lands on first screen'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Quick Actions']),0), 'Quick Actions')
























