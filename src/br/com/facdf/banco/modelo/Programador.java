package br.com.facdf.banco.modelo;

public class Programador extends Funcionario implements Autenticavel {


    @Override
    public double getBonificacao() {
        return this.salario += this.salario * 0.1;
    }

    @Override
    public void entregarDocumentos() {

    }

    public void programar(){

        System.out.println("Enviar por email");
    }

    public void update(){

    }

    @Override
    public boolean autentica(String senha) {
        return false;
    }

    @Override
    public void trocarSenha(String senha) {

    }
}
