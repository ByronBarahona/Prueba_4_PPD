package automotorahotwheels;

public class Financiera {
    private String nombre_Financieras;
    private double descuento;
    
    /*Mutadores*/

    public String getNombre_Financieras() {
        return nombre_Financieras;
    }

    public void setNombre_Financieras(String nombre_Financieras) {
        this.nombre_Financieras = nombre_Financieras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double Descuento) {
        this.descuento = Descuento;
    }
    
    
    /*constructures*/

    public Financiera() {
    }

    public Financiera(String nombre_Financieras, double descuento) {
        this.nombre_Financieras = nombre_Financieras;
        this.descuento = descuento;
    }
 
    
}
