package automotorahotwheels.Ventas;

import automotorahotwheels.*;
import automotorahotwheels.Financiamientos.Financiamiento;

public class VentaFacade {

    private VentaObserver observer;

    public VentaFacade(VentaObserver observer) {
        this.observer = observer;
    }

    public void crearVenta(Cliente cliente, Vehiculo vehiculo, Financiamiento financiera) {
        Venta venta = new Venta(cliente, vehiculo, financiera);
        venta.setDescuento(financiera.getPorcentaje_Descuento());

        if (cliente.getPuedeOptarCredito()) {
            if (cliente.tieneCreditoDisponible(vehiculo)) {
                cliente.actualizarCreditoDisponible(vehiculo);
                vehiculo.setVendido(true);

                observer.ventaRealizada(venta);
            } else {
                System.out.println("El cliente no tiene crédito disponible para comprar este vehículo.");
            }
        } else {
            vehiculo.setVendido(true);

            observer.ventaRealizada(venta);
        }

    }
}
