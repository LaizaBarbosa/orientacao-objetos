/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancasimples;

/**
 *
 * @author laiza.sbarbosa
 */
public class ContaCorrente extends Conta{
    private double LimiteEspecial;

    public double getLimiteEspecial() {
        return LimiteEspecial;
    }

    public void setLimiteEspecial(double LimiteEspecial) {
        this.LimiteEspecial = LimiteEspecial;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("LimiteEspecial: R$"+LimiteEspecial);
        
    }
    
    
}
