package com.mycompany.aplicacionconsola;

import com.mycompany.aplicacionconsola.matematicas.Calculadora;
import java.util.Scanner;

/**
 *
 * @author AULA301-PC1
 */
public class AplicacionConsola {

    public static void main(String[] args) {

        //un objeto para leer porteclado
        Scanner leerPorTeclado = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        int opcion;

        System.out.println("HOla soy unna calculadora");
        System.out.println("Ingresa una opcion para calcula"
                + " 1. suma , 2. resta 3.division 4.salir");
        opcion = leerPorTeclado.nextInt();

        System.out.println("Ingresa numero1");
        numero1 = leerPorTeclado.nextDouble();
        System.out.println("Ingresa numero2");
        numero2 = leerPorTeclado.nextDouble();
        
        Calculadora calculadora =   
        new Calculadora(numero1,
                        numero2
        );

        if (opcion == 1) {
            //resultado = AplicacionConsola.getSuma(numero1, numero2);
            resultado= calculadora.getSuma();
            System.out.println("resultado =" + resultado);
        } else if (opcion == 2) {
            resultado= calculadora.getResta();
            System.out.println("resultado =" + resultado);
        }
        else if (opcion == 3 && numero2!=0) {
           calculadora.getDivision();
        }else {
            System.out.println("Opcion no valida");
        }
    }
    
   
}
