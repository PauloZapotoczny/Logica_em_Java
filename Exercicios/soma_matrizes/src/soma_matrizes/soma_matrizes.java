package soma_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class soma_matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vao ter cada matriz? ");
		int N = sc.nextInt();
		System.out.print("Quantas colunas vao ter cada matriz? ");
		int M = sc.nextInt();
		
		int[][] mat1 = new int[N][M];
		int[][] mat2 = new int[N][M];
		
		System.out.println("Digite os valores da matriz A: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat2[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		System.out.println("SOMA DAS MATRIZES: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				soma = mat1[i][j] + mat2[i][j];
				System.out.print(soma + " ");
				soma = 0;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
