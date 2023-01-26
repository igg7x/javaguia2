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
public class Libros {

    
    public Libros() {
    }
    
    int ISBN , paginas  ;
    String Titulo , Autor ; 
    public Libros(int ISBN, int paginas, String Titulo, String Autor) {
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public int getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void imprimir(){
        System.out.println("El autor es  : "+getAutor()+"El Titulo es  : "+getTitulo()+"El ISBN es  : "+getISBN()+"El numero de paginas  es  : "+getPaginas());
    }
}

