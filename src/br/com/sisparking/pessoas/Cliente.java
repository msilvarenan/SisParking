package br.com.sisparking.pessoas;

import br.com.sisparking.manipulacaodados.Data;

public class Cliente extends Pessoa{
	boolean clienteAtivo;
	Data dataCadastro;
	
	
	
	void cadastraCliente(){
		
	}
	
	
	
	void ativaCliente(boolean ativo){
		if(ativo){
			clienteAtivo = true;
		}else{
			clienteAtivo = false;
		}
	}
	
}
