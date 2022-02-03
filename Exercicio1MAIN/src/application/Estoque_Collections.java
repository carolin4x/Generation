package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque_Collections {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n\t\tESTOQUE DIÁRIO");
			System.out.println("\n(1) Adicionar produto no estoque?");
			System.out.println("\n(2) Remover produto do estoque?");
			System.out.println("\n(3) Atualizar um produto no estoque");
			System.out.println("\n(4) Seu estoque aqui.Veja!");
			System.out.println("\n(0) Finalizar programa");
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\nEntre com sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nInsira o nome do seu ítem aqui: ");
				String produto = leia.nextLine();// verifica se o usuário entrou com um conteúdo do tipo String
				estoque.add(produto);// adiciono o produto para dentro do meu ArrayList
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nInsira aqui o produto à ser removido do estoque: ");
				String produtor = leia.nextLine();
				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("\nEste ítem não existe!");
				}
				System.out.println(estoque);
				break;

			case 3:
				leia.nextLine();
				System.out.println("\nInsira aqui o ítem que você deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nInsira aqui o ítem que entrará no lugar do ítem " + verifica + " :");
				String novo = leia.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nO ítem não existe!");
				}
				System.out.println(estoque);
				break;

			case 4:
				System.out.println("\nOs ítens em estoque são: ");
				System.out.println(estoque);
				break;

			default:
				if (op == 0) {
					System.out.println("\nObrigada por utilizar nosso sistema!");
				} else {
					System.out.println("\nOpção inválida, por favor entre com a opção correta.");
				}
			}

		} while (op != 0);
	}

}
