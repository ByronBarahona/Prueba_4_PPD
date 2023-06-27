package automotorahotwheels.Test;


import automotorahotwheels.*;
import automotorahotwheels.Financieras.*;
import automotorahotwheels.Ventas.*;
import java.lang.reflect.Field;

public class VentaTest {
    public static void main(String[] args) throws Exception {
        Venta venta = new Venta(new Cliente(), new Vehiculo(), new GambaBank() {});
        
        // Uso de Reflection para acceder y modificar atributos privados
        Field descuentoField = Venta.class.getDeclaredField("descuento");
        descuentoField.setAccessible(true);
        descuentoField.set(venta, 0.10);
        
        System.out.println("Nuevo descuento: " + venta.getDescuento());
    }
}
