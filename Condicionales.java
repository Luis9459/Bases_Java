/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ejer;

/**
 *
 * @author luisf
 */
public class Condicionales {

    /**
     Condicionales
     */
    public static void main(String args[]) {
        /*
        La estructura condicional más simple en Java es el if,
        se evalúa una condición y en caso de que se cumpla se ejecuta 
        el contenido entre las llaves {} o en caso de que se omitan se 
        ejecuta el código hasta el primer «;» por lo tanto si no se usan los 
        {} la condición aplica solo a la siguiente instrucción al if.
        */
        System.out.println("------if--------");
        int x=0;
        int y=1;
        if (x == y){
            System.out.println("son iguales");
        }
        
        /*
        el else es en caso de que la principal no se cumpla
        */
        System.out.println("-----else if-----");
        int z=0;
        int a=1;
        if (x == y){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
        
        /*
        el else if es para colocar una condicion si la principal no se cumple
        */
        
        String b="Adios";
        
        if(b.equals("Hola")){
            System.out.println("Hola, cómo estás");
        }else if(b.equals("Adios")){
            System.out.println("Adiós perra");
        }
        
        /*
        SWITCH EN JAVA
        Con el switch se puede hacer un control del tipo if else if… más estructurado 
        pero en realidad no exactamente igual puesto que con el switch lo que se hace 
        es definir un conjunto de casos que van a tener una ejecución distinta y se ejecutará 
        el caso que coincida con el valor indicado en el switch.
        */
        
        int numero=3;
        
        switch (numero){
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
        }
    }
}
