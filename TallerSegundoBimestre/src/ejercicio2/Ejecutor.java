/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
    public static void main(String args[]) {
        LecturaEstudiantes aplicacion = new LecturaEstudiantes();

        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    } // fin de main
}
