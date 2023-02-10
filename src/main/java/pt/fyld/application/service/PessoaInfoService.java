package pt.fyld.application.service;

import pt.fyld.application.model.PessoaInfoDTO;

public interface PessoaInfoService {

    public PessoaInfoDTO getPessoas();

    public PessoaInfoDTO getPessoasByGenero(Character genero);

}