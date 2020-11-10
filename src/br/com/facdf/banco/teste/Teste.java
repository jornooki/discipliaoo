package br.com.facdf.banco.teste;


import br.com.facdf.banco.dao.ContaDao;
import br.com.facdf.banco.dao.EmpresaDao;
import br.com.facdf.banco.dao.EnderecoDao;
import br.com.facdf.banco.dao.GerenteDao;
import br.com.facdf.banco.modelo.*;

public class Teste {



    // nome do arquivo javac Conta.java
    // nome da classe java Conta


    public static void main (String args []) {

        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao");
        funcionario.setRg("123456");
        funcionario.setSalario(1000.0);

        System.out.println(funcionario.getBonificacao());

        Gerente segundoGerente = new Gerente();
        segundoGerente.setNome("Marcos Tércio");
        segundoGerente.setSenha("123456");
        segundoGerente.setSalario(2000.0);

        segundoGerente.autenticar("123456");
        System.out.println(segundoGerente.getBonificacao());

        Conta conta = new Conta("789");
        conta.setAgencia("agencia xpto");
        conta.setCodigoConta("10500");
        conta.depositar(100);

        System.out.println(conta.getCodigoSeguranca());

        ContaDao dao = new ContaDao();
        dao.salvar(conta);

        GerenteDao gerenteDao = new GerenteDao();
        segundoGerente.setSenha("1234567");

        gerenteDao.salvar(segundoGerente);



        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.salvar(endereco);

        EmpresaDao empresaDao = new EmpresaDao();
        Empresa facdf = new Empresa("123456789");

        empresaDao.salvar(facdf);


        /*
        *
        * Classe endereço com 3 atributos
        *
        * cep String
        * logradouro String
        * numero long
        *
        *
        * */


    }
}
