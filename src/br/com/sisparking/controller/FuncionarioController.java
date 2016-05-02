package br.com.sisparking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sisparking.dao.DaoFuncionario;
import br.com.sisparking.pessoas.Funcionario;

@Controller
public class FuncionarioController {

	@RequestMapping("FormularioAdicionarFuncionario")
	public String form(){
		
		
		return "formularioAdicionarFuncionario";
	}
	@RequestMapping("AdicionarFuncionario")
	public String adiciona(Funcionario funcionario){
		DaoFuncionario dao = new DaoFuncionario();
		try {
			dao.insere(funcionario);	
		} catch (Exception e) {
			return "redirect: FormularioAdicionarFuncionario";
		}
		return "Home";
	}
	
}
