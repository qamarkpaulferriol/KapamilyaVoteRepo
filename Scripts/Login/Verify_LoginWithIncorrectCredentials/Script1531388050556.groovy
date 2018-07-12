import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://dev-vote.abs-cbn.com/login')

WebUI.setText(findTestObject('LoginPage_Objects/input_inputKapamilyaName'), 'dmdqanotvalid')

WebUI.setText(findTestObject('LoginPage_Objects/input_inputPassword'), '!qazxsw2')

WebUI.scrollToElement(findTestObject('LoginPage_Objects/button_LOGIN'), 0)

WebUI.submit(findTestObject('LoginPage_Objects/button_LOGIN'))

WebUI.verifyElementPresent(findTestObject('LoginPage_Objects/p_Invalid Kapamilya Name or Pa'), 0)

WebUI.verifyElementText(findTestObject('LoginPage_Objects/p_Invalid Kapamilya Name or Pa'), 'Invalid Kapamilya Name or Password.')

WebUI.clearText(findTestObject('LoginPage_Objects/input_inputKapamilyaName'))

