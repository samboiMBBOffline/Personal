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

Mobile.startExistingApplication(GlobalVariable.startAPP, FailureHandling.OPTIONAL)

if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Login to Sales Force']), 7, FailureHandling.OPTIONAL)) {
    Mobile.callTestCase(findTestCase('1. Login Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

'Executed'
not_run: Mobile.callTestCase(findTestCase('2. Dashboard'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'still doesnt have required data'
not_run: Mobile.callTestCase(findTestCase('3. Start New Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('3a. Step 1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('3b. Step 2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('3c. Step 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('3d. Step 4'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('3e. Step 5'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Scroll to text issue\r\n'
not_run: Mobile.callTestCase(findTestCase('4. Confirmation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('5. Consent'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('5a. TnC'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('5b. Signature'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - UCO Stage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - Consent Stage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - Property Selection Stage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - Submit Results Stage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - Save and Exit all Screen'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('Draft - Delete Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Executed'
not_run: Mobile.callTestCase(findTestCase('6. Search Property'), [:], FailureHandling.CONTINUE_ON_FAILURE)

