/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancasimples;

/**
 *
 * @author laiza.sbarbosa
 */
public class Jacare extends Animal{
    private boolean temEscama;

    public boolean isTemEscama() {
        return temEscama;
    }

    public void setTemEscama(boolean temEscama) {
        this.temEscama = temEscama;
    }
    
    public void nadar(){
        System.out.println("splash splash splash");
    }
    
    public void mostrar(){
        System.out.println("JACARE");
        super.mostrar();
        System.out.println("Tem escama: "+temEscama);
    }
}
