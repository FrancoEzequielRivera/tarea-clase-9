package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculadora calcu = new Calculadora();

        System.out.println(calcu.sumar(1.0, 1.0));      //2
        System.out.println(calcu.restar( 2.0, 1.0));    //1
        System.out.println(calcu.multiplicar(2.0, 2.0));//4
        System.out.println(calcu.dividir(10.0, 5.0));   //2
    }
}