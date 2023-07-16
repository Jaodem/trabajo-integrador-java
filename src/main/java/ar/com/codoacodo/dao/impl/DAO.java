package ar.com.codoacodo.dao.impl;

import java.util.ArrayList;

import ar.com.codoacodo.oop.Articulo;


// El contrato es DAO
public interface DAO {
    
    // El que debe hacer el que quiera usar el contrato DAO
    public Articulo getById(Long id) throws Exception; // La PK de la tabla
    public void delete(Long id) throws Exception; // La PK de la tabla
    public ArrayList<Articulo> findAll() throws Exception;
    public void update(Articulo articulo) throws Exception; // Tiene id
    public void create(Articulo articulo) throws Exception; // No tiene id
}
