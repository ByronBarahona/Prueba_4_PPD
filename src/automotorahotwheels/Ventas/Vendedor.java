package automotorahotwheels.Ventas;

public class Vendedor implements VentaObserver {
    
    @Override
    public void ventaRealizada(Venta venta) {
        System.out.println("Venta realizada: Cliente " + venta.getCliente().getNombre() +
                ", Vehículo " + venta.getVehiculo().getModelo() + ", Financiera " +
                venta.getFinanciera().getNombre() + ", Descuento " + venta.getDescuento());
    }
}
