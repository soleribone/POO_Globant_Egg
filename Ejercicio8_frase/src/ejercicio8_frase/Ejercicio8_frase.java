/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_frase;

import Servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Soso
 */
public class Ejercicio8_frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        CadenaService cs = new CadenaService();
        
        cs.crearCadena();
//        cs.mostrarVocales();
//        cs.invertirFrase();
//        
//        //tuve que dar aviso de que ingrese un caracter, y poner un scanner como parámetro de la función:
//         System.out.println("Ingrese un caracter:");
//         cs.vecesRepetido(read.next());
//         
//         System.out.println("Ingrese una frase:");
//         cs.compararLongitud(read.nextLine());
//         
//         System.out.println("Ingrese una frase:");
//         cs.unirFrases(read.nextLine());
         
         cs.reemplazar();
         
         System.out.println("Ingrese una letra:");
         cs.contiene(read.nextLine());
        
    }
    
}
