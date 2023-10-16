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



class negative_checkoutwithoutinputform {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I search url saucedemo")
	def I_search_url_saucedemo() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
	}

	@When("I input5 (.*) and (.*)")
	def I_input_uname_and_pw(String username,password) {
		WebUI.setText(findTestObject('locator/inputUsername'), username)
		WebUI.setText(findTestObject('locator/inputPassword'), password)
	}

	@And("I login with valid account")
	def I_login_with_valid_account() {
		WebUI.click(findTestObject('Object Repository/locator/btnLogin'))
		WebUI.delay(3)
	}
	@Then("I checkout without input form")
	def I_checkout_without_input_form() {
		WebUI.click(findTestObject('locator/btnAddToCart'))
		WebUI.delay(3)
		WebUI.click(findTestObject('locator/iconCart'))
		WebUI.delay(3)
		WebUI.click(findTestObject('locator/btnCheckout'))
		WebUI.delay(3)
		WebUI.click(findTestObject('locator/btnContinueCheckout'))
		WebUI.check(findTestObject('locator/alertError'))
		WebUI.delay(1)
		WebUI.closeBrowser()
	}
}