package PacoteJava;

import java.util.Scanner;

//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o: R=(A+B)� | S=(B+C)�	| D = (R+S)/2 | outro jeito:
// D= ((A+B)� + (B+C)�)/2

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
		
		r = Math.pow((a+b), 2); // (A+B) e o 2 � a potencia (quadrado)
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
				
		System.out.println("O valor de D �: "+d);
		
	}
}
