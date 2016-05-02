package br.com.sisparking.pessoas;

import br.com.sisparking.manipulacaodados.CPF;

public class Pessoa extends CPF{
	int id;
	String nome;
	String usuario;
	String senha;
	CPF cpf;
	
	public Pessoa(){
		
	}
	
	public int getId(){
		return id;
	}
	public void setId(int idPessoa){
		this.id = idPessoa;
	}
	
	public String getSenha(){
		return senha;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
}
