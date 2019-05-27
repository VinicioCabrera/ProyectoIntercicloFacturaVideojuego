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
public class Factura {
 private Cliente cliente;
 private Empleado empleado;
 private Date fecha;
 private double subtotal;
 private double total;
 private double iva;

    public Factura() {
        
    }

    public Factura(Cliente cliente, Empleado empleado, Date fecha, double subtotal, double total, double iva) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public double getIva() {
        return iva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", empleado=" + empleado + ", fecha=" + fecha + ", subtotal=" + subtotal + ", total=" + total + ", iva=" + iva + '}';
    }
 
}
