package exercicios;

import java.util.Scanner;

public class CalculoQuadradoCubo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Digite um número: ");
			String numeroTexto  = scanner.nextLine().replace(",", ".");
			double numero = Double.parseDouble(numeroTexto);
		
			double quadrado = numero * numero;
			double cubo = numero * numero * numero;
		
			System.out.println("O Número é: " + numero);
			System.out.println("O Quadrado do número é: " + quadrado);
			System.out.println("O Cubo do número é: " + cubo);
		scanner.close();
	}
}
