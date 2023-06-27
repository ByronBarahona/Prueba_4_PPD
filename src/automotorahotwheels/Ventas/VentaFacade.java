/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotorahotwheels.Ventas;

import automotorahotwheels.Financiera;
import automotorahotwheels.*;

/**
 *
 * @author barah
 */
public class VentaFacade {

    private VentaObserver observer;

    public VentaFacade(VentaObserver observer) {
        this.observer = observer;
    }

    public void crearVenta(Cliente cliente, Vehiculo vehiculo, Financiera financiera) {
        Venta venta = new Venta(cliente, vehiculo, financiera);
        venta.setDescuento(financiera.getDescuento());

        // Lógica adicional de la venta
        if (cliente.getPuedeOptarCredito() && vehiculo.getPrecio() > financiera.getPrecioMinimoCredito()) {
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

