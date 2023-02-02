package pt.fyld.application.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.application.model.PessoaInfoDTO;

import java.util.List;

@Service
public class PessoaInfoDTOBuilder {

    @Autowired
    private CalculaMedia calculaMedia;

    @Autowired
    private FiltroPessoa filtroPessoa;

    public PessoaInfoDTO getInfoPessoaDTO(List<PessoaDTO> pessoaList){
        return PessoaInfoDTO.builder()
                .maisVelha(filtroPessoa.getPessoaMaisVelha(pessoaList))
                .maisNova(filtroPessoa.getPessoaMaisNova(pessoaList))
                .mediaIdade(calculaMedia.getMedia(pessoaList))
                .build();
    }
}
