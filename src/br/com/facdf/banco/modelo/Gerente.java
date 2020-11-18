package br.com.facdf.banco.modelo;

public class Gerente extends Funcionario {

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() > 4) {
            this.senha = senha;
        }
    }


    public double getBonificacao() {

        return super.salario += super.salario * 0.2;
    }


    public boolean autenticar(String senha) {
        if (this.senha.equalsIgnoreCase(senha)) {
            System.out.println("atenticado!!");
            return true;
        } else {
            System.out.println("senha errada");
            return false;
        }
    }



    @Override
    public String toString() {
        return " Gerente " + this.getSenha();
    }

    @Override
    public void entregarDocumentos() {

    }
}
