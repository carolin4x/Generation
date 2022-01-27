package PacoteJava;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
/*Faça um programa que mostre um Menu com opções de um cardápio de restaurante para uma pessoa. 
 * A pessoa vai escolher o prato desejado: 

	Após escolher o prato, o programa deverá fazer uma pergunta ao usuário,
 	se ele aceita pagar a gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar, mostrar 
 	o valor final (valor do prato + 10%), caso contrário, mostrar o valor final (somente o valor do prato).
	Codigo		 Prato		 	Valor 
	1 		Picanha 		25,00 
	2 		Lasanha 		20,00 
	3 		Strogonoff 		18,00 
	4 		Bife Acebolado 	15,00 
	5 		Pão com ovo 	5,00*/

		int menu, gorjeta;
		float valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tMENU ALMOÇO\nESCOLHA SUA OPÇÃO:");
		System.out.println("1. Picanha -------- 25,00");
		System.out.println("2. Lasanha -------- 20,00");
		System.out.println("3. Strogonoff ----- 18,00");
		System.out.println("4. BIfe Acebolado - 15,00");
		System.out.println("5. Pão com Ovo ----- 5,00");
		
		menu = leia.nextInt();
		System.out.println("Você aceita pagar gorjeta de 10%?");
		System.out.println("Para SIM digite 1 \nPara NÃO digite 0 ");
		gorjeta = leia.nextInt();
		
				
		switch(menu) { 
		case 1:
			System.out.println("1. Picanha -------- 25,00");
			valor = 25;
			
			if(gorjeta == 1) { 
				valor = valor * 1.1f;
				System.out.println("Valor total a pagar: R$ " +valor);
			}else if (gorjeta==0) { 
				System.out.println("Valor total a pagar: R$ " +valor);
			}else { 
				System.out.println("Opção inválida.");
			}
			break;
		
		case 2:
			System.out.println("2. Lasanha -------- 20,00");
			valor = 20;
			
			if(gorjeta == 1) { 
				valor = valor * 1.1f;
				System.out.println("Valor total a pagar: R$ " +valor);
			}else if (gorjeta==0) { 
				System.out.println("Valor total a pagar: R$ " +valor);
			}else { 
				System.out.println("Opção inválida.");
			}
			break;
		
		case 3:
			System.out.println("3. Strogonoff ----- 18,00");
			valor = 18;
			
			if(gorjeta == 1) { 
				valor = valor * 1.1f;
				System.out.println("Valor total a pagar: R$ " +valor);
			}else if (gorjeta==0) { 
				System.out.println("Valor total a pagar: R$ " +valor);
			}else { 
				System.out.println("Opção inválida.");
			}
			break;
		
		case 4:
			System.out.println("4. Bife Acebolado - 15,00");
			valor = 15;
			
			if(gorjeta == 1) { 
				valor = valor * 1.1f;
				System.out.println("Valor total a pagar: R$ " +valor);
			}else if (gorjeta==0) { 
				System.out.println("Valor total a pagar: R$ " +valor);
			}else { 
				System.out.println("Opção inválida.");
			}
			break;
		
		case 5:
			System.out.println("5. Pão com Ovo ----- 5,00");
			valor = 5;
			
			if(gorjeta == 1) { 
				valor = valor * 1.1f;
				System.out.println("Valor total a pagar: R$ " +valor);
			}else if (gorjeta==0) { 
				System.out.println("Valor total a pagar: R$ " +valor);
			}else { 
				System.out.println("Opção inválida.");
			}
			break;
			
		default:
			System.out.println("Opção inválida.");
			break;	
		}
	}

}
