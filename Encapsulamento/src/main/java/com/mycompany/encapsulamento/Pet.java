package com.mycompany.encapsulamento;

public class Pet {
    private int id, idade;
    private String nome, raca;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void imprimir(){
        System.out.println("\n==========Ficha do PET============");
        System.out.println("Id: "+getId());
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Raça: "+getRaca());
        System.out.println("Idade do pet em dias: " + calcularIdadeDias());
        System.out.println("=====================================");
    }

    public int calcularIdadeDias(){
        return getIdade() * 360;
        
    }

    // um aluno necessita de um programa para calcular a area de um triangulo. todo triangulo tem uma base e uma altura. este aluno deseja calcular a area do triangulo e mostra-la na tela. 1- abstraia a classe triangulo 2-quais seriam os candidatos atributos da classe 3- quais metodos voces definiriam e porque
 }


