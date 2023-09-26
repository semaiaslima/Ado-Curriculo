package br.senac.dsw.adoumdsw.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("curriculo")
public class Controller {

    @GetMapping
    public ModelAndView curriculo(){
        ModelAndView dados = new ModelAndView("index");
        dados.addObject("nome","Semaías Lima");
        dados.addObject("endereco","Endereço: Rua Baianópolis 77");
        dados.addObject("email", "E-mail: semaias_oliveira@hotmail.com");
        dados.addObject("telefone", "Telefone: (11) 97100-1999");
        dados.addObject("instituicao", "Instituição: Senac - Santo Amaro");
        dados.addObject("curso", "Analise e Desenvolvimento de Sistemas");
        dados.addObject("semestre", "4° Semestre");
        dados.addObject("periodo", "Inicio: 2022 fim: 2024");
        dados.addObject("resumo", "Sou corretor de seguros, porém busco uma oportunidade na area da programação");

        return dados;
    }
}
