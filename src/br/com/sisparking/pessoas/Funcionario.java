package br.com.sisparking.pessoas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	public void setDataAdmissao(String data){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		String stringData = data;
		Calendar dt = Calendar.getInstance();
		try {
			dt.setTime(dateFormat.parse(stringData));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dataAdmissao = dt;
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
