package exercicios;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o seu peso: ");
			String pesoTexto  = scanner.nextLine().replace(",", ".");
			double peso = Double.parseDouble(pesoTexto);
			 	
			System.out.println("Digite o sua altura: ");
			String alturaTexto = scanner.nextLine().replace(",", ".");
			double altura = Double.parseDouble(alturaTexto);
			
			double imc = peso / (altura * altura);
			System.out.printf("Seu imc é: %.2f", imc);
			
		scanner.close();
	}
}
