package com.webapp.escola_xyz_b.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class IndexController {

    
    @GetMapping("/home")
    public String acessoHomePage() {
        return "index";
    }

    @GetMapping("/login-adm")
    public String acessoPageLoginAdm() {
        return "login/login-adm";
    }

    @GetMapping("/cadastro-adm")
    public String acessoPageCadastroAdm() {
        return "cadastro/cadastro-adm";
    }

    @GetMapping("/login-aluno")
    public String acessoPageLoginAluno() {
        return "login/login-aluno";
    }
   
    @GetMapping("/login-professor")
    public String acessoPageLoginProfessor() {
        return "login/login-professor";
    }

    @GetMapping("/Contato")
    public String acessoPageContatoProfessor() {
        return "Contato/Contato";
    }
    
    

    
    

}
