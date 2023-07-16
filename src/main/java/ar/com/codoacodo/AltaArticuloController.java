// Paquete: ar/com/codo
package ar.com.codoacodo;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// App.java = Clase java
public class AltaArticuloController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Create Controller

        // Se tendría que tener los parámetros del front (<form>)
        String titulo = "titulo";
        double precio = 1200;
        String autor = "autor";
        String codigo = "321";
        String isbn = "654";
        LocalDateTime fechaCreacion = LocalDateTime.now();

        Articulo nuevo = new Libro(titulo, precio, titulo, autor, false, codigo, fechaCreacion, isbn);

        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        // Se puede usar métodos que tiene DAO, sin saber quien cumple el contrato
        try {
            dao.create(nuevo); // try | catch | finally
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
