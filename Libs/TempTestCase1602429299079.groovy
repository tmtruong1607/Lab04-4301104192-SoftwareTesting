import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\tmtru\\AppData\\Local\\Temp\\Katalon\\20201011_221459\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://online.hcmue.edu.vn/\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/a_ng nhp\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7\'), \n    \'43.01.104.193\')\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5\'), \n    \'yHNXnAiDau/sbxDLwMGHaw==\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp _ctl00ContentPlaceHolde_c71575\'))\n\nWebUI.waitForElementPresent(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td_Mt m truy cp khng chnh xc\'), \n    30)\n\nWebUI.verifyElementText(findTestObject(\'Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td_Mt m truy cp khng chnh xc\'), \n    \'M\u1EADt m\u00E3 truy c\u1EADp kh\u00F4ng ch\u00EDnh x\u00E1c.\')\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

