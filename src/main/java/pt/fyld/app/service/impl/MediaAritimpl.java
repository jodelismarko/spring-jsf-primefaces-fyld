package pt.fyld.app.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pt.fyld.app.model.PessoaDTO;
import pt.fyld.app.service.Media;

import java.util.ArrayList;
import java.util.List;

@Component
public class MediaAritimpl  implements Media{

    

	@Override
	public Double calcular(List<PessoaDTO> pessoas) {
		  ArrayList<Integer> mediaList = new ArrayList<>();
	        pessoas.forEach(p -> {
	            mediaList.add(p.getIdade());
	        });
	        Integer soma = mediaList.stream().mapToInt(Integer::intValue).sum();
	        Integer quantidade = mediaList.size();
	        return (double) soma / quantidade;
	}
}
