package com.my.keywords.android

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling









public class scrollNew {
	static void text(String Text) {
		
		if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {
		
		while(Mobile.verifyElementNotExist(findTestObject('Text',[('Verify'):Text]),3,FailureHandling.OPTIONAL)) {

			Mobile.swipe(Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*2/3,Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*1/3)
		}
		}
	}
}