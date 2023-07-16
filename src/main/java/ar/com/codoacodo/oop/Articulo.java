package ar.com.codoacodo.oop;

import java.time.LocalDateTime;

// Todas las clases son hijas de Object
// Nombre
public abstract class Articulo {
    // Atributos: convertir a protected
    protected String titulo;
    protected Double precio;
    protected String imagen;
    protected String autor;
    protected boolean novedad;
    protected LocalDateTime fechaCreacion;

    // Constructor|es
    // Si no se escribe el constructor , JVM da uno por defecto
    public Articulo(
        String titulo,
        double precio,
        String imagen,
        String autor,
        boolean novedad
    ) {
        this.titulo = titulo;
        this.precio = precio;
        this.imagen = imagen;
        this.autor = autor;
        this.novedad = false;
        this.fechaCreacion = LocalDateTime.now();
    }

    // Métodos: va entre llaves
    public String mostrarImagen() {
        return this.imagen;
    }

    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", precio=" + precio + ", imagen=" + imagen + ", autor=" + autor
                + ", novedad=" + novedad + ", fechaCreacion=" + fechaCreacion + "]";
    }

    

}
