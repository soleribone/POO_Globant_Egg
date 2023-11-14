/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidades;

/**
 *
 * @author Soso
 */
public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;

    
    public int numeroDePaginas;

    public Libro() {
      
    }

    public Libro(String ISBN, String titulo, String autor,int numeroDePaginas ) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.autor=autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

   public void setAutor(String autor) {
        this.autor = autor;
    }
    
    

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    
    
     public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }

   
   


    
    

    
    
    
    
    
}
