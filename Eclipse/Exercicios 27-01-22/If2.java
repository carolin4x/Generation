package PacoteJava;

import java.util.Scanner;

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
public class If2 {
	public static void main(String[] args) { 
		
		int n1,n2,n3;

        Scanner leia = new Scanner(System.in);

        System.out.println("Entre com o primeiro n�mero: ");
        n1 = leia.nextInt();
        System.out.println("Entre com o segundo n�mero: ");
        n2 = leia.nextInt();
        System.out.println("Entre com o terceiro n�mero: ");
        n3 = leia.nextInt();

        if(n1<=n2 && n2<=n3) {
            System.out.println("A ordem crescente �: "+n1+", "+n2+", "+n3);
        }else if(n1 <= n3 && n3 <= n2){
            System.out.println("A ordem crescente �: "+n1+", "+n3+", "+n2);
        }else if(n2 <= n1 && n1 <= n3){
            System.out.println("A ordem crescente �: "+n2+", "+n1+", "+n3);
        }else if(n2 <= n3 && n3 <= n1){
            System.out.println("A ordem crescente �: "+n2+", "+n3+", "+n1);
        }else if(n3 <= n2 && n2 <= n1){
            System.out.println("A ordem crescente �: "+n3+", "+n2+", "+n1);
        }else if(n3 <= n1 && n1 <= n2){
            System.out.println("A ordem crescente �: "+n3+", "+n1+", "+n2);
        }
    }
}
