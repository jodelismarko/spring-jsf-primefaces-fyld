package pt.fyld.application.service.base;

import org.springframework.stereotype.Service;
import pt.fyld.application.model.PessoaDTO;

import java.util.Comparator;
import java.util.List;

@Service
public class FiltroPessoa {

    public PessoaDTO getPessoaMaisVelha(List<PessoaDTO> pessoas){
        pessoas.sort(Comparator.comparing(PessoaDTO::getIdade));
        return pessoas.get(pessoas.size() -1);
    }

    public PessoaDTO getPessoaMaisNova(List<PessoaDTO> pessoas){
        pessoas.sort(Comparator.comparing(PessoaDTO::getIdade));
        return pessoas.get(0);
    }
}
