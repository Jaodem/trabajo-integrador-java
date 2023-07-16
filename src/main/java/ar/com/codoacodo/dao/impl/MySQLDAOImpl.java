package ar.com.codoacodo.dao.impl;

import java.util.ArrayList;

import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// Se cumple el contrato
public class MySQLDAOImpl implements DAO {

    // Atributos
    private String tableName;

    // Constructor
    public MySQLDAOImpl() {
        this.tableName = "articulos";
    }
    
    // Métodos

    // Se va a cumplir ese contrato entre DAO y esta clase
    public Articulo getById(Long id) { // 1
        return new Libro(null, 0, null, null, false, null);
    }


    @Override
    public void delete(Long id) {
        String sql = "delete from " + tableName + " where id = " + id;
        // Acá va la magia que falta
    }

    @Override
    public ArrayList<Articulo> findAll() {
        String sql = "select * from " + tableName + "";
        return null;
    }

    @Override
    public void update(Articulo articulo) {
        String sql = "update " + tableName + " set titulo= , precio= , autor= ";
    }

    @Override
    public void create(Articulo articulo) {
        String sql = "insert into " + tableName;
        sql += "(titulo, autor, precio, fecha, novedad) ";
        sql += "value (..., ..., ..., ..., ...) ";

        // Obtener la Connection

        // PreaparedStatement con mi sql

        // ResultSet
    }
}
