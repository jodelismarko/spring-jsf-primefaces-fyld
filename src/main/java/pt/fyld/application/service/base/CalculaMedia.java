package pt.fyld.application.service.base;

import org.springframework.stereotype.Service;
import pt.fyld.application.model.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculaMedia {

    public Double getMedia(List<PessoaDTO> pessoas){
        ArrayList<Integer> mediaList = new ArrayList<>();
        pessoas.forEach(p -> {
            mediaList.add(p.getIdade());
        });
        Integer soma = mediaList.stream().mapToInt(Integer::intValue).sum();
        Integer quantidade = mediaList.size();
        return (double) soma / quantidade;
    }
}
