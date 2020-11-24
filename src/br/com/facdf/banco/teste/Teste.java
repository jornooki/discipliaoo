package br.com.facdf.banco.teste;


import br.com.facdf.banco.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main (String args []) {



        List<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa cliente = new Cliente();
        cliente.setNome("Jose");
        listaPessoas.add(cliente);


        Pessoa gerente = new Gerente();
        gerente.setNome("Marcos Tércio");
        listaPessoas.add(gerente);

        Pessoa programador = new Programador();
        programador.setNome("Luiz");
        listaPessoas.add(programador);

        Pessoa analista = new AnalistaDeRequisitos();
        analista.setNome("Nathalia");
        listaPessoas.add(analista);

        if(listaPessoas.isEmpty()) {
            for (Pessoa f : listaPessoas) {
                System.out.println(f.getNome());
            }
        }


        Programador programador1 = new Programador();
        programador1.realizarCadastro();
        programador1.setSalario(1000D);

        //Dado que o usuario tenha acesso a tela de lista de clientes
        // e liste todas as pessoas do sistema
        // e crie a classe cliente





    }
}
