package tecnicasDeProgamacao;

import java.util.Scanner;
import java.util.Arrays;

public class lista02 {

	public static void popularVetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 150) - 30);
		}
	}

	// Questão 01
	public static int pesquisaVetor(int vetor[], int numeroPesquisado) {	
		boolean achou = false;
		int posicaoAchado = -12345;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroPesquisado) {
				achou = true;
				posicaoAchado = i;
				break;
			}
		}

		if (achou) {
			System.out.println("O número pesquisado está na posição " + (posicaoAchado + 1));
		} else {
			System.out.println("O número pesquisado não está no vetor.");
		}
		return posicaoAchado;
	}

	// Questão 02
	public static int pesquisaIndice(int vetor[], int indicePesquisado) {
		return vetor[indicePesquisado];
	}

	// Questão 03
	public static void separacaoVetor(int vetor[]) {
		int quantidadePositivo = 0, quantidadeNegativo = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				quantidadeNegativo++;
			} else {
				quantidadePositivo++;
			}
		}

		int vetorPositivo[] = new int[quantidadePositivo];
		int vetorNegativo[] = new int[quantidadeNegativo];

		int j = 0, k = 0;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < 0) {
				vetorNegativo[j] = vetor[i];
				j++;
			} else {
				vetorPositivo[k] = vetor[i];
				k++;
			}
		}

		System.out.println("Vetor positivo: "+ Arrays.toString(vetorPositivo));
		System.out.print("Vetor negativo: "+  Arrays.toString(vetorNegativo));
	}

	// Questão 04
	public static int somatorioVetor(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	// Questão 05
	public static long produtorioVetor(int vetor[]) {
		long produto = 1;
		for (int i = 0; i < vetor.length; i++) {
			produto = produto * vetor[i];
		}
		return produto;
	}

	// Questão 06
	public static long produtoEscalar(int vetor1[], int vetor2[]) {
		long produtoEscalar = 0;
		for (int i = 0; i < vetor1.length; i++) {
			produtoEscalar = produtoEscalar + (vetor1[i] * vetor2[i]);
		}
		return produtoEscalar;
	}

	// Questão 07
	public static void completaComZero(int vetor[]) {
		int vetorCopia[] = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetorCopia[i] = vetor[i];
		}

		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um índice do vetor para completar com zeros todos os valores posteriores a ele:");
		numero = ler.nextInt();
		int posicaoNumero = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetorCopia[i] == numero) {
				posicaoNumero = i;
			}
		}

		for (int i = posicaoNumero; i < vetor.length; i++) {
			vetorCopia[i] = 0;
		}

		System.out.println("O nosso vetor após alterado é: "+  Arrays.toString(vetorCopia));
	}

	// Questão 08
	public static void quadradoVetor(int vetor[]) {

		int vetor2[] = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor2[i] = vetor[i] * vetor[i];
		}
		System.out.println("O vetor com componentes ao quadrado é: "+  Arrays.toString(vetor2));
	}

	// Questão 09
	public static double mediaVetor(int vetor[]) {
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			media += (double) vetor[i] / vetor.length;
		}
		return media;
	}

	// Questão 10
	public static int maximoVetor(int vetor[]) {
		int maior = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] >= maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}

	// Questão 11
	public static int minimoVetor(int vetor[]) {
		int menor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] <= menor) {
				menor = vetor[i];
			}
		}
		return menor;
	}

	// Questão 12
	public static void modaVetor(int vetor[]) {
		System.out.print("A moda do vetor é: ");
		int vetorFrequencia[] = new int[vetor.length];

		for (int i = 0; i < vetorFrequencia.length; i++) {
			vetorFrequencia[i] = 0;
		}

		for (int i = 0; i < vetor.length; i++) {
			int valorAnalisado = vetor[i];
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] == valorAnalisado) {
					vetorFrequencia[i]++;
				}
			}
		}

		int maiorFrequencia = maximoVetor(vetorFrequencia);
		if (maiorFrequencia == 1) {
			System.out.println("Não há moda nesse vetor");
		} else {
			for (int i = 0; i < vetorFrequencia.length; i++) {
				if (vetorFrequencia[i] == maiorFrequencia) {
					System.out.println(vetor[i]);
					break;
				}
			}
		}
	}

	// Questão 13
	public static double medianaVetor(int vetor[]) {
		double mediana = 0;
		int auxiliar = 0;
		int vetorOrdenado[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
		}
		
		for (int i = 0; i < vetorOrdenado.length; i++) {
			for (int j = 0; j < vetorOrdenado.length; j++) {
				if (vetorOrdenado[i] < vetorOrdenado[j]) {
					auxiliar = vetorOrdenado[i];
					vetorOrdenado[i] = vetorOrdenado[j];
					vetorOrdenado[j] = auxiliar;
				}
			}
		}
		
		if (vetor.length % 2 == 0) {
			mediana = (double) (vetorOrdenado[(vetorOrdenado.length - 1) / 2]
					+ vetorOrdenado[(vetorOrdenado.length / 2)]) / 2;
		} else {
			mediana = (double) vetorOrdenado[(vetorOrdenado.length + 1) / 2];
		}

		return mediana;
	}

	// Questão 14
	public static double desvioPadrao(int vetor[]) {
		double media = mediaVetor(vetor);
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += (vetor[i] - media) * (vetor[i] - media);
		}
		double variancia = soma / (vetor.length - 1);
		double desvioPadrao = Math.sqrt(variancia);
		return desvioPadrao;
	}

	// Questão 15
	public static void uniaoVetor(int vetor1[], int vetor2[]) {
		int[] vetorConcatenado = new int[vetor1.length + vetor2.length];
		
		System.arraycopy(vetor1, 0, vetorConcatenado, 0, vetor1.length);
		System.arraycopy(vetor2, 0, vetorConcatenado, vetor1.length, vetor2.length);

		System.out.println("Vetor unido: " + Arrays.toString(vetorConcatenado));
	}

	// Questão 16
	public static void inversaoVetor(int vetor[]) {
		int[] vetorAuxiliar = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			vetorAuxiliar[i] = vetor[vetor.length - 1 - i];
		}

		System.out.print("O vetor invertido é: " + Arrays.toString(vetorAuxiliar));
	}

	// Questão 17
	public static void intersecaoVetores(int vetor1[], int vetor2[]) {
		boolean achouIntersecao = false;
		System.out.print("A interseção dos vetores: ");
		
		for (int i = 0; i < vetor1.length; i++) {
			int valorAnalisado = vetor1[i];
			for (int j = 0; j < vetor2.length; j++) {
				if (valorAnalisado == vetor2[j]) {
					System.out.println(vetor1[i] + " ");
					achouIntersecao = true;
				}
			}
		}
		
		if (achouIntersecao == false) {
			System.out.println("Não há interseção!");
		}
	}

	// Questão 18
	public static void diferencaVetores(int vetor1[], int vetor2[]) {
		System.out.println("O vetor diferença-A é:");
		for (int i = 0; i < vetor1.length; i++) {
			int valorAnalisado = vetor1[i];
			for (int j = 0; j < vetor2.length; j++) {
				if (valorAnalisado == vetor2[j]) {
					break;
				} else {
					System.out.print(vetor1[i] + " ");
					break;
				}
			}

		}
	}

	// Questão 19
	public static void ordenacaoVetor(int vetor[]) {
		int auxiliar = 0;
		int vetorOrdenado[] = new int[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
		}

		for (int i = 0; i < vetorOrdenado.length; i++) {
			for (int j = 0; j < vetorOrdenado.length; j++) {
				if (vetorOrdenado[i] < vetorOrdenado[j]) {
					auxiliar = vetorOrdenado[i];
					vetorOrdenado[i] = vetorOrdenado[j];
					vetorOrdenado[j] = auxiliar;
				}
			}
		}
		System.out.print("O vetor ordenado é: "+  Arrays.toString(vetorOrdenado));
	}

	// Questão 20
	public static void primosVetor(int vetor[]) {
		boolean achouPrimo = false;
		System.out.println("Números primos:");
		
		for (int i = 0; i < vetor.length; i++) {
			boolean ehPrimo = true;
			for (int j = 2; j < Math.abs(vetor[i]); j++) {
				if (Math.abs(vetor[i]) % j == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo && vetor[i] != 0) {
				System.out.print(vetor[i] + " ");
				achouPrimo = true;
			}
		}
		if (!achouPrimo) {
			System.out.println("Não há primos nesse vetor!");
		}
	}

	// Questão 21
	public static int fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void fibonacciVetor(int vetor[]) {
		int vetorFibonacci[] = new int[20];
		boolean ehFibonacci = false;

		for (int i = 0; i < 20; i++) {
			vetorFibonacci[i] = fibo(i);
		}

		System.out.println("Números de Fibonacci:");
		for (int i = 0; i < vetor.length; i++) {
			int valorAnalisado = vetor[i];
			for (int j = 0; j < vetorFibonacci.length; j++) {
				if (vetorFibonacci[j] == valorAnalisado) {
					System.out.println(vetor[i] + " ");
					ehFibonacci = true;
				}
			}
		}

		if (!ehFibonacci) {
			System.out.println("Não há números de Fibonacci nesse vetor!");
		}
	}

	// Questão 22
	public static void agrupamentoVetor(int vetor[], int numero) {
		int auxiliar = 0;
		int vetorOrdenado[] = new int[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
		}

		for (int i = 0; i < vetorOrdenado.length; i++) {
			for (int j = 0; j < vetorOrdenado.length; j++) {
				if (vetorOrdenado[i] < vetorOrdenado[j]) {
					auxiliar = vetorOrdenado[i];
					vetorOrdenado[i] = vetorOrdenado[j];
					vetorOrdenado[j] = auxiliar;
				}
			}
		}

		if (vetor.length % numero != 0) {
			System.out.println("Não é possível dividir o vetor em " + numero + "grupos");
		} else {
			for (int i = 0; i < numero; i++) {
				System.out.println("\nA " + (i + 1) + " divisão é:");
				for (int j = ((vetor.length / numero) * (i)); j < ((vetor.length / numero) * (i + 1)); j++) {
					System.out.print(vetorOrdenado[j]+" ");
				}System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) {
		// inicialização
		
		int vetor[] = new int[10];
		popularVetor(vetor);
		System.out.println("O nosso vetor principal é: " + Arrays.toString(vetor) +"\n");
		
		int vetor2[] = new int[10];
		popularVetor(vetor2);
		System.out.println("O nosso vetor secundário é: " + Arrays.toString(vetor2)+"\n");

		// Questão 01
		System.out.println("Questão 01:");
		int numeroPesquisado = 5;
		pesquisaVetor(vetor, numeroPesquisado);
		System.out.print("\n");

		// Questão 02
		int indicePesquisado = 9;
		System.out.println("Questão 02:\nO número na posição " + indicePesquisado + " é " + pesquisaIndice(vetor, indicePesquisado)+"\n");

		// Questão 03
		System.out.println("Questão 03:");
		separacaoVetor(vetor);
		System.out.print("\n\n");

		// Questão 04
		System.out.println("Questão 04:\nA soma do vetor é " + somatorioVetor(vetor)+"\n");

		// Questão 05
		System.out.println("Questão 05:\nO produto do vetor é " + produtorioVetor(vetor)+"\n");

		// Questão 06
		System.out.println("Questão 06\nO produto escalar do vetor e vetor2 é " + produtoEscalar(vetor, vetor2)+"\n");

		// Questão 07
		System.out.println("Questão 07:");
		completaComZero(vetor);
		System.out.print("\n");

		// Questão 08
		System.out.println("Questão 08:");
		quadradoVetor(vetor);
		System.out.print("\n");

		// Questão 09
		System.out.println("Questão 09\nA média dos componentes do vetor é: " + mediaVetor(vetor)+"\n");

		// Questão 10
		System.out.println("Questão 10:\nO maior número do vetor é " + maximoVetor(vetor)+"\n");

		// Questão 11
		System.out.println("Questão 11:\nO menor número do vetor é " + minimoVetor(vetor)+"\n");

		// Questão 12
		System.out.println("Questão 12:");
		modaVetor(vetor);
		System.out.print("\n");

		// Questão 13
		System.out.println("Questão 13:\nA mediana do vetor é " + medianaVetor(vetor)+"\n");

		// Questão 14
		System.out.println("Questão 14:\nO desvio padrão do vetor é " + desvioPadrao(vetor)+"\n");

		// Questão 15
		System.out.println("Questão 15:");
		uniaoVetor(vetor, vetor2);
		System.out.print("\n");

		// Questão 16
		System.out.println("Questão 16:");
		inversaoVetor(vetor);
		System.out.print("\n\n");

		// Questão 17
		System.out.println("Questão 17:");
		intersecaoVetores(vetor, vetor2);
		System.out.print("\n");

		// Questão 18
		System.out.println("Questão 18:");
		diferencaVetores(vetor, vetor2);
		System.out.print("\n\n");

		// Questão 19
		System.out.println("Questão 19:");
		ordenacaoVetor(vetor);
		System.out.print("\n\n");

		// Questão 20
		System.out.println("Questão 20:");
		primosVetor(vetor);
		System.out.print("\n\n");

		// Questão 21
		System.out.println("Questão 21:");
		fibonacciVetor(vetor);
		System.out.print("\n");

		// Questão 22
		System.out.print("Questão 22:");
		int divisao = 2;
		agrupamentoVetor(vetor, divisao);
		System.out.print("\n");
	}
}
