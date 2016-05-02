package br.com.sisparking.pessoas;

public class Dependente extends Cliente{
	Cliente titular;
	int perfilDependente;

	
	
	void cadastraDependente(Cliente dadosTitular){
		if(dadosTitular.clienteAtivo){
			//cadastra os dados
			this.titular = dadosTitular;
		}else{
			//Erro
		}
	}
}
