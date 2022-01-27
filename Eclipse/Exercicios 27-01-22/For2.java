package PacoteJava;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) { 
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)//
		
		int n, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		
		for(int cont=0; cont<=10; cont++) { 
			System.out.print("Entre com um numero:");
			n = ler.nextInt();
			if(n%2 == 0) {// n dividido por 2, por ex: 5 dividido por 2 é 2 e sobra 1 e 1 é impar.
				par++;
			}
			else if(n%2 != 0) { 
				impar++;
			}
				
		}
		
		System.out.println("\tExistem "+par+ " números pares e" + impar+ " números ímpares.");
		
	}
	
}
