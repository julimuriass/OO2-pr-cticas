package ar.edu.unlp.info.oo1;

public class EmpleadoPasante extends Empleado {
    private int cantExamen;

    public EmpleadoPasante(String nombreCompleto, int cantExamen) {
        super(nombreCompleto);
        this.cantExamen = cantExamen;
    }

    protected double calcularBasico() { return 20000; }

    protected double calcularAdicional() { return 2000 * this.cantExamen; }
    
}
