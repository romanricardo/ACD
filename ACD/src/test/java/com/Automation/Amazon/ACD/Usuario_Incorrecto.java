package com.Automation.Amazon.ACD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Usuario_Incorrecto {
	
	// creo el test de prueba usuario incorrecto, utilizando los metodos que cree en la clase AmazonPage
	
	private WebDriver driver;
	
	AmazonPage Amazon_Page; 

	//seteo el driver y la coneccion con la pagina
	@Before
	public void setUp() throws Exception {
		
		Amazon_Page = new AmazonPage(driver);
		driver = Amazon_Page.chromeDriverConnection();
		Amazon_Page.visit("https://www.amazon.com/");
	}

	//seteo el driver y la coneccion con la pagina
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	//acciones que voy a estar utilizando en este caso de prueba
	@Test
	public void test() throws InterruptedException {
		Amazon_Page.carrito_compra();
		Amazon_Page.identificar();
		Amazon_Page.campo_usuario();
		Amazon_Page.seProdujoUnError();
		
		}

}
