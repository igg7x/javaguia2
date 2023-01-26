/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class POOEJ6 {

    /**
     * 
     * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
        actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
        • Constructor predeterminado o vacío
        • Constructor con la capacidad máxima y la cantidad actual
        • Métodos getters y setters.
        • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
        • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
        • Método vaciarCafetera(): pone la cantidad de café actual en cero.
        • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner read = new Scanner(System.in);
        CafeteraService Cs=new CafeteraService();
        Cafetera  cafetera = new Cafetera();
        Opciones();
        op = read.nextInt();
        while(op !=0){
            switch(op){
                case 1 : {
                  cafetera = Cs.llenarCafetera();
                    break;
                }
                case 2 : {
                    System.out.println("Ingrese el tamaño de la taza del cafe a servir  : ");
                    Cs.servirTaza(read.nextDouble(), cafetera);
                    break;
                }
                case 3 : {
                    Cs.vaciarCafetera(cafetera);
                    break;
                }
                case 4 : {
                    
                    System.out.println("Ingresar la cantidad de cafe a agregar :");
                    Cs.agregarCafe(read.nextDouble(), cafetera);
                    break;
                }
                default : {
                    System.out.println("Agrege la opcion correcta : ");
                }
            }
            Opciones();
            op = read.nextInt();  
        }  
    }
     public static void Opciones (){
        System.out.println("MENU");
        System.out.println("1-Llenar cafetera ");
        System.out.println("2-Servir");
        System.out.println("3-Vaciar cafetera");
        System.out.println("4-Agregar Cafe ");
        System.out.println("0-SALIR");
        System.out.println("");
        System.out.print("Ingrese opcion :  ");
        
    }
}
