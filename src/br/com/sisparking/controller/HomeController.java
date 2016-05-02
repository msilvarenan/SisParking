package br.com.sisparking.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sisparking.dao.DaoFuncionario;
import br.com.sisparking.pessoas.Funcionario;

@Controller
public class HomeController {

	//Usando ModelAndView
//	@RequestMapping("Home")
//	public ModelAndView home(){
//		DaoFuncionario dao = new DaoFuncionario();
//		List<Funcionario> funcionarios = dao.getLista();
//		ModelAndView mv = new ModelAndView("Home");
//		mv.addObject("funcionarios", funcionarios);
//		
//		return mv;
//	}
	@RequestMapping("Home")
	public String home(Model model){
		DaoFuncionario dao = new DaoFuncionario();
		Funcionario funcLogado = dao.buscarUsuario("rmsilva");
		List<Funcionario> funcionarios = dao.getLista();
		model.addAttribute("funcionarios", funcionarios);
		model.addAttribute("FuncionarioLogado", funcLogado);
		return "Home";
	}
}
