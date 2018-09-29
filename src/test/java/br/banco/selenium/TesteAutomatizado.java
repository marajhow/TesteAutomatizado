package br.banco.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {
	
	@Test
	public void testeSelenium() {
		
		/*  ---------------
		 * | ADICIONA USER |
		    ---------------
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/rafael.garcia/Documents/RafaelGarcia/FIB/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.4.103:8080/correntista/lista");
		/*driver.findElement(By.linkText("Add Correntista")).click();
		driver.findElement(By.id("nome")).sendKeys("Rafael Garcia");
		driver.findElement(By.id("email")).sendKeys("rafael.garcia@agroterenas.com.br");		
		WebElement campoDeTexto = driver.findElement(By.id("button1"));
		campoDeTexto.submit(); */
		
		/*  ---------------
		 * | LOCALIZA EMAIL |
		    ---------------
		 */
		boolean achouEmail = driver.getPageSource().contains("rafael.garcia@agroterenas.com.br");
				assertTrue(achouEmail);
		
	
	}
	
}
