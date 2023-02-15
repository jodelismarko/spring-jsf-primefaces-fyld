package pt.fyld.app.service;

import pt.fyld.app.model.PessoaInfoDTO;

public interface PessoaInfoService {

    public PessoaInfoDTO getPessoas();

    public PessoaInfoDTO getPessoasByGenero(Character genero);

}