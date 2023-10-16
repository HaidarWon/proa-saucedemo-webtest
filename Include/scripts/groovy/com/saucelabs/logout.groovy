package com.saucelabs
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class logout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I visit url")
	def I_visit_url() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
	}

	@When("I input2 (.*) and (.*)")
	def I_input_username_password(String username,password) {
		WebUI.setText(findTestObject('locator/inputUsername'), username)
		WebUI.setText(findTestObject('locator/inputPassword'), password)
	}

	@And("I click login")
	def I_click_login() {
		WebUI.click(findTestObject('Object Repository/locator/btnLogin'))
		WebUI.delay(5)
	}
	@Then("I logout account")
	def I_logout_account() {
		WebUI.click(findTestObject('locator/btnOpenMenu'))
		WebUI.delay(3)
		WebUI.click(findTestObject('locator/a_Logout'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}