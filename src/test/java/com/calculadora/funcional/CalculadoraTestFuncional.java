package com.calculadora.funcional;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculadoraTestFuncional {
	@Test
	public void testFuncionalCerto() throws InterruptedException, MalformedURLException {
		//instanciando o webdrive
		DesiredCapabilities cap =  DesiredCapabilities.chrome();
		//esse ip é do meu pc
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entrar no site
		driver.navigate().to("http://192.168.0.101:8001/index/");
		driver.findElement(By.id("cinco")).click();
		driver.findElement(By.id("soma")).click();
		
		driver.findElement(By.id("cinco")).click();
		
		driver.findElement(By.id("igual")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("visor"));
		String resultado = element.getAttribute("value");
		
		System.out.println(resultado);
		
		assertEquals("10", resultado);
	}
}