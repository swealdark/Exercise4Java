package com.exerciseOB;

public class SmartPhone extends SmartDevice{
//    atributos
    String camara;
//    constructors
    public SmartPhone(){

    }
    public SmartPhone(String camara,String modelo,String color,String pantalla, Double tamanyo){
        super(modelo,color,pantalla, tamanyo);
        this.camara = camara;
    }
//    methods
}
