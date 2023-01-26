/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class PersonaService {
    
    Persona persona ; 
    public Persona crearPersona(Persona persona){
        
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        persona.setNombre(read.nextLine());
        System.out.print("Ingrese su edad : ");
        persona.setEdad(read.nextInt());
        System.out.print("Ingrese sexo : ('H' hombre, 'M' mujer, 'O' otro) : ");
        persona.setSexo(read.next());
        while(!"M".equalsIgnoreCase(persona.getSexo())&&!"H".equalsIgnoreCase(persona.getSexo())&&!"O".equalsIgnoreCase(persona.getSexo())){
            System.out.print("Ingrese un sexo correcto : ");
            persona.setSexo(read.next());
        }
        System.out.print("Ingrese su peso : ");
        persona.setPeso(read.nextDouble());
        System.out.print("Ingrese su altura : ");
        persona.setAltura(read.nextDouble());
        return persona;
    }
    public int  calcularIMC(Persona persona){
        
        double peso = (persona.getPeso()/(persona.getAltura()*persona.getAltura())) ;
        if (peso < 20 ) {
            return  -1 ;
        }else if (peso>= 20 && peso <= 25 ){
            return 0 ; 
        } else {
            return 1 ; 
        }
       
    }
    
    public boolean mayordeEdad(Persona persona) throws Exception {
       
        if(persona == null ){
         throw new Exception("El objeto no puede ser NULL");
        }else{
            if (persona.getEdad() >= 18) {
                return true;
            }
        }
        return false;
    }
}
