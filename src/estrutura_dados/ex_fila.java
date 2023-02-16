package estrutura_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex_fila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<String> nomes = new LinkedList<String>();

		int opcao = 6;
		String nome;

		do {
			System.out.println("1- Adicionar cliente na fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Retirar cliente da fila");
			System.out.println("0- Sair");
			System.out.println("Entre com a opção desejada:");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				sc.skip("\\R?");
				nome = sc.nextLine();
				nomes.add(nome);
				nomes.forEach(System.out::println);
				System.out.println("Fila: ");
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: ");
				nomes.forEach(System.out::println);
				break;
			case 3:
				if (!nomes.isEmpty()) { // is Empty = esta vazio / ! = não esta vazio
					System.out.println("Fila: ");
					System.out.println(nomes.poll());
					System.out.println("O cliente foi chamado!");
				} else
					System.out.println("A Fila está vazia!");

				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while (opcao != 0);

	}

}