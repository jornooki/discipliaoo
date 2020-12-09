package br.com.facdf.banco.teste;

import br.com.facdf.banco.dao.ContaDao;
import br.com.facdf.banco.modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {

    public static void main (String args []) {

//        git branch nomeDeVoces
//        git checkout nomeDeVoces
//        git push origin nomeDeVoces

        Gerente gerente = new Gerente();
        gerente.pagarSalario(6000d);
        System.out.println(gerente.getSalario());


        Programador programador = new Programador();
        programador.pagarSalario(2000d);
        System.out.println("Salario programador " +programador.getSalario());


        Conta conta = new Conta();

        ContaDao dao = new ContaDao();
        dao.deletar(conta);


        List<Pessoa> listaPessoas = new ArrayList<>();

        Endereco endereco = new Endereco();
        endereco.setLogradouro("rua 45");

        Pessoa cliente = new Cliente();
        cliente.setNome("Jose");
        listaPessoas.add(cliente);
        cliente.setEndereco(endereco);

        Pessoa cliente2 = new Cliente();
        cliente.setNome("Jose");
        cliente.setEndereco(endereco);

        Dependente dependente = new Dependente();
        dependente.setNome("joao");
        dependente.setCodigoDependente(15464);
        dependente.setCliente((Cliente)cliente);

        Date date = new Date();
        Dependente dependente2 = new Dependente();
        dependente.setDataNascimento(date);
        dependente2.setNome("Maria");
        dependente2.setCodigoDependente(15464);
        dependente2.setCliente((Cliente)cliente);

        imprimirInformacoesDependente(dependente);

        imprimirInformacoesDependente(dependente2);








    }

    private static void imprimirInformacoesDependente(Dependente qualquerDependente) {
        System.out.println(qualquerDependente.getNome());
        System.out.println(qualquerDependente.getCliente().getNome());
        System.out.println(qualquerDependente.getCliente().getEndereco().getLogradouro());
    }
}





