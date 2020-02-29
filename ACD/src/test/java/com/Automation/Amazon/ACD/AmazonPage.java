package com.Automation.Amazon.ACD;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage extends Base{
	
	
	// En esta clase declaro los ojetos, los encuentro, y realizo acciones sobre ellos
	
	private WebDriver driver;

	By searchbox = By.id("twotabsearchtextbox"); 
	
	By btn2 = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[8]/div/span/div/div/ul/li[3]/a"); 
	
	By buyElement =  By.id("submit.buy-now-announce");
	
	By carrito =  By.id("nav-cart"); 
	
	By identificate = By.linkText("Identifícate");
	
	By usuario = By.name("email");
	
	By error = By.xpath("*//h4[text()='Se produjo un problema']");

	public AmazonPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void search() throws InterruptedException {
		Thread.sleep(2000);
		
		if(isDisplayed(searchbox)) {
			
			type("Football", searchbox);
			
			submit(searchbox);
		}
		else {
			System.out.println("No se encontro la pagina Amazon");
		}
	}
	
	public void boton2() {
		
		if(isDisplayed(btn2)) {
			click(btn2);
		}
		else {
			System.out.println("No se pudo hacer clic en el boton 2");
		}
	}
	
	public void thirdElement() {
		
		if(isDisplayed(buyElement)) {
			//System.out.println("Se encontro el elemento carrito buyElement");
		}
		else {
			System.out.println("NO Se encontro el elemento carrito buyElement");
		}
	}
	
	public void carrito_compra() {
		
		if(isDisplayed(carrito)) {
			click(carrito);
		}
		else {
			System.out.println("NO Se encontro el elemento carrito");
		}
	}
	
	
	public void identificar() throws InterruptedException {
		Thread.sleep(2000);
		
		if(isDisplayed(identificate)) {
			click(identificate);
		}
		else {
			System.out.println("NO Se encontro el elemento identifícate");
		}
	}
	
	public void campo_usuario() {
				
		if(isDisplayed(usuario)) {
			type("UsuarioIncorrecto", usuario);
			
			submit(usuario);
		}
		else {
			System.out.println("NO Se encontro el elemento usuario");
		}
	}
	
	public void seProdujoUnError() throws InterruptedException {
		Thread.sleep(2000);
		if(isDisplayed(error)) {
			String Texto = getText(error);
			String Texto2 = "Se produjo un problema";
			
			//System.out.println("Encontr el elemento: " + Texto);
			assertEquals(Texto,Texto2);
			}
		else {
			System.out.println("NO Se encontro el elemento usuario");
		}
	}
	

}
