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
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.WebDriver as WebDriver
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptException
TestObject btn_charge = findTestObject('Object Repository/Alireview/btn_charge_plan_essential')

baselineDir = System.getProperty('user.dir') + "\\Baseline"
screenshotDir = RunConfiguration.getProjectDir() + "\\Screenshots"
	 CustomKeywords.'shopify.store.loginToStoreAdmin'(GlobalVariable.partner_email,GlobalVariable.partner_password, store_name)
	 CustomKeywords.'shopify.store.clickOnShopifyUserCard'()
	 WebUI.navigateToUrl("https://admin.shopify.com/store/"+store_name+"/apps/ali-reviews-staging/pricing")
	 
	 CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot'('fullpage_screen_huy.png', FailureHandling.OPTIONAL)
	 WebUI.switchToFrame(findTestObject('Object Repository/Alireview/iframe_app'), 1)
	 WebUI.click(findTestObject('Object Repository/Alireview/btn_charge_plan_premium'))
	 CustomKeywords.'shopify.store.clickOnShopifyUserCard'()
	 WebUI.delay(5)
	 WebUI.click(findTestObject('Object Repository/Shopify Store/span_approve_charge'))
	 WebUI.delay(10)
	 
	// WebUI.navigateToUrl("https://admin.shopify.com/store/huynh-ar-uat-6001/themes/145699733808?key=layout%2Ftheme.liquid")
	 //WebUI.switchToDefaultContent()
	 
	 //WebUI.switchToFrame(findTestObject('Object Repository/Shopify Store/iframe_online_store'), 1)
	// WebUI.click(findTestObject('Object Repository/Shopify Theme Editor/btn_theme_liquid'))
	// WebUI.sendKeys(findTestObject('Object Repository/Shopify Theme Editor/btn_theme_liquid'), Keys.chord(Keys.CONTROL, 'F'))
