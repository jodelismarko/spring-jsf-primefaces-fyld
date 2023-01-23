package pt.fyld.application.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.fyld.application.mapper.PessoaMapper;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.repository.PessoaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PessoaMapper pessoaMapper;

    public List<PessoaDTO> getPessoas() {
        List<Pessoa> pessoaList = pessoaRepository.getAll();
        return pessoaMapper.toPessoaDTOList(pessoaList);
    }


    public List<PessoaDTO> getPessoasBySexo(Character genero) {
        List<PessoaDTO> pessoaDTOList = this.getPessoas()
                .stream()
                .filter(p -> p.getGenero() == genero)
                .collect(Collectors.toList());
        return pessoaDTOList;
    }

}
