package PacoteJava;

import java.util.Scanner;

public class ExPortugol7 {

	public static void main(String[] args) { 
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = leia.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f = leia.nextDouble();
		
		//a2 b3 c4 d5 e2 f3
		
		x = (c*e-b*f)/(a*e-b*d); // 4*2 - 3*3/ 2*2 - 3*5
		y = (a*f-c*d)/(a*e-b*d); // 2*3 - 3*5/ 2*
		
		System.out.println("O valor de x é: "+x+ "\nO valor de y é: "+y);
		
		
		
		
	}
		
}
