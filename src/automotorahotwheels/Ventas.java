/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels;

/**
 *
 * @author barah
 */
public class Ventas {
    Cliente cliente;
    private int id_Venta;
    private double valor_Bruto;
    private double valor_Neto;
    private String Financiamiento;
    
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

    public String getFinanciamiento() {
        return Financiamiento;
    }

    public void setFinanciamiento(String Financiamiento) {
        this.Financiamiento = Financiamiento;
    }
    
    /*Constructores*/

    public Ventas() {
    }

    public Ventas(Cliente cliente, int id_Venta, double valor_Bruto, double valor_Neto, String Financiamiento) {
        this.cliente = cliente;
        this.id_Venta = id_Venta;
        this.valor_Bruto = valor_Bruto;
        this.valor_Neto = valor_Neto;
        this.Financiamiento = Financiamiento;
    }
    
    
}
