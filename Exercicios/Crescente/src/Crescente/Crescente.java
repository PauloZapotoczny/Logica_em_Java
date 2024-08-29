package Crescente;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		do {
			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > y){
				System.out.println("Decrescente!");
			} else if (x < y){
				System.out.println("Crescente!");
			}
		} while (x != y);
		
		sc.close();
	}

}
