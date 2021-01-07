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

// Uruchomienie przeglądarki z adresem aplikacji DemoBank
WebUI.openBrowser(rawUrl=GlobalVariable.URL)
// Zmiana rozmiaru przegladarki
WebUI.maximizeWindow()
// Wprowadzenie Login
WebUI.click(findTestObject('Object Repository/PageLogin/Btn_Login'))
// wprowadza tekst
WebUI.setText(findTestObject('Object Repository/PageLogin/Input_email'), GlobalVariable.LoginID)
//hasło
WebUI.setEncryptedText(findTestObject('Object Repository/PageLogin/Input_login_password'),GlobalVariable.pwd)
// Kliknecie przycisku

WebUI.click(findTestObject('Object Repository/PageLogin/Btn_singIn'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/PageAccount/btn_expand'))

WebUI.click(findTestObject('Object Repository/PageAccount/btn_profile'))

WebUI.click(findTestObject('Object Repository/PageAccount/btn_male')) 

WebUI.setText(findTestObject('Object Repository/PageAccount/btn_about'), 'Marek Faryniarz -- Testowanie Oprogramowania')
WebUI.click(findTestObject('Object Repository/PageAccount/btn_pet'))
WebUI.setText(findTestObject('Object Repository/PageAccount/btn_test_flight_email'), 'flight@email.com')
WebUI.setText(findTestObject('Object Repository/PageAccount/btn_google_play_email'), 'google@email.com')
WebUI.click(findTestObject('Object Repository/PageAccount/btn_save'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PageAccount/btn_out'))
WebUI.delay(3)




WebUI.closeBrowser();
