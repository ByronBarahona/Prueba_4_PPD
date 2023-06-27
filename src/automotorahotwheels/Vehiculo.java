/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels;

/**
 *
 * @author barah
 */
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private double valor;
    
    
    /*Mutadores*/

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    /*Cosntructures*/

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, double valor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }
    
    
    
}
