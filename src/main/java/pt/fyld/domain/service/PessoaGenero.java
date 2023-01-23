package pt.fyld.domain.service;

import org.springframework.stereotype.Service;

@Service
public class PessoaGenero {
    public Character getGenero(String nome){
        Character genero = nome.charAt(nome.length()-1);
        if (genero.equals('o')) {
            return 'M';
        }else{
            return 'F';
        }
    }
}
