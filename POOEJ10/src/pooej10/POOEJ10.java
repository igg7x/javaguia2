/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import Entidad.Arreglo;
import Servicio.ArregloService;

/**
 *
 * @author Ignacio González
 */
public class POOEJ10 {

    /**
     * 
        *   Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
            de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
            programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
            Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
            ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
            0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
            20. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArregloService As = new ArregloService();
        Arreglo array = new Arreglo();
        As.crearArreglo1(array);
        As.Mostrar(array);
        
    }
    
}