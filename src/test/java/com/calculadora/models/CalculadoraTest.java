package com.calculadora.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	private Calculadora calc;
	
	
	@Test
	public void calcTest() {
		calc=new Calculadora();
		assertEquals(calc.somar(5,5),10);
	}
	
}
