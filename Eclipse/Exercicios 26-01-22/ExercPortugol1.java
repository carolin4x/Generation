package PacoteJava; 
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

import java.util.Scanner; 

public class ExercPortugol1 {
	public static void main(String[] args)
	{ 
		int anos, meses, dias, totalDia;
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("Escreva sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("Escreva sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = anos*365; // convertendo os anos em dias
		meses = meses*30; // convertendo os meses em dias
		
		totalDia = anos + meses + dias;
		
		System.out.println("Fazem "+totalDia+ " dias que você nasceu.");
		
		
		
	}
}
