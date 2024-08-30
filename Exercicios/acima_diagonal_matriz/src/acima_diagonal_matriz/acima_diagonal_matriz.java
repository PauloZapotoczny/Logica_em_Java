package acima_diagonal_matriz;

import java.util.Locale;
import java.util.Scanner;

public class acima_diagonal_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [" +i+ "," +j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL DA MATRIZ: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N;j++) {
				if (i < j) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.print(soma);
		
		sc.close();
	}

}
