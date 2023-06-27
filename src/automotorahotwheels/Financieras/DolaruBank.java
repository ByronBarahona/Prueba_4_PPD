/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Financieras;

/**
 *
 * @author barah
 */
public abstract class DolaruBank implements Financiera {
    @Override
    public String getNombre() {
        return "DolaruBank";
    }

    @Override
    public String getSegmentoVehiculo() {
        return "Segmento B";
    }

    @Override
    public double getDescuento() {
        return 0.20;
    }
}
