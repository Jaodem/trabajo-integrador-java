package ar.com.codoacodo.dao.impl;

import java.util.ArrayList;

import ar.com.codoacodo.oop.Articulo;


// El contrato es DAO
public interface DAO {
    
    // El que debe hacer el que quiera usar el contrato DAO
    public Articulo getById(Long id); // La PK de la tabla
    public void delete(Long id); // La PK de la tabla
    public ArrayList<Articulo> findAll(); 
    public void update(Articulo articulo); // Tiene id
    public void create(Articulo articulo); // No tiene id
}
