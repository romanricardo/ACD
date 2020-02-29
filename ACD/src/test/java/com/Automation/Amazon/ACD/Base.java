package com.Automation.Amazon.ACD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	private WebDriver driver; //Declaro el objeto web driver
	
	public Base(WebDriver driver) { //Creo el constructor de la clase
		this.driver = driver;
		
	}
	
	// Utilizo la libreria bonigarcia para evitar problemas de versionados entre los drivers descargados y la version de Chrome
	public WebDriver chromeDriverConnection() { // creo el metodo para la conexion con chrome
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 
		
		return driver;
	}
	
	public WebElement findElement(By locator) { 
		
		return driver.findElement(locator);
	}
	
	public String getText(WebElement element) {//para que devuelva el texto del elemento que le estoy pasando como parametro
		return element.getText();
	}
	
	
	public String getText(By locator) {// devuelve el texto del elemento que estoy buscando a traves de este localizador
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) { // Busco un elemento (campo de busqueda) y escrivo en él
		
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) { // creo el metodo clic
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) { //Busca si el elemento esta disponible
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void submit(By locator){ //enviar informacion
		driver.findElement(locator).submit();
	}
	
	public void visit(String url) {// ir a la url
		driver.get(url);
		driver.manage().window().maximize(); 
	}
	
	
	
	
}
