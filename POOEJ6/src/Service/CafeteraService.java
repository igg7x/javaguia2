/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;

/**
 *
 * @author Ignacio González
 */
public class CafeteraService {
    
    
    public Cafetera llenarCafetera(){
        Cafetera cafetera = new Cafetera();
        cafetera.setCapacidadActual(cafetera.getCapacidadMAX());
        return cafetera ; 
    }
    
    public  void servirTaza(double capTaza ,Cafetera cafetera ){
       double  aux = capTaza;
        if (capTaza<= cafetera.getCapacidadActual()) {
            cafetera.setCapacidadActual(cafetera.getCapacidadActual()-capTaza) ;
            System.out.println("Se lleno la taza ");
        }else{
            capTaza = cafetera.getCapacidadActual();
            System.out.println("La taza no se lleno completamente,se lleno en un  : " +((capTaza/aux)*100)+ " % ");
        }   
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);   
    }
    public void agregarCafe(double cant , Cafetera cafetera){
        cafetera.setCapacidadMAX(cant);
    }
}
