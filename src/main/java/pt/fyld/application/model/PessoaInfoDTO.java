package pt.fyld.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaInfoDTO {
    private PessoaDTO maisVelha;
    private PessoaDTO maisNova;

    private Double mediaIdade;
}
