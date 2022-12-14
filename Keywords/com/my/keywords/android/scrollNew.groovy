package com.my.keywords.android
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

public class scrollNew {
	static void textDown(String Text) {

		if (Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {

			int i=1
			while(Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),1,FailureHandling.OPTIONAL)) {

				int X = Mobile.getDeviceWidth()/2
				int Y1 = Mobile.getDeviceHeight()*4/5
				int Y2 = Mobile.getDeviceHeight()*1/5
				Mobile.swipe(X,Y1,X,Y2)

				i++
				if(i==50) {
					println('Text not found')
					break
				}
			}
		}
	}

	static void textDownSmall(String Text) {

		if (Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {

			int i=1
			while(Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),1,FailureHandling.OPTIONAL)) {

				int X = Mobile.getDeviceWidth()/2
				//						int Y1 = Mobile.getDeviceHeight()*4/5
				//						int Y2 = Mobile.getDeviceHeight()*1/5
				Mobile.swipe(X,2000,X,1600)

				i++
				if(i==500) {
					println('Text not found')
					break
				}
			}
		}
	}


	static void textUp(String Text){

		if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {

			int i=1
			while(Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {

				Mobile.swipe(Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*1/3,Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*2/3)

				i++
				if(i==50) {
					println('Text not found')
					break
				}
			}
		}
	}
}