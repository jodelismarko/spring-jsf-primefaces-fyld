package pt.fyld.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.fyld.application.mapper.PessoaMapper;
import pt.fyld.application.model.PessoaDTO;
import pt.fyld.application.model.PessoaInfoDTO;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.repository.PessoaRepository;

import java.util.List;
import java.util.stream.Collectors;


 

public interface PessoaInfoService {
	
    

    public PessoaInfoDTO getPessoas();
     

    public PessoaInfoDTO getPessoasByGenero(Character genero);
    	
       
    
 
    
    
}
