package br.com.sisparking.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.sisparking.pessoas.Funcionario;

import com.mysql.jdbc.Connection;

public class DaoFuncionario {
	 private Connection conn; 
	 
	 public DaoFuncionario(){
		 conn = ConexaoMySql.getConexaoMySQL();
	 }
	 public void insere(Funcionario func) throws Exception{
	    	 String sql = "INSERT INTO sisparking.funcionario (nomeFuncionario, cpf, salario, estaNaEmpresa, usuario, senha) VALUES (?, ?, ?, ?, ?, ?)";
	         PreparedStatement stmt = conn.prepareStatement(sql);
	    	 stmt.setString(1, func.getNome());
	    	 stmt.setString(2, func.getCpf());
	    	 stmt.setDouble(3, func.getSalario());
	    	 stmt.setString(4, "1");
	    	 stmt.setString(5, func.getUsuario());
	    	 stmt.setString(6, func.getSenha());
	    	 stmt.executeUpdate();
	    	 stmt.close();
	         System.out.println("Funcionario Inserido!");
	   } 
	 
	 
	 public Funcionario buscarUsuario(String usuario) {  
		 Funcionario funcCadastrado = new Funcionario(); 
		 try {  
	    	String sql = "SELECT * FROM sisparking.funcionario WHERE usuario LIKE '"+usuario+"%'";
	    	PreparedStatement stmt = conn.prepareStatement(sql); 
	    	ResultSet rs = stmt.executeQuery();
	    	
	        if(rs.next()){	
	            
	            funcCadastrado.setNome(rs.getString("nomeFuncionario"));
	            funcCadastrado.setId(rs.getInt("idFuncionario"));
	            funcCadastrado.setCpf(rs.getString("cpf"));
	            Calendar data = Calendar.getInstance();
	            data.setTime(rs.getDate("dataAdmissao"));
	            funcCadastrado.setDataAdmissao(data);
	            funcCadastrado.setSalario(rs.getFloat("salario"));
	            funcCadastrado.setSalario(rs.getDouble("salario"));
	            funcCadastrado.setUsuario(rs.getString("usuario"));
	            funcCadastrado.setSenha(rs.getString("senha"));
	            stmt.close();
		        return funcCadastrado;
	        }
	        else{
	        	throw new RuntimeException("Usuário não existe na base");
	        }
	      } catch (SQLException e) {  
	         System.out.println("Erro ao buscar pessoa"+ e.getMessage());  
	         return null;  
	      }  
	  
	   } 
	 public List<Funcionario> getLista() {  
		 List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	      try {  
	    	String sql = "SELECT * FROM sisparking.funcionario";
	    	PreparedStatement stmt = conn.prepareStatement(sql);
	    	ResultSet rs = stmt.executeQuery();
	         
	         while (rs.next()) {  
	        //Calendar Data = rs.getDate(5).getTime();	        	
	        	
	        	Funcionario funcTemp = new Funcionario();
	        	funcTemp.setId(rs.getInt("idFuncionario"));
	        	funcTemp.setNome(rs.getString("nomeFuncionario"));
	        	funcTemp.setCpf(rs.getString("cpf"));
	        	funcTemp.setSalario(rs.getFloat("salario"));
	        	Calendar data = Calendar.getInstance();
	            data.setTime(rs.getDate("dataAdmissao"));
	        	funcTemp.setDataAdmissao(data);
	        	funcTemp.setEstaNaEmpresa(rs.getInt("estaNaEmpresa"));
	        	funcTemp.setUsuario(rs.getString("usuario"));
	        	funcTemp.setSenha(rs.getString("senha"));
	        	funcionarios.add(funcTemp);
	        	
	         }  
	         stmt.close();
	         return funcionarios;  
	      } catch (SQLException e) {  
	         System.out.println("Erro ao buscar pessoa"+ e.getMessage());  
	         return null;  
	      }
	   }
	
	
}
