package application;

import entities.Conta;

public class Main1 {
	public static void main(String[] args) {
		Conta contaCarol = new Conta("Carolina Brito Lopes", "Santander", 1200);
		
		System.out.println(contaCarol.getSaldo());
		
		contaCarol.deposito(200.00);
		
		System.out.println(contaCarol.getSaldo());
		
		//contaCarol.saque(700);
		
		System.out.println("Foi sacado " + contaCarol.saque(700) + " e o total em conta agora é: " + contaCarol.getSaldo());
	}
}
