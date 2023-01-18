package br.ce.wcaquino.servicos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ce.wcaquino.exception.NaoPodeDividirPorZeroException;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;
		calc = new Calculadora();
		
		// ação
		int resultado = calc.somar(a,b);
		
		
		// verificação
		assertEquals(8, resultado);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		// cenario
		int a = 8;
		int b = 5;
		calc = new Calculadora();
		
		// ação
		int resultado = calc.subtrair(a,b);
		
		
		// verificação
		assertEquals(3, resultado);
	}
	
	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		// cenario
		int a = 6;
		int b = 3;
		calc = new Calculadora();
		
		// ação
		int resultado = calc.dividir(a,b);
		
		// verificação
		assertEquals(2, resultado);
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		// cenario
		int a = 10;
		int b = 0;
		calc = new Calculadora();
		
		// ação
		int resultado = calc.dividir(a,b);
		
		// verificação
		
	}

}
