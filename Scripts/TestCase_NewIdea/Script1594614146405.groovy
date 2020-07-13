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

WebUI.click(findTestObject('HomePage/Page_Home (1)/span_Have an Idea SUBMIT HERE'))

WebUI.switchToWindowTitle('NewIdea')

WebUI.selectOptionByValue(findTestObject('NewIdeaPage/Page_NewIdea/select_--Select Theme--Cost LeadershipCusto_b78f32'), 
    Theme, true)

WebUI.setText(findTestObject('NewIdeaPage/Page_NewIdea/textarea_Characters  1500Text should be min_cc5bf1'), 'jdhjdhsjdhsdjhsjdhdhhjsdhsjdhshdjsdhsdjdhsjdhsdjsjdhj')

WebUI.selectOptionByValue(findTestObject('Object Repository/NewIdeaPage/Page_NewIdea/select_--Select Function Type--AcquisitionD_a37637'), 
    FunctionType, true)

WebUI.setText(findTestObject('Object Repository/NewIdeaPage/Page_NewIdea/textarea_Characters  1500Text should be min_a388de'), 
    'jjsnxhschsjhjssjsjsjshjsdsjsjjssjjsjsjsjjsjjssjsjsjjs')

WebUI.selectOptionByValue(findTestObject('Object Repository/NewIdeaPage/Page_NewIdea/select_--Select Process Name--ABC Classific_fbdab7'), 
    Processname, true)

WebUI.click(findTestObject('Object Repository/NewIdeaPage/Page_NewIdea/button_Submit Idea'))

WebUI.verifyMatch('Your idea has been submitted successfully!!!', 'Your idea has been submitted successfully!!!', false)

WebUI.click(findTestObject('Object Repository/NewIdeaPage/Page_NewIdea/button_Close'))

WebUI.closeBrowser()

