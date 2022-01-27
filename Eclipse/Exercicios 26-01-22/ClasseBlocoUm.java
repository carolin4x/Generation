package PacoteJava;

import java.util.Scanner;

public class ClasseBlocoUm {
	public static void main(String args[])
	{ 
		System.out.println("Olá, Mundo!");
		Scanner ler = new Scanner(System.in); 
		int a, b, soma;
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println(soma);
		
	}
}
	
	
