package exercicios;

public class ConversaoCelsius {
	public static void main(String[] args) {
		//Fórmula para o cálculo: (°F - 32) x 5/9 = °C
		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		double fahrenheit = 80.6;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.printf("O resultado da conversão é: %.2f", celsius);
	}
}
