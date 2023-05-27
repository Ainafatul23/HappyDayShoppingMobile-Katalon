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

Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu/Flash Sale - Button'), 0)

Mobile.verifyElementText(findTestObject('Flash Sale - Catalog/Flash Sale - Text Menu'), 'Flash Sale')

Mobile.tap(findTestObject('Flash Sale - Catalog/Search - Button'), 0)

Mobile.verifyElementText(findTestObject('Flash Sale - Catalog/Search in Flash Sale - Field'), 'Search in Flash Sale')

Mobile.tap(findTestObject('Flash Sale - Catalog/X search - Button'), 0)

Mobile.tap(findTestObject('Flash Sale - Catalog/Search - Button'), 0)

Mobile.setText(findTestObject('Flash Sale - Catalog/Search in Flash Sale - Field'), '\\n', 0)

Mobile.verifyElementText(findTestObject('Flash Sale - Catalog/Search in Flash Sale - Field'), 'Nothing entered')

Mobile.setText(findTestObject('Flash Sale - Catalog/Search in Flash Sale - Field'), 'Extraderm\\n', 10)

Mobile.verifyElementText(findTestObject('Flash Sale - Catalog/Search Result - items found'), '8 items found')

