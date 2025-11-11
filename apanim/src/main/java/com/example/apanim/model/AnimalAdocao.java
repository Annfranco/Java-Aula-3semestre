package com.example.apanim.model;
import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tab_animais_adocao")
@Inheritance(strategy = InheritanceType.JOINED)
public class AnimalAdocao extends AnimalModel {

    public AnimalAdocao() {
    }

    public AnimalAdocao(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca, String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String bairro, String cor, Boolean vacinado, Boolean vermifugado, Boolean castrado, String resumo) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, bairro, cor, vacinado, vermifugado, castrado, resumo);               
    
    }
}