/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author Ignacio González
 */
public class POOEJ7 {

    /**
     * 
     * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
        ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
        atributo, puede hacerlo. Los métodos que se implementarán son:
        • Un constructor por defecto.
        • Un constructor con todos los atributos como parámetro.
        • Métodos getters y setters de cada atributo.
        • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
        Si no es correcto se deberá mostrar un mensaje
        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
        que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
        fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
        está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
        fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
        un booleano.
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
        sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
        mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double edad1= 0,edad2=0,ideal=0,nideal=0,sobre = 0 ;
        PersonaService Ps = new PersonaService(); 
        Persona persona1 = new Persona();
        persona1 = Ps.crearPersona(persona1);
        Persona persona2 = new Persona("Laura",30, "F",45.00,1.73);
        Persona persona3 = new Persona("Martin",14, "M",40.00,1.90);
        Persona persona4 = new Persona("Leo",34, "O",280.00,1.80);
        PersonaService ps =  new PersonaService();
        Persona persona5 = null;
        Persona array[] = {persona1 ,persona2 ,persona3,persona4} ;  
        
        for (Persona persona : array) {
           System.out.println("////////");
            if (Ps.calcularIMC(persona) == -1) {
                ideal++;
                System.out.println("Esta persona no esta en su peso ideal ");
            } else if (Ps.calcularIMC(persona) == 0) {
                nideal++;
                System.out.println("Esta perosna esta en su peso ideal");
            } else if (Ps.calcularIMC(persona)== 1){
                sobre++;
                System.out.println("Esta perosna tiene sobrepeso ");
            }
             try {
                 if (Ps.mayordeEdad(persona)==true) {
                 System.out.println("Mayor de edad ");
                 edad1++;
                }else{
                     edad2++;
                     System.out.println("Menor de edad");
                 }
             }catch(Exception e){
                  System.out.println(e.getMessage());
             } 
        }
        try {
            ps.mayordeEdad(persona5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("////////");
   
         System.out.println((ideal/4)*100 + "%  estan es su peso ideal");
         System.out.println((nideal/4)*100+ "%  no estan es su peso ideal");
         System.out.println((sobre/4)*100 + "%  tienen sobre peso");
         System.out.println((edad1/4)*100 + "%  son mayores de edad");
         System.out.println((edad2/4)*100 + "%  son menores de edad");
    }
    
}
