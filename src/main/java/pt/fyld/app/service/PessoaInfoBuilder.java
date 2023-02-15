package pt.fyld.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.fyld.app.model.PessoaDTO;
import pt.fyld.app.model.PessoaInfoDTO;

import java.util.Comparator;
import java.util.List;

@Service
public class PessoaInfoBuilder {

    @Autowired
    private Media media;
 
    public PessoaInfoDTO getInfoPessoa(List<PessoaDTO> pessoaList){
        PessoaDTO maisVelha = getPessoaMaisVelha(pessoaList);
        PessoaDTO maisNova = getPessoaMaisNova(pessoaList);
        
        
        Double vmedia = media.calcular(pessoaList);

        return new PessoaInfoDTO(maisVelha, maisNova, vmedia);
    }
    
    
    private PessoaDTO getPessoaMaisVelha(List<PessoaDTO> pessoas){
        pessoas.sort(Comparator.comparing(PessoaDTO::getIdade));
        return pessoas.get(pessoas.size() -1);
    }

    private PessoaDTO getPessoaMaisNova(List<PessoaDTO> pessoas){
        pessoas.sort(Comparator.comparing(PessoaDTO::getIdade));
        return pessoas.get(0);
    }
    
}
