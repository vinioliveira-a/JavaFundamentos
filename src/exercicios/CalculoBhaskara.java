package exercicios;

import java.util.Scanner;

public class CalculoBhaskara {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o valor de a: ");
			String textoA = scanner.nextLine().replace(",", ".");
			double a = Double.parseDouble(textoA);
		
			System.out.println("Digite o valor de b: ");
			String textoB = scanner.nextLine().replace(",", ".");
			double b = Double.parseDouble(textoB);
		
			System.out.println("Digite o valor de c: ");
			String textoC = scanner.nextLine().replace(",", ".");
			double c = Double.parseDouble(textoC);
		
			double delta = (b * b) - (4 * a * c);
			System.out.println("O delta é: " + delta);

			if (delta < 0) {
			    System.out.println("Não há raízes reais!");
			} else {
			    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			    System.out.println("X1 = " + x1);
			    System.out.println("X2 = " + x2);
			}
		
		scanner.close();
	}
}
