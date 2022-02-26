
package ejer;

/**
 *
 * @author luisf
 */
public class Variables {

    //primeros ejercicios de java
    //comenzamos con el comienzo de las variables
    
    public static void main(String[] args) {
        
        /*¿Qué es una variable?
        //Una variable es el nombre dado a una ubicación de memoria. 
        Es la unidad básica de almacenamiento en un programa. El valor almacenado en una variable se puede 
        cambiar durante la ejecución del programa.
        
        Tipo de dato -> nombre de variable -> valor 
        
        byte = Numérico que van [-128 : 127]
        short = Numérico que van [-32.768 : 32.767]
        int = Número entero con signo
        long = Numérico muy largo
        
        float or double = Numérico para decimales 
        
        boolean = evaluar entre True o False
        char = caracteres individuales, sea número o letra 
        
        String = almacenar cadenas de caracteres (palabras)
        
        Array = colecciones de datos de un mismo tipo
        
        */
        
        byte Byte = -10;
        short Short = -23000;
        int Int = 15;
        long Long = 10000000;
        float Float = 5.6f;
        double Double = -543.2;
        boolean Boolean = true;
        char Char = 'a';
        String string = "Hola";
        String array [] = {"hola","Adiós","again"};
        
        System.out.println(Byte +"\n"+Short+"\n"+Int+"\n"+Long+"\n"+Float+"\n"+Double+"\n"+Boolean+"\n"+Char+"\n"+string);
        
        for (int i = 0; i <= array.length-1; i++){
            System.out.println(array[i]);
        }
        
    }
    
}
