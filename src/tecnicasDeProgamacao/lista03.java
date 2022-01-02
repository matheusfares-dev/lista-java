package tecnicasDeProgamacao;

import java.util.Arrays;

public class lista03 {

	// auxiliares
	public static void popularVetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 150) - 30);
		}
	}

	// Quest�o 01
	public static int sequenciaNumero(int numeroFinal, int numeroInicial) {
		if (numeroFinal >= numeroInicial) {
			System.out.print(numeroInicial + " ");
			return sequenciaNumero(numeroFinal, numeroInicial + 1);
		}
		return 0;
	}

	// Quest�o 02
	public static int somaVetor(int vetor[], int posicaoInicial) {
		if (posicaoInicial < vetor.length) {
			return vetor[posicaoInicial] + somaVetor(vetor, posicaoInicial + 1);
		}
		return 0;
	}

//	Quest�o 03 
	public static int incrementoRecursivo(int numero) {
		if (numero >= 100) {
			return 100;
		} else {
			return incrementoRecursivo(numero + 1);
		}
	}

//	Quest�o 04 
	public static int numerosPares(int numero) {
		if (numero == 0) {
			System.out.print("0");
			return 0;
		} else if (numero % 2 == 0) {
			System.out.print(numero + " ");
		}
		numerosPares(numero - 1);
		return 0;
	}

//  Quest�o 05
	public static long fatorialDuplo(int numero) {
		if (numero == 1) {
			return 1;
		}
		return numero * fatorialDuplo(numero - 2);
	}

//	Quest�o 06

	public static long fatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}

	public static long superFatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return fatorial(numero) * superFatorial(numero - 1);
	}

//	Quest�o 07
	public static int numerosPell(int numero) {
		if (numero == 0) {
			return 0;
		}
		if (numero == 1) {
			return 1;
		}
		return ((2 * numerosPell(numero - 1)) + numerosPell(numero - 2));
	}

//	Quest�o 08 
	public static long ricci(int primeiroNumero, int segundoNumero, int numeroInicial, int numeroFinal) {
		if (numeroFinal >= numeroInicial) {
			if (numeroInicial == 0) {
				System.out.println(primeiroNumero + " ");
				return ricci(primeiroNumero, segundoNumero, numeroInicial + 1, numeroFinal);
			}
			if (numeroInicial == 1) {
				System.out.println(segundoNumero + " ");
				return ricci(primeiroNumero, segundoNumero, numeroInicial + 1, numeroFinal);
			}
			System.out.println(primeiroNumero + segundoNumero);
			return ricci(segundoNumero, primeiroNumero + segundoNumero, numeroInicial + 1, numeroFinal);

		}
		return 0;
	}

//	Quest�o 09 (considerando o primero termo como i = 1;
	public static int fetuccine(int primeiroNumero, int segundoNumero, int numeroInicial, int numeroFinal) {
		if (numeroFinal >= numeroInicial) {
			if (numeroInicial == 0) {
				System.out.print(primeiroNumero + " ");
				return fetuccine(primeiroNumero, segundoNumero, numeroInicial + 1, numeroFinal);
			}
			if (numeroInicial == 1) {
				System.out.print(segundoNumero + " ");
				return fetuccine(primeiroNumero, segundoNumero, numeroInicial + 1, numeroFinal);
			}
			if (numeroInicial % 2 == 0 && numeroInicial > 1) {
				System.out.print((segundoNumero + primeiroNumero) + " ");
				return fetuccine(segundoNumero, segundoNumero + primeiroNumero, numeroInicial + 1, numeroFinal);
			} else if (numeroInicial % 2 != 0 && numeroInicial > 1) {
				System.out.print((segundoNumero - primeiroNumero) + " ");
				return fetuccine(segundoNumero, segundoNumero - primeiroNumero, numeroInicial + 1, numeroFinal);
			}
		}
		return 0;
	}

