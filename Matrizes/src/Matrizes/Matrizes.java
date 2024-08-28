package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N;
		System.out.print("Quantas linhas a matriz tera? ");
		M = sc.nextInt();
		System.out.print("Quantas colunas a matriz tera? ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i = 0;i < M; i++) {
			for (int j = 0;j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("");
		System.out.println("Matriz Gerada: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
