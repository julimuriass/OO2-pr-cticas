package ar.edu.unlp.info.oo1;

public abstract class EmpleadoFamilia extends Empleado {
    protected int cantidadHijos;
    protected boolean casado;

    public EmpleadoFamilia(String nombreCompleto, int cantidadHijos, boolean casado) {
        super(nombreCompleto);
        this.cantidadHijos = cantidadHijos;
        this.casado = casado;
    }

    protected abstract double calcularBasico();

    protected double calcularAdicional() {
        double adicional = 0;

        if (this.casado) { adicional += 5000; }

        adicional += this.cantidadHijos * 2000;

        return adicional; 
    }
}
