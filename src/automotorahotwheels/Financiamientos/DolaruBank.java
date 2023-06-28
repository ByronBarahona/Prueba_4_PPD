/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Financiamientos;

/**
 *
 * @author barah
 */
public abstract class DolaruBank implements Financiamiento {
    @Override
    public String getNombre() {
        return "DolaruBank";
    }

    @Override
    public String getSegmentoVehiculo() {
        return "Segmento B";
    }

    public double getDescuento() {
        return 0.20;
    }
}
