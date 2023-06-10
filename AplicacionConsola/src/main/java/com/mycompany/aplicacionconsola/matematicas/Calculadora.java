package com.mycompany.aplicacionconsola.matematicas;

public class Calculadora {
    
    /**
     * Atributos
     */
    
    protected double  operacion1;
    
    private double operacion2;
    
    /*
    *Constructror 
    */

    public Calculadora(double operacion1, double operacion2) {
        this.operacion1 = operacion1;
        this.operacion2 = operacion2;
    }
    
    /**
     * Metodos
     */
    
    public double getSuma(){
        return  this.operacion1+this.operacion2;
    }
    public double getResta(){
        return  operacion1-operacion2;
    }
    
}
