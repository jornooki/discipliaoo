package br.com.facdf.banco.modelo;

public class AnalistaDeRequisitos extends Funcionario implements Autenticavel{

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

    @Override
    public boolean autentica(String senha) {
        return false;
    }

    @Override
    public void trocarSenha(String senha) {

    }
}
