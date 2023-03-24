package com.exerciseOB;

public class SmartWatch extends SmartDevice{
    Double tamanyoBrazalete;

    public SmartWatch(){

    }
    public SmartWatch(double tamanyoBrazalete,String color,String pantalla,String modelo,Double tamanyo){
        super(color,pantalla,modelo,tamanyo);
        this.tamanyoBrazalete = tamanyoBrazalete;
    }
}
