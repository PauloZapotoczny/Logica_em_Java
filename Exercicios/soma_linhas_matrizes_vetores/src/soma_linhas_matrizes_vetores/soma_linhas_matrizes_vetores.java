package soma_linhas_matrizes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_linhas_matrizes_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int N = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int M = sc.nextInt();
		
		double[][] mat = new double[N][M];
		double[] vet = new double[N];
		double soma;
		
		for (int i = 0; i < N; i++) {
			soma = 0;
			System.out.printf("Digite os elementos da %da. linha: ", i + 1);
			for (int j = 0; j < M; j++) {
				mat[i][j] = sc.nextDouble();
				soma = soma + mat[i][j];
			}
			vet[i] = soma;
		}
		
		System.out.println("VETOR GERADO: ");
		for (int i = 0; i < N; i++) {
			System.out.println(vet[i]);
		}
		sc.close();
	}

}
