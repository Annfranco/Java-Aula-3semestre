package com.example.apanim.model;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tab_animais_compra")
public class AnimalCompra extends AnimalModel {

    private Boolean pedigree;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorDoAnimal;

    @ManyToOne(fetch = FetchType.LAZY) // (Opcional, mas bom para performance)
    @JoinColumn(name = "vendedor_id", nullable = false)
    private VendedorModel vendedor;

    public AnimalCompra() {
    }

    public AnimalCompra(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca, String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String logradouro, String bairro, String cor, Boolean vacinado, Boolean vermifugado, Boolean castrado, String resumo, Boolean pedigree, BigDecimal valorDoAnimal) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, logradouro, bairro, cor, vacinado, vermifugado, castrado, resumo);
        this.pedigree = pedigree;
        this.valorDoAnimal = valorDoAnimal;
    }

}