package com.mycompany.encapsulamento;

public class Trapezio {
    private double baseMaior, baseMenor, altura, area;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularTrapezio(){
        area = ((baseMaior + baseMenor)* altura)/2;
    }

    public void mostrarTrapezio(){
        calcularTrapezio();
        System.out.println("Trapezio");
        System.out.println("Base maior -> "+ getBaseMaior());
        System.out.println("Base menor -> "+ getBaseMenor());
        System.out.println("Altura -> "+ getAltura());
        System.out.println("Area -> "+ getArea());
        System.out.println("");
    }
}
