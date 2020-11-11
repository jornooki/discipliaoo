package br.com.facdf.banco.modelo;

public class Funcionario extends Pessoa {

    protected double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário deve ser positivo ");
        }
    }

    public double getBonificacao() {

        return this.salario += this.salario * 0.1;
    }

    @Override
    public String toString() {
        return " Funcionario " + this.getNome();

    }


}
