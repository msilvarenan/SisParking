package br.com.sisparking.pessoas;

import java.util.Calendar;

public class Funcionario extends Pessoa{
	private double salario;
	private Calendar dataAdmissao;
	boolean estaNaEmpresa;
	
	
	
	public Funcionario(){
	}
	
	public Calendar getDataAdmissao(){
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar data){
		this.dataAdmissao = data;
	}
	public double getSalario(){
		return salario;
	}
	public void setSalario(double atbSalario){
		this.salario = atbSalario;
	}
	public void setEstaNaEmpresa(int status){
		if(status == 1){
			this.estaNaEmpresa = true;
		}else{
			this.estaNaEmpresa = false;
		}
	}
	
	public void recebeAumento(double aumento){
		this.salario = salario+aumento;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
}
