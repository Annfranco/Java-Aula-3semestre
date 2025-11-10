package com.example.apanim.DTO;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import java.math.BigDecimal;

public class AnimalCompraResponseDTO extends AnimalResponseDTO {
    
    private Boolean pedigree;
    private BigDecimal valorDoAnimal;

    public AnimalCompraResponseDTO(
            Long id, 
            String nome, 
            FaixaEtariaAnimal faixaEtariaAnimal, 
            String raca,
            String porte, 
            SexoAnimal sexoAnimal, 
            String especie, 
            Boolean condicaoEspecial,
            String logradouro, 
            String bairro, 
            String cor, 
            Boolean vacinado,
            Boolean vermifugado, 
            Boolean castrado, 
            String resumo, 
            Long usuarioId,
            Boolean pedigree, 
            BigDecimal valorDoAnimal) {
    
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie,
              condicaoEspecial, logradouro, bairro, cor, vacinado, vermifugado,
              castrado, resumo, usuarioId);
        this.pedigree = pedigree;
        this.valorDoAnimal = valorDoAnimal;
    }

    public Boolean getPedigree() {
        return pedigree;
    }

    public BigDecimal getValorDoAnimal() {
        return valorDoAnimal;
    }
}
