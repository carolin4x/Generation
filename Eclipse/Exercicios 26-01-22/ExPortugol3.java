package PacoteJava;

import java.util.Scanner;
//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class ExPortugol3 {
	public static void main(String[] args) { 
		
		int totalSeg, seg, min, hora;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou seu evento? ");
		totalSeg = leia.nextInt();
		//4550s
		hora = totalSeg / 3600; //1hora e %950s
		min = (totalSeg % 3600) / 60; // 15 min e %50s
		seg = (totalSeg % 3600) % 60; // 50s
		
		System.out.println("Seu evento teve dura��o de "+hora+ " hora(s), " +min+ " minutos(s) e " +seg+ " segundo(s).");
		
	}
}
