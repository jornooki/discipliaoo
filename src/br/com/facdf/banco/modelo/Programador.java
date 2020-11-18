package br.com.facdf.banco.modelo;

public class Programador extends Funcionario {


    @Override
    public double getBonificacao() {
        return this.salario += this.salario * 0.1;
    }

    @Override
    public void entregarDocumentos() {

    }

    public void programar(){

        System.out.println("Enviar documentos por e-mail");
    }
}
