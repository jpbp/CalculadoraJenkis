package com.calculadora.unitario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculadora.models.Calculadora;

public class CalculadoraTest {

	private Calculadora calc;
	
	
	@Test
	public void calcTest() {
		calc=new Calculadora();
		assertEquals(calc.somar(5,5),10);
	}
	
}
