package pt.fyld.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaInfoDTO {
    private PessoaDTO maisVelha;
    private PessoaDTO maisNova;

    private Double mediaIdade;
}
