package ar.edu.unlp.info.oo1;

public abstract class Empleado {
    protected String nombreCompleto;

    public Empleado(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public double calcularSueldo() {
        return calcularBasico() + calcularAdicional() - calcularDescuento();
    }

    protected abstract double calcularAdicional();
    protected abstract double calcularBasico();

    protected double calcularDescuento() {
        return calcularBasico() * 0.13 + calcularAdicional() * 0.5;
    }
}
