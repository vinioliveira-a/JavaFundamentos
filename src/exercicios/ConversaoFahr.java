package exercicios;

public class ConversaoFahr {
	public static void main(String[] args) {
		//Fórmula para o cálculo: (°C × 9/5) + 32 = 32 °F
		final int AJUSTE = 32;
		final double FATOR = 9.0 /5.0;
		double celsius = 126;
				
		double fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.printf("O resultado da conversão é: %.2f", fahrenheit);
	}
}
