package br.com.facdf.banco.modelo;

public abstract class Funcionario extends Pessoa {

    protected double salario;
    protected long codigoFuncionario;

    public Double getSalario() {
        return salario;
    }

    public final void setSalario(Double salario) {
        if (salario > 1050) {
            this.salario = salario;
        } else {
            System.out.println("Salário deve ser maior que 1045 ");
        }
    }

    public abstract double getBonificacao();

    public long getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(long codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String toString() {
        return " Funcionario " + this.getNome();

    }


    public abstract void entregarDocumentos();
}
