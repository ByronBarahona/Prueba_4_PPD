package automotorahotwheels;

public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private boolean puedeOptarCredito;
    private double creditoDisponible;
    
    /*Mutadores*/

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getPuedeOptarCredito() {
        return puedeOptarCredito;
    }

    public void setPuedeOptarCredito(boolean puedeOptarCredito) {
        this.puedeOptarCredito = puedeOptarCredito;
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(double creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }
    
        /*Metodos*/
        public boolean tieneCreditoDisponible(Vehiculo vehiculo) {
        return creditoDisponible >= vehiculo.getValor();
    }

    // Método para actualizar el crédito disponible después de una compra
    public void actualizarCreditoDisponible(Vehiculo vehiculo) {
        creditoDisponible -= vehiculo.getValor();
    }

    
    
    /*Constructores*/

    public Cliente(String string, String john, String doe, boolean par) {
    }

    public Cliente(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puedeOptarCredito = puedeOptarCredito;
        this.creditoDisponible = creditoDisponible;
    }
    




    
    
    
}
