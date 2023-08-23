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

Mobile.startExistingApplication('com.salesforce.chatter', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Button Tres Puntitos'), 10)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Tres Puntitos'), 3)

Mobile.tap(findTestObject('Prueba Lead/Button Cambiar Servidor'), 0)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Agregar nueva conexion'), 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Nombre Conexion'), 'Prueba', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input URL conexion'), 'https://app-site-6008.my.salesforce.com/', 3)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Aplicar conexion'), 3)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Atras'), 3)

Thread.sleep(4000)

Mobile.setText(findTestObject('Prueba Lead/Input Usuario'), 'richard.lopez-fvk0@force.com', 3)

Mobile.setText(findTestObject('Prueba Lead/Input Password'), 'Ecosistemas123', 3)

Mobile.tap(findTestObject('Prueba Lead/Button Login'), 0)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Button Permitir'), 10)

Mobile.tap(findTestObject('Prueba Lead/Button Permitir'), 0)

Thread.sleep(2000)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Button Nuevo Lead'), 10)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Nuevo Lead'), 3)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Combo Nombre Completo'), 10)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Combo Nombre Completo'), 0)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Opcion Mr. nombre completo'), 10)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Opcion Mr. nombre completo'), 0)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Nombre'), 'Juan Cruz ', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Segundo Nombre'), 'Prueba', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Apellido'), 'Mouhape', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Cargo'), 'QA Automation', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input correo electronico'), 'pruebaautomatizada@gmail.com', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input telefono'), '1112133221', 3)

Mobile.setText(findTestObject('Prueba Lead/Input compañia'), 'Ecosistemas SRL', 3)

Mobile.setText(findTestObject('Prueba Lead/Input calle'), 'Pasaje San Luis 252', 3)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Codigo Postal'), '7000', 0)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Ciudad'), 'Tandil', 0)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Estado Provincia'), 'Buenos Aires', 0)

Mobile.setText(findTestObject('Object Repository/Prueba Lead/Input Pais'), 'Argentina', 0)

Mobile.tap(findTestObject('Object Repository/Prueba Lead/Button Guardar'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Prueba Lead/Lead dado de Alta'), 5)

Mobile.verifyElementVisible(findTestObject('Prueba Lead/Lead dado de Alta'), 0)

String nombreApellido = Mobile.getText(findTestObject('Object Repository/Prueba Lead/Lead dado de Alta'), 
    0)

String cargo = Mobile.getText(findTestObject('Object Repository/Prueba Lead/Lead Cargo dado de alta'), 0)

Mobile.verifyMatch(nombreApellido, 'Juan Cruz Prueba Mouhape', false)

Mobile.verifyMatch(cargo, 'Cargo: QA Automation', false)

Mobile.closeApplication()

