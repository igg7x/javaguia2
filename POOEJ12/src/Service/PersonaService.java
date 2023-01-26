/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class PersonaService {
    
    
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        persona.setNombre(read.nextLine());
        System.out.print("Ingrese el dia de su fecha de nacimiento : " );
        persona.getFecha().setDate(read.nextInt());
        System.out.print("Ingreses el med de su fecha de nacimento : ");        
        persona.getFecha().setMonth(read.nextInt());
        System.out.print("Ingrese el año de su fecha de nacimiento : ");
        persona.getFecha().setYear(read.nextInt());
        return persona ;
    }
    public int CalcularEdad( Persona persona){
        Date FechaActual = new Date();
        int a = FechaActual.getYear(),b=persona.getFecha().getYear()-1900;
        return (a-b);
    }
            
    
    public boolean menorQue(int edad,Persona persona){
      
          Date FechaActual = new Date();
          int a = FechaActual.getYear(),b=persona.getFecha().getYear()-1900;
      if((a-b)<edad){
          return true ;
      }else if ((a-b)>edad){
          return false;
      }else{
          return false ;
      }
    }
    public void mostrarPersona(Persona persona){
        System.out.println(persona.getNombre());
        System.out.println(persona.getFecha());
    }
}
