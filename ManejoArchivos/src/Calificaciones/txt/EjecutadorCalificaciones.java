/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calificaciones.txt;

/**
 *
 * @author Grethy
 */
public class EjecutadorCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calificaciones aplicacion = new Calificaciones();

        aplicacion.abrir_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo();
    } // fin de main 
}
