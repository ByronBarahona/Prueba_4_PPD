package automotorahotwheels;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private double valor;
    private boolean vendido;
    
    
    /*Mutadores*/

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    
    /*Cosntructures*/

    public Vehiculo() {
    }

 

    public Vehiculo(String patente, String marca, double valor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.vendido = vendido;
    }
    


    
    
    
}
