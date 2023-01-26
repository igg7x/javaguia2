/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ignacio González
 */
public class Persona {

    
    public String nombre ; 
    public int edad;
    public int Dni ;
    public Persona() {}

    public Persona(String nombre, int edad, int Dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return Dni;
    }

   
    
    public void Mostrar(Persona persona){
        System.out.println(getNombre());
        System.out.println(getEdad());
        System.out.println(getDni());
    }
}
