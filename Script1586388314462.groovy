import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.closeBrowser()

WebUI.openBrowser(GlobalVariable.Application_URL)

WebUI.delay(5)

//WebUI.navigateToUrl(GlobalVariable.Application_URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('WebApp/CRM/Login/CRM_Object Rep/input_Email address_input sfdc'), GlobalVariable.User_Name)

WebUI.setText(findTestObject('WebApp/CRM/Login/CRM_Object Rep/input_Password_input sfdc_pass'), GlobalVariable.Password)

WebUI.click(findTestObject('WebApp/CRM/Login/CRM_Object Rep/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('WebApp/Client_Portal/Login/Page_myMAWER  Mawer Investment Mana/h3_Account Summary'), 
    30)

WebUI.verifyElementPresent(findTestObject('WebApp/Client_Portal/Login/Page_myMAWER  Mawer Investment Mana/h3_Account Summary'), 
    10)

