package PacoteJava;

import java.util.Scanner;

//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.

public class PortugolExDOIS {
	public static void main(String[] args)
	{ 
		int totalDia, dia, mes, ano;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("H� quantos dias voc� nasceu? ");
		totalDia = leia.nextInt();
		// 
		ano = totalDia/365;
		mes = (totalDia%365)/30;
		dia = (totalDia % 365)%30; 
		
		System.out.println("Voc� tem " +ano+ " anos, " +mes+ " mes(es) e " +dia+ " dia(s) de vida.");
		
	}
}
