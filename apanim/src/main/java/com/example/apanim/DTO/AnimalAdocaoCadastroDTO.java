package com.example.apanim.DTO;

import com.example.apanim.Enum.FaixaEtariaAnimal;
import com.example.apanim.Enum.SexoAnimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalAdocaoCadastroDTO extends AnimalCadastroDTO {

    public AnimalAdocaoCadastroDTO() {
    }

    public AnimalAdocaoCadastroDTO(Long id, String nome, FaixaEtariaAnimal faixaEtariaAnimal, String raca, String porte, SexoAnimal sexoAnimal, String especie, String condicaoEspecial, String bairro, String cor, boolean vacinado, boolean vermifugado, boolean castrado, String resumo) {
        super(id, nome, faixaEtariaAnimal, raca, porte, sexoAnimal, especie, condicaoEspecial, bairro, cor, vacinado, vermifugado, castrado, resumo);
    }

    
    

}
