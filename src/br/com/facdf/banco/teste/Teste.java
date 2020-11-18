package br.com.facdf.banco.teste;


import br.com.facdf.banco.modelo.AnalistaDeRequisitos;
import br.com.facdf.banco.modelo.Funcionario;
import br.com.facdf.banco.modelo.Gerente;
import br.com.facdf.banco.modelo.Programador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main (String args []) {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario gerente = new Gerente();
        gerente.setNome("Marcos Tércio");
        listaFuncionarios.add(gerente);

        Funcionario programador = new Programador();
        programador.setNome("Luiz");
        listaFuncionarios.add(programador);

        Funcionario analista = new AnalistaDeRequisitos();
        analista.setNome("Nathalia");
        listaFuncionarios.add(analista);



        for (Funcionario f : listaFuncionarios) {

            if(f.getNome().equalsIgnoreCase("nathalia")) {
                System.out.println(f.getNome());
            }
        }



        //Dado que o usuario tenha acesso a tela de lista de clientes
        // e liste todas as pessoas do sistema
        // e crie a classe cliente





    }
}
