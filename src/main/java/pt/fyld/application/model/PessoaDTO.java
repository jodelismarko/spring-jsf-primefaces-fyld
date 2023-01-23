package pt.fyld.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    private String nome;
    private Character genero;
    private Integer idade;
}
