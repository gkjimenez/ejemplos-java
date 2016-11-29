/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calificaiones2.txt;

/**
 *
 * @author Grethy
 */
public class EjecutadorCalificaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calificaciones2 aplicacion = new Calificaciones2();

        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    }
    
}
