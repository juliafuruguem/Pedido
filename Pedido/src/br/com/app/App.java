package br.com.app;

import java.util.Scanner;

import br.com.classes.Cliente;
import br.com.classes.Pedido;
import br.com.classes.Produto;

public class App {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		Scanner sc = new Scanner(System.in);

		System.out.println("------- Informações do cliente -------");

		//
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o numero de telefone: ");
		cliente.setTelefone(sc.nextLine());
		System.out.println("Digite o email: ");
		cliente.setEmail(sc.nextLine());
		cliente.salvar();
		
		System.out.println("------- Informações do produto -------");
		
		//
		System.out.println("Nome do produto: ");
		produto1.setDescricao(sc.nextLine());
		System.out.println("O valor do produto: ");
		produto1.setValor(sc.nextInt());
		produto1.salvar();
		sc.nextLine();
		
		System.out.println("Nome do produto: ");
		produto2.setDescricao(sc.nextLine());
		System.out.println("O valor do produto: ");
		produto2.setValor(sc.nextInt());
		produto2.salvar();
		sc.nextLine();
		
		System.out.println("Nome do produto: ");
		produto3.setDescricao(sc.nextLine());
		System.out.println("O valor do produto: ");
		produto3.setValor(sc.nextInt());
		produto3.salvar();
		sc.nextLine();
		
		System.out.println("------- Informações do pedido -------");


		
		pedido.cliente = cliente;
		pedido.numero = 1;
		
		int totalPedido = (int) (produto1.getValor() + produto2.getValor() + produto3.getValor());
		
		pedido.total = totalPedido;
		
		pedido.produtos.add(produto1);
		pedido.produtos.add(produto2);
		pedido.produtos.add(produto3);
		pedido.mostrarPedido(cliente);
		
		
	}

}
