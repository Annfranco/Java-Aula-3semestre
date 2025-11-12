package com.example.apanim.DTO;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalPerdidoCadastroDTO extends AnimalCadastroDTO {

    @NotNull
    private String data;

    @NotBlank
    private String localDaUltimaAparicao;

    @NotBlank
    private String contato;

    public AnimalPerdidoCadastroDTO() {
    }

    public AnimalPerdidoCadastroDTO(Long id, @NotBlank(message = "O nome é obrigatório.") String nome,
            @NotNull(message = "A Faixa Etária é obrigatório.") FaixaEtariaAnimal faixaEtariaAnimal,
            @NotBlank(message = "A raça é obrigatório.") String raca,
            @NotBlank(message = "O porte é obrigatório.") String porte,
            @NotNull(message = "O sexo é obrigatório.") SexoAnimal sexoAnimal,
            @NotBlank(message = "A espécie é obrigatório.") String especie, @NotBlank String condicaoEspecial,
            @NotBlank(message = "O bairro é obrigatório.") String bairro, @NotBlank String cor,
            @NotNull boolean vacinado, @NotNull boolean vermifugado, @NotNull boolean castrado, String resumo,
            @NotNull Long usuarioId, @NotNull String data, @NotBlank String localDaUltimaAparicao,
            @NotBlank String contato) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, bairro, cor, vacinado,
                vermifugado, castrado, resumo, usuarioId);
        this.data = data;
        this.localDaUltimaAparicao = localDaUltimaAparicao;
        this.contato = contato;
    }

   

    

}
