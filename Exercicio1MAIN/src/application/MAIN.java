package application;

import entities.Cliente;

public class MAIN {
	public static void main(String[] args) {
		Cliente Ale = new Cliente("Alessandro Castro", 1.81, 93);//Não estava instanciado
		Cliente Hud = new Cliente("Hudson Lucas", 1.75, 68.5);
		Cliente Denner = new Cliente("Denner Vieira", 1.89); //teste para ver sem um atributo de peso

		System.out.println("O cliente "+ Ale.getName() 
			+ " tem o IMC de: " + Ale.imc());
		
		System.out.println("O cliente "+ Hud.getName() 
		+ " tem o IMC de: " + Hud.imc());
		
		System.out.println("O cliente "+ Denner.getName() 
		+ " tem o IMC de: " + Denner.imc()); // valor inifnito
	}
}