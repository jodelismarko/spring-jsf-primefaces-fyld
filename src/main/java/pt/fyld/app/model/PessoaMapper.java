package pt.fyld.app.model;

import org.springframework.stereotype.Service;

import pt.fyld.domain.entity.Pessoa;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaMapper {

    public PessoaDTO toPessoaDTO(Pessoa pessoa){
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setGenero(pessoa.getGenero());
        pessoaDTO.setIdade(pessoa.getIdade());
        return pessoaDTO;
    }

    public List<PessoaDTO> toPessoaDTOList(List<Pessoa> pessoas){
        List<PessoaDTO> pessoaDTOList = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            pessoaDTOList.add(this.toPessoaDTO(pessoa));
        }
        return pessoaDTOList;
    }
}
