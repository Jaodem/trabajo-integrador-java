// Paquete: ar/com/codo
package ar.com.codoacodo;

import java.time.LocalDateTime;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// App.java = Clase java
public class Controller {
    public static void main( String[] args ) {

        // Create Controller
        // Se tendría que tener los parámetros del front (<form>)
        String titulo = "titulo del front";
        double precio = 1200;
        String autor = "autor";
        String codigo = "123";
        String isbn = "654";
        LocalDateTime ldt = LocalDateTime.now();

        Articulo nuevo = new Libro(titulo, precio, codigo, autor, false, isbn);

        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        // Se puede usar métodos que tiene DAO, sin saber quien cumple el contrato
        dao.create(nuevo);

        System.out.println(nuevo);
    }
}