//	Quest�o 10 
	public static int sequenciaQuadrada(int numeroInicial, int numeroFinal) {
		if (numeroFinal >= numeroInicial) {
			System.out.print((numeroInicial * numeroInicial) + " ");
			return sequenciaQuadrada(numeroInicial + 1, numeroFinal);
		}
		return 0;
	}

//	Quest�o 11
	public static int serieDiferente(int numeroInicial, int numeroFinal) {
		if (numeroFinal >= numeroInicial) {
			if (numeroInicial == 0) {
				System.out.print("1 ");
				return serieDiferente(numeroInicial + 1, numeroFinal);
			}
			if (numeroInicial == 1 || numeroInicial == 2) {
				System.out.print("4 ");
				return serieDiferente(numeroInicial + 1, numeroFinal);
			}

			if (numeroInicial % 3 == 0) {
				System.out.print(((numeroInicial / 3) + 1) + " ");
			} else if (numeroInicial % 3 == 1 || numeroInicial % 3 == 2) {
				System.out.print(3 + (numeroInicial / 3) + 1 + " ");
			}

			return serieDiferente(numeroInicial + 1, numeroFinal);
		}
		return 0;

	}

//	Quest�o 12
	public static int tetranacci(int numero) {
		if (numero == 0 || numero == 1 || numero == 2) {
			return 0;
		}
		if (numero == 3) {
			return 1;
		}
		return tetranacci(numero - 1) + tetranacci(numero - 2) + tetranacci(numero - 3) + tetranacci(numero - 4);
	}

//	Quest�o 13
	public static int mdc(int a, int b) {
		if (b == 0) {
			return a;
		}
		return mdc(b, a % b);
	}

	public static void main(String[] args) {

		// Inicializa��o
		int numero = 50;
		int vetor[] = new int[10];
		popularVetor(vetor);
		System.out.println("O vetor �: " + Arrays.toString(vetor) + "\n");

		// Quest�o 01
		System.out.println("Quest�o 01:");
		sequenciaNumero(numero, 1);
		System.out.println("\n");

		// Quest�o 02
		System.out.println("Quest�o 02:\nA soma do vetor � " + somaVetor(vetor, 0) + "\n");

		// Quest�o 03
		System.out.println("Quest�o 03: " + incrementoRecursivo(numero) + "\n");

		// Quest�o 04
		System.out.print("Quest�o 04: ");
		numerosPares(numero);
		System.out.println("\n");

		// Quest�o 05
		int numeroFatorial = 11;
		System.out.println(
				"Quest�o 05: O fatorial duplo de " + numeroFatorial + " � " + fatorialDuplo(numeroFatorial) + "\n");

		// Quest�o 06
		System.out.println(
				"Quest�o 06: O superfatorial de " + numeroFatorial + " � " + superFatorial(numeroFatorial) + "\n");

		// Quest�o 07
		int pell = 4;
		System.out.println("Quest�o 07: N�mero de Pelle P(" + pell + "): " + numerosPell(pell) + "\n");

		// Quest�o 08
		int primeiroNumero = 1;
		int segundoNumero = 2;
		int numeroRicci = 3;
		System.out.println("Quest�o 08: O n�mero de Ricci para termos iniciais " + primeiroNumero
			+ " e " + segundoNumero + " �:");
		ricci(primeiroNumero, segundoNumero, 0, numeroRicci);

		// Quest�o 09
		System.out.println("Quest�o 9");
		ricci(1, 2, 0, 5);
		System.out.println("\n");

		// Quest�o 10
		System.out.println("Quest�o 10");
		sequenciaQuadrada(1, 4);
		System.out.println("\n");

		// Quest�o 11
		System.out.println("Quest�o 11");
		serieDiferente(0, 7);
		System.out.println("\n");

		// Quest�o 12
		System.out.println("Quest�o 12: " + tetranacci(6) + "\n");


		// Quest�o 13
		int a = 10, b = 5;
		System.out.println("Quest�o 13: O mdc de "+ a+" e "+ b +" � "+ mdc(a, b));
		System.out.println();

	}
}
