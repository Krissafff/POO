package com.cursoandroid.teste;

public class Pessoa {

    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("Exibir o nome: " + nome + "Exibir a idade: " + idade);
    }

}
