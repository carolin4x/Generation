package PacoteJava;

import java.util.Scanner;

//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão: R=(A+B)² | S=(B+C)²	| D = (R+S)/2 | outro jeito:
// D= ((A+B)² + (B+C)²)/2

public class ExPortugol4 {
	public static void main(String[] args) { 
		double a, b, c, r, s, d;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b), 2); // (A+B) e o 2 é a potencia (quadrado)
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
				
		System.out.println("O valor de D é: "+d);
		
	}
}
