package AtividadesExtras;

public class Arrays1 {

	public static void main(String[] args) {
		// 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
		// inteiros. O programa deve executar os seguintes passos:
		// (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		// (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das
		// posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		// (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
		// (d) Mostre na tela cada valor do vetor A, um em cada linha.

		int[] a = new int[6]; // 1, 0, 5, -2, -5, 7

		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = -7;

		int soma = a[0] + a[1] + a[5];
		System.out.println("O resultado �: " + soma);

		a[3] = 100;
		System.out.println(a[3]);

		for (int i = 0; i < a.length; i++) { // lenght retorna para o tam do vetor, caso tamanho mude no vetor,ele muda
												// sozinho aqui
			System.out.println("O valor " + (i + 1) + " �: " + a[i]);
		}
	}
}
