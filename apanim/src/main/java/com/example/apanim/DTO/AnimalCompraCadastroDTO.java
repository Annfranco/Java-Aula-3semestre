package com.example.apanim.DTO;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public class AnimalCompraCadastroDTO extends AnimalCadastroDTO {

    private Boolean pedigree;
    private BigDecimal valorDoAnimal;

    @NotNull 
    private Long vendedorId;

    public Long getVendedorId() {
        return vendedorId;
    }

    public Boolean getPedigree() {
        return pedigree;
    }

    public void setPedigree(Boolean pedigree) {
        this.pedigree = pedigree;
    }

    public BigDecimal getValorDoAnimal() {
        return valorDoAnimal;
    }

    public void setValorDoAnimal(BigDecimal valorDoAnimal) {
        this.valorDoAnimal = valorDoAnimal;
    }
}