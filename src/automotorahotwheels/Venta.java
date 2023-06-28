package automotorahotwheels;

import automotorahotwheels.Financiamientos.Financiamiento;

public class Venta {
    Cliente cliente;
    private int id_Venta;
    private double valor_Bruto;
    private double valor_Neto;
    Financiera financiera;
    Vehiculo vehiculo;
    private double descuento;
    
    /*Mutadores*/

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public double getValor_Bruto() {
        return valor_Bruto;
    }

    public void setValor_Bruto(double valor_Bruto) {
        this.valor_Bruto = valor_Bruto;
    }

    public double getValor_Neto() {
        return valor_Neto;
    }

    public void setValor_Neto(double valor_Neto) {
        this.valor_Neto = valor_Neto;
    }

    public Financiera getFinanciera() {
        return financiera;
    }

    public void setFinanciera(Financiera financiera) {
        this.financiera = financiera;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    

    
    
    /*Constructores*/

    public Venta(Cliente cliente1, Vehiculo vehiculo1, Financiamiento financiera1) {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, Financiera financiera) {
        this.cliente = cliente;
        this.id_Venta = id_Venta;
        this.valor_Bruto = valor_Bruto;
        this.valor_Neto = valor_Neto;
        this.financiera = financiera;
        this.vehiculo = vehiculo;
        this.descuento = descuento;
    }
    
    
    
    
    
    
}
