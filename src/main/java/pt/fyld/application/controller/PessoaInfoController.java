package pt.fyld.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import pt.fyld.application.model.PessoaInfoDTO;
import pt.fyld.application.service.PessoaInfoService;

import javax.inject.Named;

@Named
public class PessoaInfoController {

    @Autowired
    private PessoaInfoService pessoaInfoService;

    public PessoaInfoDTO getPessoas(){
        return pessoaInfoService.getPessoas();
    }

    public PessoaInfoDTO getPessoasMasculino(){
        return pessoaInfoService.getPessoasByGenero('M');
    }

    public PessoaInfoDTO getPessoasFeminino(){
        return pessoaInfoService.getPessoasByGenero('F');
    }
}
