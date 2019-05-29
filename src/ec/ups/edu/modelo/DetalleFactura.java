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
public class DetalleFactura extends Stock {
  private int CodigoFD;
  private double precio;
  private double subTotal;
  private Producto producto;
  private int CantidadFD; 

    public DetalleFactura() {
    }

    public DetalleFactura(int CodigoFD, double precio, double subTotal, Producto producto, int CantidadFD, int codigo, String nombre, double costo, int cantidad, Date fechaExpedicion) {
        this.CodigoFD = CodigoFD;
        this.precio = precio;
        this.subTotal = subTotal;
        this.producto = producto;
        this.CantidadFD = CantidadFD;
    }

    public int getCodigoFD() {
        return CodigoFD;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    

    public int getCantidadFD() {
        return CantidadFD;
    }

    public void setCodigoFD(int CodigoFD) {
        this.CodigoFD = CodigoFD;
    }


    public void setCantidad(int CantidadFD) {
        this.CantidadFD = CantidadFD;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "CodigoFD=" + CodigoFD + ", precio=" + precio + ", subTotal=" + subTotal + ", producto=" + producto + ", CantidadFD=" + CantidadFD + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.CodigoFD;
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
        final DetalleFactura other = (DetalleFactura) obj;
        if (this.CodigoFD != other.CodigoFD) {
            return false;
        }
        return true;
    }
  
  
}
