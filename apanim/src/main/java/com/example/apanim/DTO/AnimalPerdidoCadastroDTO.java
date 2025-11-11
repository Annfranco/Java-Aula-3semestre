package com.example.apanim.DTO;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalPerdidoCadastroDTO extends AnimalAdocaoCadastroDTO {

    @NotNull
    private String data;

    @NotBlank
    private String localDaUltimaAparicao;

    @NotBlank
    private String contato;

    public AnimalPerdidoCadastroDTO() {
    }

    public AnimalPerdidoCadastroDTO(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca,
            String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String logradouro,
            String bairro, String cor, boolean vacinado, boolean vermifugado, boolean castrado, String resumo,
            @NotNull String data, @NotBlank String localDaUltimaAparicao, @NotBlank String contato) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, logradouro, bairro, cor,
                vacinado, vermifugado, castrado, resumo);
        this.data = data;
        this.localDaUltimaAparicao = localDaUltimaAparicao;
        this.contato = contato;
    }

}
