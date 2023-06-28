/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Financiamientos;

/**
 *
 * @author barah
 */
public abstract class GambaBank implements Financiamiento {
    @Override
    public String getNombre() {
        return "GambaBank";
    }

    @Override
    public String getSegmentoVehiculo() {
        return "Segmento A";
    }

    public double getDescuento() {

        return 0.35;
    }
    
    
}
