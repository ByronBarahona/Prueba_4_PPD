package automotorahotwheels.Test;

import automotorahotwheels.Cliente;
import automotorahotwheels.Vehiculo;
import automotorahotwheels.Venta;
import automotorahotwheels.Financiamientos.*;
import java.util.Scanner;

public class VentaTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el RUT del cliente:");
            String rut = scanner.nextLine();
            
            System.out.println("Ingrese el nombre del cliente:");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese el apellido del cliente:");
            String apellido = scanner.nextLine();
            
            System.out.println("¿El cliente puede optar por un crédito? (true/false)");
            boolean puedeOptarCredito = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea
            
            System.out.println("Seleccione la financiera:");
            System.out.println("1. BreakBank");
            System.out.println("2. DolaruBank");
            System.out.println("3. GambaBank");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            Financiamiento financiera;
            
            switch (opcion) {
                case 1:
                    financiera = new BreakBank() {
                public double getPorcentaje_Descuento() {
                    return 0.05;
                }
            };
                    break;
                case 2:
                    financiera = new DolaruBank() {
                        public double getPorcentaje_Descuento() {
                            return 0.20;
                        }
                    };
                    break;
                case 3:
                    financiera = new GambaBank() {
                        public double getPorcentaje_Descuento() {
                            return 0.35;
                        }
                    };
                    break;
                default:
                    System.out.println("Opción inválida. Se utilizará Financiera 1 por defecto.");
                    financiera = new BreakBank() {
                        public double getPorcentaje_Descuento() {
                            return 0.15; // Coloca aquí el porcentaje de descuento correspondiente a BreakBank
                        }
                    };
                    break;
            }
            
            double descuento = financiera.getPorcentaje_Descuento();
            
            System.out.println("Ingrese la patente del vehículo:");
            String patente = scanner.nextLine();
            
            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.nextLine();
            
            System.out.println("Ingrese el valor del vehículo:");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            
            Cliente cliente = new Cliente(rut, nombre, apellido);
            cliente.setPuedeOptarCredito(puedeOptarCredito);
            
            Vehiculo vehiculo = new Vehiculo(patente, marca, valor);
            
            Venta venta = new Venta(cliente, vehiculo, financiera);
            venta.setValor_Bruto(valor);
            venta.setValor_Neto(valor - (valor * descuento));
            
            venta.setDescuento(descuento);
            
            System.out.println("Nuevo descuento: " + venta.getDescuento());
            System.out.println("Valor neto de la venta: " + venta.getValor_Neto());
        }
    }
}
