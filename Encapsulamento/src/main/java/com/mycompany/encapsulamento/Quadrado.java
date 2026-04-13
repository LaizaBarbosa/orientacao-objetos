package com.mycompany.encapsulamento;

public class Quadrado {
    private double lado, area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularAreaQuadrado(){
        area = Math.pow(lado, 2);
    }

    public void mostrarQuadrado(){
        calcularAreaQuadrado();
        System.out.println("Quadrado");
        System.out.println("Lado -> "+getLado());
        System.out.println("Area -> "+getArea());
        System.out.println("");
    }
    
}
