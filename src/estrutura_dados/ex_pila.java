package estrutura_dados;

import java.util.Scanner;
import java.util.Stack;

public class ex_pila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();

		int opcao = 6;
		String nomeDoLivro;

		do {
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar Livro da pilha");
			System.out.println("0- Sair");
			System.out.println("Digite uma opção:  ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:  ");
				sc.skip("\\R?");
				nomeDoLivro = sc.nextLine();
				livros.push(nomeDoLivro);
				System.out.println("Pilha:  ");
				livros.forEach(System.out::println);
				System.out.println("Livros Adicionado!");
				break;
			case 2:
				System.out.println("Lista de livros na pilha: ");
				livros.forEach(System.out::println);
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("Apilha está vázia!");

				} else {
					System.out.println("Pilha: ");
					livros.pop();
					System.out.println("Um livro foi retirada da pilha!:  ");
				}
				break;

			default:
				System.out.println("Programa Finalizado!");
			}

		} while (opcao != 0);

	}
}
