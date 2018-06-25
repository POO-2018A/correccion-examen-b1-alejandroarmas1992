/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcion;

/**
 *
 * @author ESFOT
 */
public class Autor {
    String nombre;
    String pais;
    Libro libros[];

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public Autor(String nombre, String pais, Libro[] libros) {
        this.nombre = nombre;
        this.pais = pais;
        this.libros = libros;
    }

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
    
}
