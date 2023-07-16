package ar.com.codoacodo.oop;

import java.time.LocalDateTime;

// Libro es hijo (extends) de Articulo
public class Libro extends Articulo {
    // Atributo
    private String isbn;

    // Constructor/es
    public Libro(
        String titulo,
        double precio,
        String imagen,
        String autor,
        boolean novedad,
        String codigo,
        LocalDateTime fechaCreacion,
        String isbn
    ) {
        // 1 - Nace el padre
        super(titulo, precio, imagen, autor, novedad, codigo, fechaCreacion);

        // 2 - Nace el hijo
        this.isbn = isbn;
    }

    // Métodos
    public String obtenerIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return super.toString() + ", Libro [isbn=" + isbn + "]";
    }

    
}
