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
public class Libro {
    String titulo;
    int anio;
    boolean favorito;
    private final Autor autor;

    public Libro(String titulo, int anio, boolean favorito, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
        this.autor = autor;
    }

    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public Autor getAutor() {
        return autor;
    }
}
