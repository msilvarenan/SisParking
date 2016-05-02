package br.com.sisparking.manipulacaodados;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class CPF {
	private String numeroCpf;
	
	public String getCpf(){
		return numeroCpf;
	}
	//public void setCpf(int cpf){
		//this.numeroCpf = cpf;
	//}
	public void setCpf(String cpf){
		String cpfFormatado = cpf;
		for (int i = 0; i < cpfFormatado.length(); i++) {
			cpfFormatado.replace(".", "");
		}
		cpfFormatado.replace("-", "");
		this.numeroCpf = cpfFormatado;
	}
	public String getCpfFormatado(){
		String Pattern = "###.###.###-##";
		MaskFormatter mf;
		try {
			mf = new MaskFormatter(Pattern);
			mf.setValueContainsLiteralCharacters(false);
			this.numeroCpf = mf.valueToString(this.numeroCpf);
			return numeroCpf;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
}
