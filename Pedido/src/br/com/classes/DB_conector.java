package br.com.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_conector {

	//Criando extencao da aplicacao com o banco de dados
	public static String URL = "jdbc:mysql://127.0.0.1:3306/app_pedido";
	public static String USER = "aluno";
	public static String PASSOWRD = "toor"; 
	
	//Tratamento de erros para a conexao
	public static Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSOWRD);
		
	}
}