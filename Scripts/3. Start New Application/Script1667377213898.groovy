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

//if (AppiumDriverManager.isAppiumServerStarted(10)) {
Mobile.startExistingApplication(GlobalVariable.startAPP, FailureHandling.STOP_ON_FAILURE)

Verify = findTestData('TestData').getValue(2, 2)

Choice = findTestData('TestData').getValue(2, 3)

//}
Mobile.delay(3)

Mobile.tapAtPosition(250, 1700)

'Start New Application'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 36)]), 0), findTestData(
        'TestData').getValue(4, 36))

//'To help speed up...'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 37)]), 0), findTestData(
//        'TestData').getValue(4, 37))

Mobile.takeScreenshot('Screenshot/Apply/1stScreen.png')

//'please fill up...'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Apply/applicantsdetails'), 0), findTestData('TestData').getValue(
//        4, 38))
//
//'If theyre an existing...'
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Apply/ifexisting'), 0), findTestData('TestData').getValue(
//        4, 39))

'Number of Applicant'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 40)]), 0), findTestData(
        'TestData').getValue(4, 40))

'How many applicant...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 41)]), 0), findTestData(
        'TestData').getValue(4, 41))

'1 Applicant'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 42)]), 0), findTestData(
        'TestData').getValue(4, 42))

'2 Applicant'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 43)]), 0), findTestData(
        'TestData').getValue(4, 43))

'Next'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : 'Next']), 0), 'Next')

