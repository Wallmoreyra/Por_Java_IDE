/* 
 * Creado por Wall
 * Version 1.0
 * Creado el 15/4 Creo XD
*/
package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {
    
    public static void main(String[] args) {
        
       String palabra = "", palabraInvertida = "";
       int longitudPalabra = 0, Frase_ = 0;
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("Escribe una palabra o frace: ");
        palabra = entrada.nextLine();
        
        
        // Aqui cuento los caracteres
        longitudPalabra = palabra.length();
        // Asignamos la cantidad de caracteres antes de trabajar con ellos a otra variable
        Frase_ = longitudPalabra;
        
        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra -- ;
        }
        
        System.out.println("Palabra invertida: " + palabraInvertida);
        System.out.println("La frace posee "+ Frase_ +" caracteres");
        System.out.println("");
    }
    
    
}
