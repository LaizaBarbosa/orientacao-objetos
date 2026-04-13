/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author laiza.sbarbosa
 */
public class Triangulo {
    private double area,altura,base;

    public Triangulo(double altura, double base) {
        setAltura(altura);
        setBase(base);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calcularArea(){
        area = (base * altura) / 2;
    }

    public void mostrarTriangulo(){
        calcularArea();
        System.out.println("Triangulo SENAC");
        System.out.println("Base -> "+getBase());
        System.out.println("Altura -> "+getAltura());
        System.out.println("Area -> "+getArea());
        System.out.println("");
    }
}
