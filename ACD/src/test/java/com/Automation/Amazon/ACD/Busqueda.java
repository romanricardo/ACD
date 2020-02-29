package com.Automation.Amazon.ACD;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Busqueda {
	
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
		Amazon_Page.search();
		
		Amazon_Page.boton2();
		
		List<WebElement> img3 =driver.findElements(By.xpath("//img[@class=\"s-image\"]")); //I select the third item in the list
		
		WebElement img4 = img3.get(2); //I rename the third element to be able to click on the
		img4.click();//	I click on the third element
		
		Amazon_Page.thirdElement();
	}

}
