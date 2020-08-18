package com.calculadora.cucumber;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SomaTeste {
	private WebDriver driver = null;
	
	@Before
	public void setUp() throws Exception {
		driver= new ChromeDriver();
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	
	@Given("^Eu abri o site \"(.*?)\"$")
	public void eu_abri_o_site(String site) throws Exception{
		driver= new ChromeDriver();
		driver.navigate().to(site);
	}
	/*
	 * Feature: SomaTeste

	Scenario: somar dois números e verificar se está certo
	Given Eu abri o site "http://localhost:8002/index" 
        When eu clico em "cinco"
        When eu clico em "soma"
        When eu clico em "cinco"
        And eu clico em "igual"
        Then "10" deve ser igual a "10"       
	 * */
	
	@When("^eu clico em \"(.*?)\"$")
	public void clicar(String botao) {
		driver.findElement(By.id(botao)).click();
	}
	
	@Then("^\"(.*?)\" deve ser igual a \"(.*?)\"$")
	public void resultado(String input, String output){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("visor"));
		String resultado = element.getAttribute("value");
		assertThat(output).isEqualTo(resultado);
	}
	
}
