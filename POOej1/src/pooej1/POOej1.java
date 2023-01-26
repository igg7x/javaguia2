/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;

/**
 *
 * @author Ignacio González
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Ignacio",19,44667316);
        
        //Persona persona2 = new Persona("Ignacio");
        
        //persona.setNombre("Joaquin");
        //persona2.getNombre();
          persona.Mostrar(persona);
        
    }
    
}
