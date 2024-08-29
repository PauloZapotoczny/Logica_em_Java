package maior_elemento_da_linha_matriz;

import java.util.Locale;
import java.util.Scanner;

public class maior_elemento_linha_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		int maior;
		int[][] mat = new int[N][N];
		int[] maiorLinha = new int[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (int i = 0; i < N; i++) {
			maior = mat[i][0];
			for (int j = 0; j < N; j++) {
				if (maior < mat[i][j]) {
					maior = mat[i][j];
				}
			}
			maiorLinha[i] = maior;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(maiorLinha[i]);
		}
		
		sc.close();
	}

}
