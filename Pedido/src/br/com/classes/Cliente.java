package br.com.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cliente extends Pessoa {

	//Criando metodo que irá salvar os dados do cliente no banco de dados 
	public void salvar() {
		
		try(Connection conector =  DB_conector.conectar()) {
			
			PreparedStatement smt = conector.prepareStatement("insert into clientes (nome, telefone, email, idade) values (?, ?, ?, ?)");
			
			smt.setString(1, nome);
			smt.setString(2, telefone);
			smt.setString(3, email);
			smt.setDouble(4, idade);
			smt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
	}
}
