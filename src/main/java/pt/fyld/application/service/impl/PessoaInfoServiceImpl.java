package pt.fyld.application.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.fyld.application.mapper.PessoaMapper;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.application.model.PessoaInfoDTO;
import pt.fyld.application.service.PessoaInfoBuilder;
import pt.fyld.application.service.PessoaInfoService;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.repository.PessoaRepository;

@Service
public class PessoaInfoServiceImpl implements PessoaInfoService{
	
	    @Autowired
	    private PessoaRepository pessoaRepository;
	   
	    @Autowired
	    private PessoaMapper pessoaMapper;
	    
	    @Autowired
	    private PessoaInfoBuilder pessoaInfoBuilder;
	    
	    
	    

	    public PessoaInfoDTO getPessoas() {
	    	
	        List<PessoaDTO> pessoaList = getPessoaDtolist();
	        
	        PessoaInfoDTO pessoaInfoDTO = pessoaInfoBuilder.getInfoPessoa(pessoaList);
	        return pessoaInfoDTO;
	    }

	    public PessoaInfoDTO getPessoasByGenero(Character genero) {
	    	
	        List<PessoaDTO> pessoaList =  getPessoasBySexo(genero);
	        PessoaInfoDTO pessoaInfoDTO = pessoaInfoBuilder.getInfoPessoa(pessoaList);
	        
	        return pessoaInfoDTO;
	    }
	    
	    

	    private List<PessoaDTO> getPessoaDtolist() {
	        List<Pessoa> pessoaList = pessoaRepository.getAll();
	        return pessoaMapper.toPessoaDTOList(pessoaList);
	    }


	    private List<PessoaDTO> getPessoasBySexo(Character genero) {
	        List<PessoaDTO> pessoaDTOList = getPessoaDtolist()
	                .stream()
	                .filter(p -> p.getGenero() == genero)
	                .collect(Collectors.toList());
	        return pessoaDTOList;
	    }


}
