/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Grethy
 */
public class CalculoFactorial {
    public double factorial (double numero){
        if(numero <= 1){
            return 1; //Caso base: 0! = 1 y 1! = 1
        }else{ //paso recursivo
        return numero * factorial(numero - 1);
        }
    }
    
    public void mostrarFactorial(){
        //Calcula los factoriales del 0 al 4
        for(int contador = 0; contador <= 4; contador++){
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }
    }
    
    public static void main(String[] args) {
        CalculoFactorial cal = new CalculoFactorial();
        cal.mostrarFactorial();
    }
}


