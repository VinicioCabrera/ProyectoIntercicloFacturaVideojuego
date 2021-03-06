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
public class Stock {
   private int codigo;
   private String nombre;
   private double costo;
   private int cantidad;
   private Date fechaExpedicion;

    public Stock() {
    }

    public Stock(int codigo, String nombre, double costo, int cantidad, Date fechaExpedicion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
        this.fechaExpedicion = fechaExpedicion;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Override
    public String toString() {
        return "Stock{" + "codigo=" + codigo + ", nombre=" + nombre + ", costo=" + costo + ", cantidad=" + cantidad + ", fechaExpedicion=" + fechaExpedicion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stock other = (Stock) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
   
   
   
}
