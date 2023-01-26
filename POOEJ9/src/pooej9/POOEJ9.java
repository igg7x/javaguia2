/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidad.Matematica;
import Servicio.ServiceMate;

/**
 *
 * @author Ignacio González
 */
public class POOEJ9 {

    /** 
     * 
     *  Realizar una clase llamada Matemática que tenga como atributos dos números reales con
        los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
        constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
        Math.random para generar los dos números y se guardaran en el objeto con su
        respectivos set. Deberá además implementar los siguientes métodos:
        a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        al menor número. Previamente se deben redondear ambos valores.
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceMate Sm =  new ServiceMate ();
        Matematica mate = new Matematica((double) (Math.random() * 99),(double) (Math.random() *99));
        Sm.Mostrar(mate);
        System.out.println("El valor mayor es  : "+Sm.mayor(mate));
        System.out.println("La potencia del mayor valor es de  : "+Sm.potencia(mate));
        System.out.println("La raiz del menor valor es de : "+Sm.raiz(mate));
     }
    
}
