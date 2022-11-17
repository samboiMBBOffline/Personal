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

'Successfully signed document.'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,142)]),0),findTestData('TestData').getValue(4,142))

Mobile.takeScreenshot('Screenshot/Search/SuccessSigned.png')

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

Mobile.takeScreenshot('Screenshot/Search/FirstScreen.png')

'Please fill up the following details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,143)]),0),findTestData('TestData').getValue(4,143))

'Property details'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,144)]),0),findTestData('TestData').getValue(4,144))

'is the property a primary market...'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,145)]),0),findTestData('TestData').getValue(4,145))

'select no if a subsale'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,146)]),0),findTestData('TestData').getValue(4,146))

'Property Name'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,147)]),0),findTestData('TestData').getValue(4,147))

'Yes'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Yes']),0),'Yes')

'No'
Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'No']),0),'No')

'Search for property'
Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,148)]),0),findTestData('TestData').getValue(4,148))

if(Choice=='Yes') {
	Mobile.tap(findTestObject('Text',[('Verify'):'Yes']),0)
	
	'tap search property'
	Mobile.tap(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,148)]),0)
	
	Mobile.takeScreenshot('Screenshot/Search/FieldScreen.png')
	
	for(i=148;i<154;i++) {
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,i),0)
	
	'searched is found'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,148)]),0),findTestData('TestData').getValue(5,148))

	}
	for (i=154;i<156;i++) {
		Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,i),0)
		
		Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,148)]),2)
		
		
		}
	'29114-No property found'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,156)]),0),findTestData('TestData').getValue(4,156))
	
	'29114-try searching a different keyword.'	
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,157)]),0),findTestData('TestData').getValue(4,157))
	
	'29114-could the property be a subsale..'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,158)]),0),findTestData('TestData').getValue(4,158))
	
		
	Mobile.tap(findTestObject('ButtonNo',[('No'):1]),0)
	
	'tap < button will clear the field'
	Mobile.verifyEqual(Mobile.getText(findTestObject('InputNo',[('No'):1]),0),'')
		
	'tap X button will take to previous screenm'
	Mobile.tap(findTestObject('ButtonNo',[('No'):2]),0)
	
	'Back to previous screen'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,144)]),0),findTestData('TestData').getValue(4,144))
	
	'tap search' 
	Mobile.tap(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,148)]),0)
	
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,148),0)
	
	Mobile.takeScreenshot('Screenshot/Search/CorrectProperty.png')
	
	'Tap chosen property'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,148)]),0)
	
	'Displayed in 1st field is correct'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,148)]),0),findTestData('TestData').getValue(5,148))
	
	Mobile.tap(findTestObject('ButtonNo',[('No'):4]),0)
	
	Mobile.verifyEqual(Mobile.getText(findTestObject('InputNo',[('No'):1]),0),'')
	
	'tap search'
	Mobile.tap(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,148)]),0)
	
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,148),0)
	
	'Tap chosen property'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,148)]),0)
	
	'Unit Type'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,159)]),0),findTestData('TestData').getValue(4,159))
	
	'Please Select'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'Please Select']),0),'Please Select')
	
	'tap unit type'
	Mobile.tap(findTestObject('Text',[('Verify'):'Please Select']),0)
	
	Mobile.scrollToText(findTestData('TestData').getValue(5,159),FailureHandling.OPTIONAL)
	
	'tap chosen type'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,159)]),0)
	
	'Unit Number'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,160)]),0),findTestData('TestData').getValue(4,160))
	
	'enter unit number'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,161)]),0),findTestData('TestData').getValue(4,161))
	
	'set wrong unit number'
	Mobile.setText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(4,161)]),findTestData('TestData').getValue(5,161),0)
	
	A = Mobile.getText(findTestObject('InputNo',[('No'):2]),0)
	
	Mobile.verifyEqual(A.length(),15)
	
	Mobile.setText(findTestObject('InputNo',[('No'):2]),findTestData('TestData').getValue(5,160),0)
	
	'Property Price'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,162)]),0),findTestData('TestData').getValue(4,162))
	
	'RM 0.00'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):'RM 0.00']),0),'RM 0.00')
	
	'tap Next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'verify still stay same screen'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,160)]),0),findTestData('TestData').getValue(5,160))
	
	Mobile.takeScreenshot('Screenshot/Search/EmptyField.png')
	
	'set wrong amount'
	Mobile.setText(findTestObject('InputNo',[('No'):3]),findTestData('TestData').getValue(5,162),0)
	
	'tap Next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'verify error msg'
	Mobile.verifyEqual(findTestObject('Object Repository/ErrorMsgInputWrong'),'The property price needs to be between^')
	
	Mobile.takeScreenshot('Screenshot/Search/MinAmount.png')
	
	'set correct amount'
	Mobile.setText(findTestObject('InputNo',[('No'):3]),findTestData('TestData').getValue(5,163),0)
	
	'verify input got RM'
	Mobile.verifyEqual(Mobile.getText(findTestObject('InputNo',[('No'):3]),0),findTestData('TestData').getValue(5,164))
	
	'tap Next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'Please fill up the following details'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,143)]),0),findTestData('TestData').getValue(4,143))
	
	'Property details'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,144)]),0),findTestData('TestData').getValue(4,144))
	
	Mobile.takeScreenshot('Screenshot/Search/Editable.png')
	
	'Property Name'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,147)]),0),findTestData('TestData').getValue(4,147))
	
	'Property Price'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,162)]),0),findTestData('TestData').getValue(4,162))
	
	'Tap edit button'
	Mobile.tap(findTestObject('Object Repository/EditNo',[('No'):1]),0)
	
	'verify land previous page'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,148)]),0),findTestData('TestData').getValue(5,148))
	
	Mobile.takeScreenshot('Screenshot/Search/Edit1Works.png')
	
	'tap Next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'Financing Details'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,165)]),0),findTestData('TestData').getValue(4,165))
	
	'Financing Amount'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,166)]),0),findTestData('TestData').getValue(4,166))
	
	'RM 0.00'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,166)]),0),findTestData('TestData').getValue(5,166))
	
	
	'Financing Period'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,167)]),0),findTestData('TestData').getValue(4,167))
	
	'Inclusive of BICC Period'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,169)]),0),findTestData('TestData').getValue(4,169))
	
	'5 Years'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'5 Years']),0),'5 Years')
	
	int Age=findTestData('TestData').getValue(5,171)
	
	MaxPeriod =70 - Age
	
	if(MaxPeriod >=35) {
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):'35 Years']),0),'35 Years')
	
	}else {
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):MaxPeriod+' Years']),0),MaxPeriod+' Years')
	
	}
	'drag slider'
	Mobile.dragAndDrop(findTestObject('ObjectEmpty'),findTestObject('ObjectEmpty'),10)
	
	'Set over limit'
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,170),0)
	
	'tap next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'The financing amt cannot be more than...'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,170)]),0),findTestData('TestData').getValue(4,170))
	
	Mobile.takeScreenshot('Screenshot/Search/OverLimit.png')
	
	'Set <50%'
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,171),0)
	
	'tap next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'Loan amount must be more than 50% of the property price'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,171)]),0),findTestData('TestData').getValue(4,171))
	
	Mobile.takeScreenshot('Screenshot/Search/LessThan50.png')
	
	'Set <10k'
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,172),0)
	
	'tap next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'Loan amount must be at least RM10,000'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,170)]),0),findTestData('TestData').getValue(4,172))
	
	Mobile.takeScreenshot('Screenshot/Search/LessThan10k.png')
	
	'set correct amt'
	Mobile.setText(findTestObject('InputNo',[('No'):1]),findTestData('TestData').getValue(5,168),0)
	
	'Confirm correct format'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,169)]),0),findTestData('TestData').getValue(5,169))
	
	'tap next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	//screen 6
	'Financing Plan'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,173)]),0),findTestData('TestData').getValue(4,173))
	
	'amount is saved'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,169)]),0),findTestData('TestData').getValue(5,169))
	
	'saved period'
	
	Mobile.takeScreenshot('Screenshot/Search/Screen6.png')
	
	'tap edit'
	Mobile.tap(findTestObject('EditNo',[('No'):2]),0)
	
	'Land to previous screen'
	Mobile.verifyElementExist(findTestObject('Input',[('Verify'):findTestData('TestData').getValue(5,172)]),0)
	
	'tap next'
	Mobile.tap(findTestObject('Text',[('Verify'):'Next']),0)
	
	'A recommended financing plan...'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,174)]),0),findTestData('TestData').getValue(4,174))
	
	'Financing Type'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,175)]),0),findTestData('TestData').getValue(4,175))
	
	'Islamic Financing'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,176)]),0),findTestData('TestData').getValue(4,176))
	
	'Conventional Financing'
	Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,178)]),0),findTestData('TestData').getValue(4,178))
	
	'Tap islamic'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,176)]),0)
	
	if(findTestData('TestData').getValue(5,164)<=500000 && findTestData('TestData').getValue(5,103)==0 && findTestData('TestData').getValue(5,173)<0.1)
	{
		'my first home scheme default'
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,176)]),0),findTestData('TestData').getValue(5,176))
		
		Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,176)]),0)
		
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,177)]),0),findTestData('TestData').getValue(5,177))
		
		Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,176)]),0)
		
		Mobile.takeScreenshot('Screenshot/Search/ListofLoan1.png')
		
	} else {
		
		Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,177)]),0),findTestData('TestData').getValue(5,177))
		
		
	}
	
	Mobile.takeScreenshot('Screenshot/Search/Default-i.png')
	
	'tap conventional'
	Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(4,178)]),0)
	
	if(findTestData('TestData').getValue(5,164)<=500000 && findTestData('TestData').getValue(5,103)==0 && findTestData('TestData').getValue(5,173)<0.1)
		{
			'my first home scheme default'
			Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,178)]),0),findTestData('TestData').getValue(5,178))
			
			Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,178)]),0)
			
			Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,179)]),0),findTestData('TestData').getValue(5,179))
			
			Mobile.tap(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,178)]),0)
			
			Mobile.takeScreenshot('Screenshot/Search/ListofLoan2.png')
			
		} else {
			
			Mobile.verifyEqual(Mobile.getText(findTestObject('Text',[('Verify'):findTestData('TestData').getValue(5,179)]),0),findTestData('TestData').getValue(5,179))
			
			
		}
	
		Mobile.takeScreenshot('Screenshot/Search/Default.png')
	
	
}else if(Choice=='No') {
	println('sprint 14B')
	
}









































