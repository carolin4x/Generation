package PacoteJava;
//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3 e 5,
//respectivamente.

import java.util.Scanner;

public class ExPortugol5 {
	public static void main(String[] args) { 
	
		double n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		n1 = leia.nextDouble();
		System.out.println("Entre com a nota 2: ");
		n2 = leia.nextDouble();
		System.out.println("Entre com a nota 3: ");
		n3 = leia.nextDouble();
		
		media = ((n1*2)+(n2*3)+(n3*5)) / 10; //
		System.out.println("A m�dia ponderada das notas � de: "+media);
		
	}
}
