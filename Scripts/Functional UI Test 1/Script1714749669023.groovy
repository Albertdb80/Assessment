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

WebUI.navigateToUrl('https://www.kurtosys.com/')

WebUI.click(findTestObject('Object Repository/Page_Kurtosys  Pain-free Investment Data An_35cf6d/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Page_Kurtosys  Pain-free Investment Data An_35cf6d/div_Insights'))

WebUI.click(findTestObject('Object Repository/Page_Kurtosys Resources For The Asset Manag_0af750/a_White papers'))

WebUI.switchToWindowTitle('White Papers | Kurtosys')

'\r\n'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_White Papers  Kurtosys/h2_White Papers'), 0)

'Verify Title reads “White Papers”'
WebUI.verifyElementText(findTestObject('Object Repository/Page_White Papers  Kurtosys/h2_White Papers'), 'White Papers')

WebUI.click(findTestObject('Object Repository/Page_White Papers  Kurtosys/a_UCITS White Paper'))

WebUI.setText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/input_First Name_18882_231669pi_18882_231669'), 
    'Albert')

WebUI.setText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/input_First Name_18882_231671pi_18882_231671'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/input_Email_18882_231675pi_18882_231675'), 
    'Test Inc')

WebUI.setText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/input_Company_18882_231677pi_18882_231677'), 
    'Sales')

WebUI.click(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/input_submit'))

'Validate all error messages'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/p_Please correct the errors below'))

'Validate all error messages'
WebUI.verifyElementText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/p_Please correct the errors below'), 
    'Please correct the errors below:')

'Validate all error messages'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/p_This field is required'))

'Validate all error messages'
WebUI.verifyElementText(findTestObject('Object Repository/Page_UCITS White Paper  Kurtosys/p_This field is required'), 'This field is required.')