if (Choice == '1 Applicant') {
    'Tap 1 applicant'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 42)]), 0)

    'Main Applicant'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 44)]), 0), 
        findTestData('TestData').getValue(4, 44))

    Mobile.takeScreenshot('Screenshot/Apply/1Applicant1.png')

    'ID Type'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]), 0), 
        findTestData('TestData').getValue(4, 45))

    'Tap id type'
    Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

    if (Verify == 'Y') {
        for (i = 47; i < 54; i++) {
            'Scroll to type of ID'
            Mobile.scrollToText(findTestData('TestData').getValue(4, i), FailureHandling.STOP_ON_FAILURE)

            'Verify Type of ID'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 
                                i)]), 2), findTestData('TestData').getValue(4, i))

            'Tap ID'
            Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, i)]), 0)

            'Verify chosen is display in selection'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 
                                i)]), 2), findTestData('TestData').getValue(5, i))

            'Tap selection again'
            Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

            Mobile.takeScreenshot('Screenshot/Apply/IDTypes.png')
        }
    }
    
    'Change selection in 4,54'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0)

    'ID Number'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0), 
        findTestData('TestData').getValue(4, 55))

    'set ID number in 5,54'
    Mobile.setText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 56)]), findTestData('TestData').getValue(
            5, 54), 0)

	Mobile.verifyEqual(findTestObject('Object Repository/InputNo',[('No'):1]),findTestData('TestData').getValue(5,56))
	
    Mobile.scrollToText('Next', FailureHandling.OPTIONAL)

    'FATCA..'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 57)]), 0), 
        findTestData('TestData').getValue(4, 57))

    'Is the applicant a US person'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 58)]), 0), 
        findTestData('TestData').getValue(4, 58))

    'CRS'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 59)]), 0), 
        findTestData('TestData').getValue(4, 59))

    'Does the applicant pay taxes in other than Malaysia'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 60)]), 0), 
        findTestData('TestData').getValue(4, 60))

    'tap No FATCA'
    Mobile.tap(findTestObject('Object Repository/Apply/NoFATCA'), 0)

    'verify yes fatca button exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesFATCA'), 0)

    'tap No CRS'
    Mobile.tap(findTestObject('Object Repository/Apply/NoCRS'), 0)
	
	

    'verify yes crs exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesCRS'), 0)
} else if (Choice == '2 Applicants') {
    'Tap 2 applicants'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 43)]), 0)

    'Main Applicant'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 44)]), 0), 
        findTestData('TestData').getValue(4, 44))

    Mobile.takeScreenshot('Screenshot/Apply/1Applicant1.png')

    'ID Type'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]), 0), 
        findTestData('TestData').getValue(4, 45))

    'Tap id type'
    Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

    if (Verify == 'Y') {
        for (i = 47; i < 54; i++) {
            'Scroll to type of ID'
            Mobile.scrollToText(findTestData('TestData').getValue(4, i), FailureHandling.STOP_ON_FAILURE)

            'Verify Type of ID'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 
                                i)]), 2), findTestData('TestData').getValue(4, i))

            'Tap ID'
            Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, i)]), 0)

            'Verify chosen is display in selection'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 
                                i)]), 2), findTestData('TestData').getValue(5, i))

            'Tap selection again'
            Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

            Mobile.takeScreenshot('Screenshot/Apply/IDTypes.png')
        }
    }
    
    'Change selection in 4,54'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0)

    'ID Number'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0), 
        findTestData('TestData').getValue(4, 55))

    'set ID number in 5,54'
    Mobile.setText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 56)]), findTestData('TestData').getValue(
            5, 54), 0)

    Mobile.dragAndDrop(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 55)]), findTestObject('Text', 
            [('Verify') : findTestData('TestData').getValue(4, 43)]), 10)

    'FATCA..'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 57)]), 0), 
        findTestData('TestData').getValue(4, 57))

    'Is the applicant a US person'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 58)]), 0), 
        findTestData('TestData').getValue(4, 58))

    'CRS'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 59)]), 0), 
        findTestData('TestData').getValue(4, 59))

    'Does the applicant pay taxes in other than Malaysia'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 60)]), 0), 
        findTestData('TestData').getValue(4, 60))

    'tap No FATCA'
    Mobile.tap(findTestObject('Object Repository/Apply/NoFATCA'), 0)

    'verify yes fatca button exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesFATCA'), 0)

    'tap No CRS'
    Mobile.tap(findTestObject('Object Repository/Apply/NoCRS'), 0)

    'verify yes crs exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesCRS'), 0)

    Mobile.scrollToText('Next', FailureHandling.STOP_ON_FAILURE)

    'Applicant Two'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 44)]), 0), 
        findTestData('TestData').getValue(5, 44))

    Mobile.takeScreenshot('Screenshot/Apply/2Applicant1.png')

    'ID Type'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 45)]), 0), 
        findTestData('TestData').getValue(4, 45))

    'Tap id type'
    Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

    if (Verify == 'Y') {
        for (i = 47; i < 54; i++) {
            'Scroll to type of ID'
            Mobile.scrollToText(findTestData('TestData').getValue(4, i), FailureHandling.STOP_ON_FAILURE)

            'Verify Type of ID'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 
                                i)]), 2), findTestData('TestData').getValue(4, i))

            'Tap ID'
            Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, i)]), 0)

            'Verify chosen is display in selection'
            Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 
                                i)]), 2), findTestData('TestData').getValue(5, i))

            'Tap selection again'
            Mobile.tap(findTestObject('Object Repository/Apply/Please Select'), 2)

            Mobile.takeScreenshot('Screenshot/Apply/IDTypes.png')
        }
    }
    
    'Change selection in 4,54'
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 54)]), 0)

    'ID Number'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 55)]), 0), 
        findTestData('TestData').getValue(4, 55))

    'set ID number in 5,54'
    Mobile.setText(findTestObject('Input', [('Verify') : findTestData('TestData').getValue(4, 56)]), findTestData('TestData').getValue(
            5, 55), 0)

    'FATCA..'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 57)]), 0), 
        findTestData('TestData').getValue(4, 57))

    'Is the applicant a US person'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 58)]), 0), 
        findTestData('TestData').getValue(4, 58))

    'CRS'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 59)]), 0), 
        findTestData('TestData').getValue(4, 59))

    'Does the applicant pay taxes in other than Malaysia'
    Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 60)]), 0), 
        findTestData('TestData').getValue(4, 60))

    'tap No FATCA'
    Mobile.tap(findTestObject('Object Repository/Apply/NoFATCA'), 0)

    'verify yes fatca button exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesFATCA'), 0)

    'tap No CRS'
    Mobile.tap(findTestObject('Object Repository/Apply/NoCRS'), 0)

    'verify yes crs exist'
    Mobile.verifyElementExist(findTestObject('Object Repository/Apply/YesCRS'), 0)
}

'tap next'
Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)

if(Mobile.verifyElementExist(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,60)]),0,FailureHandling.OPTIONAL))
{
	'Existing Customer Detected'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 60)]), 0), findTestData(
			'TestData').getValue(5, 60))
	
	'The applicant is an existing...'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 61)]), 0), findTestData(
		'TestData').getValue(5, 61))
	
	'Existing Customer Detected'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 60)]), 0), findTestData(
			'TestData').getValue(5, 60))
	
	'Create Application'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 62)]), 0), findTestData(
		'TestData').getValue(5, 62))
	
	Mobile.takeScreenshot('Screenshot/Apply/Existing.png')
	
	Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(5, 62)]), 0)
	
}