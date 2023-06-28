package automotorahotwheels.Ventas;

import automotorahotwheels.*;

public class Vendedor implements VentaObserver {
    
    @Override
    public void ventaRealizada(Venta Venta) {
        System.out.println("Venta realizada: Cliente " + Venta.getCliente().getNombre() +
                ", Vehículo " + Venta.getVehiculo().getModelo() + ", Financiera " +
                Venta.getFinanciera().getNombre_Financieras() + ", Descuento " + Venta.getFinanciera().getDescuento());
    }
}
