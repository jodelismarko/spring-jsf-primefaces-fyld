package pt.fyld.domain.repository;

import org.springframework.stereotype.Repository;
import pt.fyld.domain.entity.Pessoa;
import pt.fyld.domain.service.PessoaGenero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Repository
public class PessoaRepository {

    PessoaGenero pessoaGenero = new PessoaGenero();
    List<Pessoa> pessoas = new ArrayList<>();
    Random gerador = new Random();
    List<String> itens = Arrays.asList("Thiago", "Marko", "Marcela","Cladio","Ana","Daniela","Fernanda","Cristina","Teo","Pedro");

    public List<Pessoa> getAll(){
        if(pessoas.isEmpty()){
            for (int i = 0; i < 10; i++) {
                Pessoa novaPessoa = new Pessoa();
                novaPessoa.setNome(itens.get(i));
                novaPessoa.setGenero(pessoaGenero.getGenero(itens.get(i)));
                novaPessoa.setIdade((gerador.nextInt(50)+ 23));
                pessoas.add(novaPessoa);
            }
        }
        return pessoas;
    };

    public List<Pessoa> getPessoasByGenero(Character genero){
        return this.getAll().stream()
                .filter(p -> p.getGenero() == genero)
                .collect(Collectors.toList());
    }

}
