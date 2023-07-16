package ar.com.codoacodo.oop;

public class Musica extends Articulo {
    private String sello;

    public Musica(String titulo, double precio, String imagen, String autor, boolean novedad, String sello) {
        super(titulo, precio, imagen, autor, novedad);
        this.sello = sello;
    }

    // Polimorfismo
    public String toString() {
        return super.toString() + ", Musica [sello=" + sello + "]";
    }

    // setter | getter
    public String getSello() {
        return sello;
    }
    /*
    public void setSello(String sello) {
        this.sello = sello;
    }
    */
    
}
