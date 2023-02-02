package pt.fyld.application.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import pt.fyld.application.model.PessoaInfoDTO;
import pt.fyld.application.service.PessoaInfoService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
@Data
@ViewScoped
public class PessoaInfoController {

    @Autowired
    private PessoaInfoService pessoaInfoService;

    private PessoaInfoDTO pessoaInfoDTO;

    private List<String> options;

    private String item;

    private boolean mostrarPessoas;

    @PostConstruct
    public void initialize() {
        this.options = Arrays.asList("Todos", "Masculino", "Feminino");
        this.mostrarPessoas = false;
        this.item = "";
    }

    public void setItem(String pessoa){
        this.item = pessoa;
        if(pessoa.equals("Masculino")){
            this.mostrarPessoas = true;
            this.pessoaInfoDTO = pessoaInfoService.getPessoasByGenero('M');
        }
        if(pessoa.equals("Feminino")){
            this.mostrarPessoas = true;
            this.pessoaInfoDTO = pessoaInfoService.getPessoasByGenero('F');
        }
        if(pessoa.equals("Todos")) {
            this.mostrarPessoas = true;
            this.pessoaInfoDTO = pessoaInfoService.getPessoas();
        }
        if(pessoa.equals("")) {
            this.mostrarPessoas = false;
        }
    }
}
