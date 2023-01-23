package pt.fyld.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.application.model.PessoaInfoDTO;
import pt.fyld.application.service.base.PessoaInfo;

import java.util.List;

@Service
public class PessoaInfoService {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private PessoaInfo pessoaInfo;

    public PessoaInfoDTO getPessoas() {
        List<PessoaDTO> pessoaList = pessoaService.getPessoas();
        PessoaInfoDTO pessoaInfoDTO = pessoaInfo.getInfoPessoa(pessoaList);
        return pessoaInfoDTO;
    }

    public PessoaInfoDTO getPessoasByGenero(Character genero) {
        List<PessoaDTO> pessoaList = pessoaService.getPessoasBySexo(genero);
        PessoaInfoDTO pessoaInfoDTO = pessoaInfo.getInfoPessoa(pessoaList);
        return pessoaInfoDTO;
    }
}
