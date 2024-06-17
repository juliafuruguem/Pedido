package br.com.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Produto {

	protected String descricao;
	protected double valor;

	//Metodo que ira salvar os produtos no banc de dados
	public void salvar() {
		
		//tryCatch trata exceções(erros)
		
		try(Connection conector = DB_conector.conectar()){
			
			PreparedStatement smt = conector.prepareStatement("insert into produtos (descricao, valor) values (?, ?)");
			
			smt.setString(1, descricao);
			smt.setDouble(2, valor);
			smt.executeUpdate();
			
			
		 } 
			
		catch (Exception e) {
			e.printStackTrace();
		}
			
}
	
	
	
	
	
	
	
	
	
	// produto
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
