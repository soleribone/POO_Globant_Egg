/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13_vectores;

import Servicios.CursoService;

/**
 *
 * @author Soso
 */
public class Ejercicio13_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoService cs = new CursoService();
       

        cs.crearCurso();
        cs.calcularGananciaSemanal();
        
        
        
    }
    
}
