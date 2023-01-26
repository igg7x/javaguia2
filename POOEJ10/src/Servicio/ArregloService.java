/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Ignacio González
 */
public class ArregloService {
    
    Arreglo Arr ;
    public Arreglo crearArreglo1( Arreglo Arr){
        for (int i = 0; i <Arr.getArrayA().length; i++) {
           Arrays.fill(Arr.getArrayA(),i,i+1,(double)(Math.random()*99));
        }
      return Arr ; 
    }
    public void Mostrar(Arreglo Arr){
           System.out.print(Arrays.toString(Arr.getArrayA()));
           Arrays.sort(Arr.getArrayA());
    }
   public void crearArreglo2(){
       
       for (int i = 0; i < 10; i++) {
            Arrays.fill(Arr.getArrayB(), i, i+1,Arreglo);
       }
       
   }
}
