/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14_teléfono;

import Servicios.MovilService;

/**
 *
 * @author Soso
 */
public class Ejercicio14_teléfono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MovilService ms = new MovilService();
        
        ms.cargarCelular();
        ms.mostrarDatos();
        
        
    }
    
}
