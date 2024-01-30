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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.scrollToElement(findTestObject('Register/Register Without Fill First Name/Page_DEMOQA/div_Book Store Application'), 
    0)

WebUI.click(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/div_Book Store Application'))

WebUI.click(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/button_Login'))

WebUI.click(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/button_New User'))

WebUI.setText(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/input_Last Name_lastname'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/input_UserName_userName'), 
    'websitetesting')

WebUI.setText(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/input_Password_password'), 
    '@WebsiteTesting1945')

WebUI.click(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/button_Register'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/input_First Name_firstname'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register/Register Without Fill First Name/Page_DEMOQA/input_First Name_firstname'), 
    0)

WebUI.closeBrowser()

