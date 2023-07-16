// Paquete: ar/com/codo
package ar.com.codoacodo;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// App.java = Clase java
@WebServlet("/ListadoArticuloController")
public class ListadoArticuloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        try {
            ArrayList<Articulo> listado = dao.findAll();

            //guardar los datos en el request, es un objeto creado por Tomcat
            req.setAttribute("listado", listado); //idem localStorage
        } catch (Exception e) {
            var listado = new ArrayList<>();
            req.setAttribute("listado", listado); //idem localStorage

            //error
            req.setAttribute("error", e.getMessage() );
        } //try/catch/finally

        //redirect
        getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
    }
}
