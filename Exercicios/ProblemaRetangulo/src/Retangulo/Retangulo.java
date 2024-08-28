package Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Base do retangulo: ");
		double B = sc.nextInt();
		System.out.print("Altura do retangulo: ");
		double A = sc.nextInt();
		
		double area = A * B;
		double perimetro = (A * 2) + (B * 2);
		double formula = Math.pow(A, 2) + Math.pow(B, 2);
		double diagonal = Math.sqrt(formula);
		
		System.out.println("AREA = "+ area);
		System.out.println("PERIMETRO = "+ perimetro);
		System.out.println("DIAGONAL = "+ String.format("%.4f", diagonal));
		
		sc.close();
	}

}
