package com.mycompany.encapsulamento;

public class Circulo {
    private double raio, area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularCircunferencia(){
        area = Math.PI * Math.pow(raio, 2);
    }

    public void mostrarCircunferencia(){
        calcularCircunferencia();
        System.out.println("Circulo SENAC");
        System.out.println("Raio -> "+getRaio());
        System.out.println("Area ->"+getArea());
        System.out.println("");
    }

}
