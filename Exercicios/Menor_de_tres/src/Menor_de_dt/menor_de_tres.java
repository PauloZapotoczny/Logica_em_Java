package Menor_de_dt;

import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, menor;
		
		System.out.print("Primeiro valor: ");
		x = sc.nextInt();
		System.out.print("Segundo valor: ");
		y = sc.nextInt();		
		System.out.print("Terceiro valor: ");
		z = sc.nextInt();
		
		if (x < z && x < y){
			menor = x;
		} else if (y < z) {
			menor = y;
		} else {
			menor = z;
		}
		
		System.out.println("Menor numero dos tres = "+ menor);
		
		sc.close();
	}

}
