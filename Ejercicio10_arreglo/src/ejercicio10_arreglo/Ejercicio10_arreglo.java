/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_arreglo;

import Servicios.ArregloService;

/**
 *
 * @author Soso
 */
public class Ejercicio10_arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArregloService as = new ArregloService();
        
        as.crearArreglo();
        as.mostrarArreglo();
        
        as.ordenarArreglo();
        
        as.obtenerArregloB();
        
    }
    
}
