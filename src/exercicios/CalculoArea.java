package exercicios;

import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite a Base do Triângulo: ");
			String textoBase = scanner.nextLine().replace(",", ".");
			double base = Double.parseDouble(textoBase);
			
			System.out.println("Digite a Altura do Triângulo: ");
			String textoAltura = scanner.nextLine().replace(",", ".");
			double altura = Double.parseDouble(textoAltura);
			
			double area = (base * altura) / 2;
			System.out.printf("O valor da Área é: %.2f", area);
			
		scanner.close();
	}
}
