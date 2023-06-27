/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels;

/**
 *
 * @author barah
 */
public class Financiera {
    private String nombre_Financieras;
    private double porcentaje_Descuento;
    
    /*Mutadores*/

    public String getNombre_Financieras() {
        return nombre_Financieras;
    }

    public void setNombre_Financieras(String nombre_Financieras) {
        this.nombre_Financieras = nombre_Financieras;
    }

    public double getPorcentaje_Descuento() {
        return porcentaje_Descuento;
    }

    public void setPorcentaje_Descuento(double porcentaje_Descuento) {
        this.porcentaje_Descuento = porcentaje_Descuento;
    }
    
    /*constructures*/

    public Financiera() {
    }

    public Financiera(String nombre_Financieras, double porcentaje_Descuento) {
        this.nombre_Financieras = nombre_Financieras;
        this.porcentaje_Descuento = porcentaje_Descuento;
    }
    
    
    
    
}
