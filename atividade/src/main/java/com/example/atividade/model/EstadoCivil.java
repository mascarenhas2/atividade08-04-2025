package com.example.atividade.model;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    VIUVO("Viuvo"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado");

    private String texto;

    EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}