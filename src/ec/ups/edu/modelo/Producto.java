/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.Date;

/**
 *
 * @author USER
 */

public class Producto extends Stock{

private String path;
  private String tipo;
    private String descripcion;
    public Producto(int codigo, String nombre, double costo, int cantidad, Date fechaExpedicion) {
        super(codigo, nombre, costo, cantidad, fechaExpedicion);
    }

    public Producto() {
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

   

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
}
