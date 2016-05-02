package br.com.sisparking.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoMySql {
	public static String status = "desconectado";
	public static Connection connection = null;

	public static Connection getConexaoMySQL(){ 
		 
		//atributo do tipo Connection 
		try { 
			String driverName = "com.mysql.jdbc.Driver"; 
			Class.forName(driverName);
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "cen11jpn"); 
			
			if (connection != null){ 
				status = ("STATUS--->Conectado com sucesso!"); 
			}else{ 
				status = ("STATUS--->N�o foi possivel realizar conex�o"); 
			} 
			return connection; } 
		catch (ClassNotFoundException e){ 
			
			//Driver n�o encontrado 
			System.out.println("O driver expecificado nao foi encontrado."); 
			return null; 
			
			}catch(SQLException e){ 
				
				//N�o conseguindo se conectar ao banco 
				System.out.println("Nao foi possivel conectar ao Banco de Dados."); 
				return null; 
			} 
		} 
}
