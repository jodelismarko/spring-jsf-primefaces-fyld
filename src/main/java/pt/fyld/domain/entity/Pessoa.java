package pt.fyld.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private Long id;
    private String nome;
    private Character genero;
    private Integer idade;
}
