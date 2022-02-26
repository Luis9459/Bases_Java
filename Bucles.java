
package ejer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisf
 */
public class Bucles {

    //bucles
    
    public static void main(String args[]) {
        
        /* los bucles Los bucles, iteraciones o sentencias repetitivas 
        modifican el flujo secuencial de un programa permitiendo la ejecución reiterada 
        de una sentencia o sentencias. En Java hay tres tipos diferentes de bucles: for, while y do-while.
        
        for (inicio; termino; iteracion)
        sentencia;
        
        */
        System.out.println("-------for---------");
        
        for (int i = 0; i <= 10; i++){
            System.out.println("4 x "+i+" = "+4*i);
        }
        
        /*
        [inicializacion;] 
        while (expresionLogica) {
        sentencias;
        [iteracion;]}
        
        */
        System.out.println("---------While-----------");
        
        int x= 0;
        while (x <= 10){
            System.out.println("4 x "+x+" = "+4*x);
            x++;
        }
        
        /*
        do {
        sentencias;
        [iteracion;] 
        } while (expresionLogica);
        */
        System.out.println("------do while-------");
        int y=0;
        do{
            System.out.println("4 x "+y+" = "+4*y);
            y++;
        }while (y <= 10);
        
        /*
        ForEach 
        El uso de Java ForEach nos permite recorrer la lista de elementos de 
        una forma mas compacta y el código se reduce.
        */
        System.out.println("------for each-------");
        
        List<String> lista = new ArrayList<String>();
        lista.add("holaa");
        lista.add("de nuevo");
        lista.add("y adiós");
        for(String cadena:lista){
            System.out.println(cadena);
        }
    }
}
