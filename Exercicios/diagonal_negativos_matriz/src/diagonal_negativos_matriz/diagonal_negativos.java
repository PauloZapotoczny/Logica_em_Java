package diagonal_negativos_matriz;

import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		int negativos = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
				
				if (mat[i][j] < 0) {
					negativos = negativos + 1;
				}
			}
		}
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE NEGATIVOS: " + negativos);
		sc.close();
	}

}
