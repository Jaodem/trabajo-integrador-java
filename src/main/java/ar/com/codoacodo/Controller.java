// Paquete: ar/com/codo
package ar.com.codoacodo;

import java.time.LocalDateTime;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;

// App.java = Clase java
public class Controller {
    public static void main( String[] args ) {
        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        // Se tendría que tener los parámetros del front (<form>)
        String titulo = "titulo del front";
        double precio = 1200;
        String autor = "autor";
        String codigo = "123";
        String isbn = "654";
        LocalDateTime ldt = LocalDateTime.now();

        // Se puede usar métodos que tiene DAO, sin saber quien cumple el contrato
        Articulo a = dao.getById(1l);

        System.out.println(a);
    }
}
