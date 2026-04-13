/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancasimples;

/**
 *
 * @author laiza.sbarbosa
 */
public class Papagaio extends Animal{
    private boolean temPena;

    public boolean isTemPena() {
        return temPena;
    }

    public void setTemPena(boolean temPena) {
        this.temPena = temPena;
    }
    
    public void voar(){
        System.out.println("flap flap flap");
    }
    
    public void mostrar(){
        System.out.println("PAPAGAIO");
        super.mostrar();
        System.out.println("Tem pena: "+temPena);
    }
}