package br.com.facdf.banco.modelo;

public class Empresa {

    private String cnpj;

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return " Empresa: " + cnpj;
    }
}

