package pt.fyld.application.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.application.model.PessoaInfoDTO;

import java.util.List;

@Service
public class PessoaInfo {

    @Autowired
    private CalculaMedia calculaMedia;

    @Autowired
    private FiltroPessoa filtroPessoa;

    public PessoaInfoDTO getInfoPessoa(List<PessoaDTO> pessoaList){
        PessoaDTO maisVelha = filtroPessoa.getPessoaMaisVelha(pessoaList);
        PessoaDTO maisNova = filtroPessoa.getPessoaMaisNova(pessoaList);
        Double media = calculaMedia.getMedia(pessoaList);

        return new PessoaInfoDTO(maisVelha, maisNova, media);
    }
}
