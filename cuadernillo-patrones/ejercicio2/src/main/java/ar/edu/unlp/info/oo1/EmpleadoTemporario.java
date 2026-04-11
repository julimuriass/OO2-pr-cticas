package ar.edu.unlp.info.oo1;

public class EmpleadoTemporario extends EmpleadoFamilia {
    private int cantidadHoras;
    
    public EmpleadoTemporario(String nombreCompleto, int cantHijos, boolean casado, int cantHoras) {
        super(nombreCompleto, cantHijos, casado);
        this.cantidadHoras = cantHoras;
    }

    protected double calcularBasico() {
        return 20000 + (this.cantidadHoras * 300);
    }
}
