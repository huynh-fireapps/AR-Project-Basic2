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
import com.google.gson.Gson
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.network.ProxyInformation
import com.kms.katalon.core.network.ProxyOption
import com.kms.katalon.core.network.ProxyServerType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Proxy
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory
println DriverFactory.getChromeDriverPath()
// "C:\\Users\\huynh\\Documents\\Socialhead\\Automation\\Katalon_Studio_Windows_64-8.5.5\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe"
System.setProperty("webdriver.chrome.driver",DriverFactory.getChromeDriverPath());
println  System.getProperty('user.dir')
println DriverFactory.getChromeDriverPath()
ChromeOptions options = new ChromeOptions()
options.addExtensions(new File("C:\\Users\\huynh\\Desktop\\proxy.crx"))
DesiredCapabilities capabilities = new DesiredCapabilities()
capabilities.setCapability(ChromeOptions.CAPABILITY, options)
WebDriver driver = new ChromeDriver(capabilities)
DriverFactory.changeWebDriver(driver)
//WebUI.navigateToUrl('https://whoer.net')
//ProxyInformation proxy = RunConfiguration.getProxyInformation()
//println(proxy)
//
//// Switch proxy
//proxy.setProxyOption(ProxyOption.MANUAL_CONFIG.name())
//proxy.setProxyServerAddress("alireviews-proxy-ae-lv2.firegroup.io")
//proxy.setProxyServerPort(8080)
//proxy.setPassword("TbId5uZ8oScQdv3ar6rN")
//proxy.setUsername("alireviewsaelv2")
//Map<String, Object> generalProperties = RunConfiguration.getExecutionGeneralProperties();
//generalProperties.put(RunConfiguration.PROXY_PROPERTY, new Gson().toJson(proxy));
//println proxy
//WebUI.openBrowser('https://whoer.net')
//WebUI.takeScreenshot()