package ultimo_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ultimo_matrizes {

	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Qual a ordem da matriz? ");
				int N = sc.nextInt();
				
				double[][] mat = new double[N][N];
				
				double soma = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						System.out.print("Elemento ["+i+","+j+"]: ");
						mat[i][j] = sc.nextDouble();
						if (mat[i][j] > 0) {
							soma = soma + mat[i][j];
						}
					}
				}
				System.out.println();
				System.out.print("SOMA DOS POSITIVOS: " + soma);
				System.out.println();
				
				int linha;
				System.out.print("Escolha uma linha: ");
				linha = sc.nextInt();
				System.out.println();
				System.out.print("Linha escolhida: ");
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (linha == i) {
							System.out.print(mat[i][j] + " ");
						}
					}
				}
				
				System.out.println();
				int coluna;
				System.out.print("Escolha uma coluna: ");
				coluna = sc.nextInt();
				System.out.println();
				System.out.print("Coluna escolhida: ");
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (coluna == j) {
							System.out.print(mat[i][j] + " ");
						}
					}
				}
				System.out.println();
				System.out.print("Diagonal principal: ");
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (i == j) {
							System.out.print(mat[i][j] + " ");
						}
					}
				}
				
				System.out.println();
				System.out.println("MATRIZ ALTERADA: ");
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (mat[i][j] < 0) {
							mat[i][j] = Math.pow(mat[i][j], 2);
						}
					}
				}
				
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						System.out.print(mat[i][j] + " ");
						}
					System.out.println();
					}
				
				sc.close();
				}
				
	}

