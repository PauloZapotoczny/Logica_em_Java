package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.print("Quantos numeros serão digitados: ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		double soma = 0, media;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < N; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		
		System.out.print("Soma: " + soma);
		System.out.println();
		media = soma / N;
		System.out.print("Media: " + media);
		
		
		sc.close();
	}

}
