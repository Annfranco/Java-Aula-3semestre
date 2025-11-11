package com.example.apanim.DTO;

import java.time.LocalDate;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalPerdidoResponseDTO extends AnimalResponseDTO {
    private LocalDate data;
    private String localDaUltimaAparicao; 
    private String contato;
    
    public AnimalPerdidoResponseDTO() {
    }

    public AnimalPerdidoResponseDTO(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca, String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String logradouro, String bairro, String cor, boolean vacinado, boolean vermifugado, boolean castrado, String resumo, Long usuarioId, LocalDate data, String localDaUltimaAparicao, String contato) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, logradouro, bairro, cor, vacinado, vermifugado, castrado, resumo, usuarioId);
        this.data = data;
        this.localDaUltimaAparicao = localDaUltimaAparicao;
        this.contato = contato;
    }
}