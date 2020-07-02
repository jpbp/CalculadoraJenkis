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
		//********************ip fixo do servidor, docker selenuim ***************************
		WebDriver driver = new RemoteWebDriver(new URL("http://177.105.35.42:4444/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entrar no site
		//********************ip fixo do server docker do ngnix att ***************************
		System.out.println("aqui1");
		driver.navigate().to("https://www.google.com/");
		
		driver.quit();
	}
}
