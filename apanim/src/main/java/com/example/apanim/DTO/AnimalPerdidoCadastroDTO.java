package com.example.apanim.DTO;

import java.time.LocalDate;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalPerdidoCadastroDTO extends AnimalCadastroDTO{
    
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    
    @NotBlank
    private String localDaUltimaAparicao; 
    
    @NotBlank(message = "O Contato é obrigatório.")
    private String contato;

    public AnimalPerdidoCadastroDTO() {
    }

    public AnimalPerdidoCadastroDTO(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca,
            String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String logradouro,
            String bairro, String cor, boolean vacinado, boolean vermifugado, boolean castrado, String resumo,
            @NotNull LocalDate data, @NotNull String localDaUltimaAparicao,
            @NotBlank(message = "O Contato é obrigatório.") String contato, @NotNull Long usuarioId) { 
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, logradouro, bairro, cor,
                vacinado, vermifugado, castrado, resumo, usuarioId);
        this.data = data;
        this.localDaUltimaAparicao = localDaUltimaAparicao;
        this.contato = contato;
    }
}