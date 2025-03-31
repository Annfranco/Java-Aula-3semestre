package com.senai.aula_5.model;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");

    private String textoSetor;

    Setor(String textoSetor) {
        this.textoSetor = textoSetor;
    }

    public String getTextoSetor() {
        return textoSetor;
    }
}
