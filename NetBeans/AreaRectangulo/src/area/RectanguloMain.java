/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

import java.util.Scanner;

/**
 *
 * @author wmore
 */
public class RectanguloMain {
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdusca la base: ");
        int base = entrada.nextInt();
        
        System.out.print("Introdusca la Altura: ");
        int altura = entrada.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.Imprimir();
        
        
    }
    
}
