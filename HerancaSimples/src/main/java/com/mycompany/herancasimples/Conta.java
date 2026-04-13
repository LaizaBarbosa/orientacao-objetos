/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancasimples;

/**
 *
 * @author laiza.sbarbosa
 */
public class Conta {
    protected double saldo;
    protected String nome_titular;
    protected String cartao;
    
    public void depositar(double valor){
        if(valor >= 0){
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
    }else{
        System.out.println("Digite um valor maior que zero para o depósito");
    }
    }
    
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("valor indisponivel para saldo");
        }else{
            saldo = saldo - valor;
            System.out.println("Valor sacado: "+ valor);
        }
    }
    
    public void obterSaldo(){
        System.out.println("Saldo atual: R$"+saldo);
    }
    
    public void mostrar(){
        System.out.println("\nNome: "+ nome_titular +" cartao: "+ cartao +"Saldo"+saldo);
    }
        
    
}
