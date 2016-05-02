package br.com.sisparking.manipulacaodados;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Data {
		private int dia;
		private int mes;
		private int ano;
		
		public Data(int dia, int mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		
		}
		
		public int getDia(){
			return dia;
		}
		public int getMes(){
			return mes;
		}
		public int getAno(){
			return ano;
		}
		String getDataFormatada(){
			String dataFormatada;
			dataFormatada =  Integer.toString(dia)+'/'+Integer.toString(mes)+'/'+Integer.toString(ano);
			return dataFormatada;
		}
		String getCpfFormatado(){
			String Pattern = "##/##/####";
			String dataCompleta = Integer.toString(this.dia)+Integer.toString(this.mes)+Integer.toString(this.ano);
			MaskFormatter mf;
			try {
				mf = new MaskFormatter(Pattern);
				mf.setValueContainsLiteralCharacters(false);
				return mf.valueToString(dataCompleta);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
}
