package application;

import java.util.Scanner;

import entities.CachorroAbs;
import entities.CavaloAbs;
import entities.ClassAbsP;

public class AnimalM {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		CachorroAbs dog1 = new CachorroAbs();
		CavaloAbs cav1 = new CavaloAbs();
		
		ClassAbsP animais = null;
		
		
		int opc = 0;
		do { 
			System.out.println("Escolha um animal: \n1- Cachorro\n2- Cavalo");
			opc = leia.nextInt();
			switch(opc) { 
			case 1: animais = dog1; break;
			case 2: animais = cav1; break;
			default: System.out.println("Opção inválida!");
			}
			if(animais != null) 
			{ 
				animais.som((Math.random() * 2.0));
			}
			
				
		} while (opc > 3 || opc < 1);
	}
}

