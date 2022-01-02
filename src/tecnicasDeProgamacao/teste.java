package tecnicasDeProgamacao;

import java.util.Arrays;

public class teste {
	
	public static void popularVetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 150) - 30);
		}
	}
	
	public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
	
	public static void fibonacciVetor(int vetor []) {
		
		int vetorFibonacci[] = new int [20];
		boolean ehFibonacci = false;
		
		for (int i = 0; i < 20; i++) {
			vetorFibonacci[i] = fibo(i);
		}
		
		System.out.println("Números de Fibonacci:");
		for (int i = 0; i < vetor.length; i++) {
			int valorAnalisado = vetor[i];
			for (int j = 0; j < vetorFibonacci.length; j++) {
				if(vetorFibonacci[j] == valorAnalisado) {
					System.out.println(vetor[i]+" ");
					ehFibonacci = true;
				}
			}
		}
		
		if(!ehFibonacci) {
			System.out.println("Não há números de Fibonacci nesse vetor!");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		popularVetor(vetor);

		System.out.println("O nosso vetor principal é:"+ Arrays.toString(vetor));
		
		fibonacciVetor(vetor);
		
		
		

	}
}
