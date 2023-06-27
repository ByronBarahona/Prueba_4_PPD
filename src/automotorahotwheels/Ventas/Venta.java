/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Ventas;

import automotorahotwheels.*;

public class Venta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Financiera financiera;
    private double descuento;
    
    
    /*Constructor*/

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, Financiera financiera, double descuento) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.financiera = financiera;
        this.descuento = descuento;
    }
    
    

    /*Mutadores*/
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Financiera getFinanciera() {
        return financiera;
    }

    public void setFinanciera(Financiera financiera) {
        this.financiera = financiera;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    
}
