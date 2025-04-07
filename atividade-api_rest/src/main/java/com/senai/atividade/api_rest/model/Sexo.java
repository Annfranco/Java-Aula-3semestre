package com.senai.atividade.api_rest.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }
}
