package PacoteJava;

import java.util.Scanner;

public class LacoDecisao2 {
	public static void main(String[] args) { 
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n\t\tMenu de Opções Carinhosas");
		System.out.println("1 - Você é especial!");
		System.out.println("2 - Não desista dos seus sonhos!");
		System.out.println("3 - Bota um cropped, reage!");
		System.out.println("4 - Seus sonhos são reais!");
		System.out.println("5 - Bora, Riquelme!");
		System.out.println("\nDigite sua opção.");
		
		op = ler.nextInt();
		
		switch(op) { 
		
		case 1:
			System.out.println("\n\t\tMednu de Opções Carinhosas");
			break;	
		case 2: 
			System.out.println("\n2 - Não desista dos seus sonhos!");
			break;
		case 3: 	
			System.out.println("\n3 - Bota um cropped, reage!");
			break;
		case 4:
			System.out.println("\n4 - Seus sonhos são reais!");
			break;
		case 5:	
			System.out.println("\n5 - Bora, Riquelme!");
			break;
		default:
				System.out.println("Opção Inválida, queride!");
			
		}
	}
}
