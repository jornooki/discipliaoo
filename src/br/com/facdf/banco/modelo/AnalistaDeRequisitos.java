package br.com.facdf.banco.modelo;

public class AnalistaDeRequisitos extends Funcionario {

    @Override
    public double getBonificacao() {
        return this.salario += this.salario * 0.2;
    }

    @Override
    public void entregarDocumentos() {

    }

    public void levantarRequisitos() {
        System.out.println("levantando requisitos");
    }
}
