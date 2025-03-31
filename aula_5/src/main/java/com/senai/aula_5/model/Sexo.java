package com.senai.aula_5.model;

public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    OUTRO("Outro");

    private String textoSexo;

    Sexo(String textoSexo) {
        this.textoSexo = textoSexo;
    }

    public String getTextoSexo() {
        return textoSexo;
    }
}
