package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	//Testes de soma
	@Test
	public void testeSomar2com3() {
		//Variável de resultado esperado
		int resultadoEsperado = 5;
		
		//Variável de resultado real do cálculo
		int resultadoReal;
		
		//Execução do método a testar
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(2,  3);
		
		//Avaliar o resultado
		assertEquals(resultadoReal, resultadoEsperado);	
		
	}

	@Test
	public void testeSomar5com3() {
		//Variável de resultado esperado
		int resultadoEsperado = 8;
		
		//Variável de resultado real do cálculo
		int resultadoReal;
		
		//Execução do método a testar
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(5,  3);
		
		//Avaliar o resultado
		assertEquals(resultadoReal, resultadoEsperado);	
		
	}
	
	@Test
	public void testeSomar10com3() {
		//Variável de resultado esperado
		int resultadoEsperado = 13;
		
		//Variável de resultado real do cálculo
		int resultadoReal;
		
		//Execução do método a testar
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(10,  3);
		
		//Avaliar o resultado
		assertEquals(resultadoReal, resultadoEsperado);	
		
	}
	
	@Test
	public void testeSubtrair10de15() {
		//Variável de resultado esperado
		int resultadoEsperado = 5;
		
		//Variável de resultado real do cálculo
		int resultadoReal;
		
		//Execução do método a testar
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.subtrair(10,  15);
		
		//Avaliar o resultado
		assertEquals(resultadoReal, resultadoEsperado);	
		
	}
}
