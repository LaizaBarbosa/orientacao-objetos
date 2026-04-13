/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author laiza.sbarbosa
 */
public class Encapsulamento {

    public static void main(String[] args) {
        // Pet op1 = new Pet();
        // op1.setId(1);
        // op1.setNome("bilu");
        // op1.setIdade(12);
        // op1.setRaca("rato");

        // op1.imprimir();

        Triangulo ot = new Triangulo(45, 35);
        ot.mostrarTriangulo();

        Circulo c1 = new Circulo(6);
        c1.mostrarCircunferencia();

        Quadrado q1 = new Quadrado(10);
        q1.mostrarQuadrado();

        Trapezio t1 = new Trapezio(10, 6, 5);
        t1.mostrarTrapezio();

        Losango l1 = new Losango(8, 5);
        l1.mostrarLosango();
    }
}
