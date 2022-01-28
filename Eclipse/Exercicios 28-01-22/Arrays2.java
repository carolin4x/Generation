package AtividadesExtras;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		// possui.

		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		int cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Entre com valor: ");						//matriz[i][j] = cont;
				matriz[i][j] = leia.nextInt();						//cont++;

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println("Valor [" +i+ "] [" +j+ "] é: "+matriz[i][j]); apenas pra ver se ta imprimindo
			
				if(matriz[i][j] >= 10) { 
					cont++;
				}
				
			}
		}
		System.out.println(cont + " valores são maiores que 10.");
	}

}
