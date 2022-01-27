package PacoteJava;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/

import java.util.Scanner;

public class ExPortugol8 {
	public static void main(String[] args) { 
		
		double custoFab, custoCons;
		Scanner leia = new Scanner(System.in);
	System.out.println("Qual o custo de fábrica? ");
	custoFab = leia.nextDouble();
		custoCons = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo de consumidor é de R$ "+custoCons);
		
	}
		
}
