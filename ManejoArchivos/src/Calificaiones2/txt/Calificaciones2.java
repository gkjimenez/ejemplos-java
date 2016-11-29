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

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Calificaciones2 {
    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("datos2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        try // lee registros del archivo, usando el objeto Scanner
        {
            double valor, valor2;
            double mayor = 0;
            double promedio = 0;
            
            while (entrada.hasNext()) { 
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                System.out.println(linea_partes);     
                
                valor = Double.parseDouble(linea_partes.get(2));
                valor2 = Double.parseDouble(linea_partes.get(3));
                promedio = ((valor + valor2)/ 2);
                
                System.out.printf("Promedio de califiaciones de %s %s es: %.2f\n\n" , linea_partes.get(0), linea_partes.get(1), promedio);
                
                if (promedio > mayor) {
                    mayor = promedio;
                }
            } // fin de while            
                
            System.out.printf("EL MEJOR PROMEDIO ES: %.2f\n", mayor);
            
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
}
