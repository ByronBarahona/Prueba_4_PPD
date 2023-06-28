/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Financiamientos;

/**
 *
 * @author barah
 */
public abstract class BreakBank implements Financiamiento {

    public BreakBank() {
    }
    @Override
    public String getNombre() {
        return "BreakBank";
    }

    @Override
    public String getSegmentoVehiculo() {
        return "Segmento C";
    }

    public double getDescuento() {
        return 0.05;
    }
}