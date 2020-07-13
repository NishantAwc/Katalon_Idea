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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://awcsoftwarenoida.sharepoint.com/sites/Indus/IdeaIncubator')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginPage/Page_Sign in to your account/input_Sign in_loginfmt'), username)

WebUI.click(findTestObject('LoginPage/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setText(findTestObject('LoginPage/Page_Sign in to your account/input_Enter password_passwd'), password)

WebUI.click(findTestObject('LoginPage/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('LoginPage/Page_Sign in to your account/input_concat(Don  t show this again)_idBtn_Back'))

WebUI.verifyElementVisible(findTestObject('HomePage/Page_Home/img_Edit Links_onetidHeadbnnr0'))

