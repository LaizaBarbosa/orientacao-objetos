package com.mycompany.encapsulamento;

public class Losango {
    private double diagMaior, diagMenor, area;

    

    public Losango(double diagMaior, double diagMenor) {
        this.diagMaior = diagMaior;
        this.diagMenor = diagMenor;
    }

    public double getDiagMaior() {
        return diagMaior;
    }

    public void setDiagMaior(double diagMaior) {
        this.diagMaior = diagMaior;
    }

    public double getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor) {
        this.diagMenor = diagMenor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularLosango(){
        area = (diagMaior * diagMenor) / 2;
    }

    public void mostrarLosango(){
        calcularLosango();
        System.out.println("Losango");
        System.out.println("Diagonal maior -> "+getDiagMaior());
        System.out.println("Diagonal menor -> "+getDiagMenor());
        System.out.println("Area -> "+getArea());
        System.out.println("");
    }
    
}
