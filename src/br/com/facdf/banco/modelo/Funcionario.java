package br.com.facdf.banco.modelo;

public class Funcionario extends Pessoa {

    private double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {

        return this.salario * 0.1;
    }

    @Override
    public String toString() {
        return " Funcionario " + this.getNome();

    }






}
