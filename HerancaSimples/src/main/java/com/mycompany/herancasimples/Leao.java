/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancasimples;

/**
 *
 * @author laiza.sbarbosa
 */
public class Leao extends Animal{
    private boolean temJuba;

    public boolean isTemJuba() {
        return temJuba;
    }

    public void setTemJuba(boolean temJuba) {
        this.temJuba = temJuba;
    }
    
    public void correr(){
        System.out.println("puf puf puf puf");
    }
    
    public void mostrar(){
        System.out.println("LIAO");
        super.mostrar();
        System.out.println("Tem juba: "+temJuba);
    }
}
