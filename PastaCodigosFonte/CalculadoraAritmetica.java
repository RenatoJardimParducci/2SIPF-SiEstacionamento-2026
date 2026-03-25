package FontesAppCalculadora;

//Calculadora aritmética com operações fundamentais
public class CalculadoraAritmetica {
	
	//Atributo com o resultado das operações
	int resultado;

	//Métodos de cálculo
	public int somar(int parametro1, int parametro2) {
		resultado = parametro1 + parametro2;
		return resultado;
	}
	
	public int subtrair(int parametro1, int parametro2) {
		resultado = parametro2 - parametro1;
		return resultado;
	}
	
	public int multiplicar(int parametro1, int parametro2) {
		resultado = parametro1 * parametro2;
		return resultado;
	}
	
	public int dividir(int parametro1, int parametro2) {
		resultado = parametro1 / parametro2;
		return resultado;
	}
}
