package br.com.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	public int numero;
	public double total;
	
	public void salvar() {
		
	}

	public Cliente cliente = new Cliente();
	
	/*
	 * Criando uma lista do tipo Ṕroduto para acessar as descricoes dos produtos que serao pedidos 
	 */
	public List <Produto> produtos = new ArrayList<>();

	
	public void mostrarPedido(Cliente cliente) {
		
		System.out.println("-------------------------");
		System.out.println("Nº PEDIDO: " + numero);
		System.out.println("Nome do cliente: "+ cliente.getNome());
		System.out.println("O telefone cadastrado: "+ cliente.getTelefone());
		System.out.println("O email cadastrado: "+ cliente.getEmail() );
		System.out.println("** ITENS DO PEDIDO **");

		
		//Criando laco de repetição para acessar os produtos na lista
		for(Produto p : produtos) {
			
			System.out.println("--" + p.getDescricao());
			System.out.println("--" + p.getValor());
			
		}
			System.out.println("-------------------------");
			System.out.println("total: " + total );

	}



}
