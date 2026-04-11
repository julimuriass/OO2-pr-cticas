package ar.edu.unlp.info.oo1;

public class EmpleadoPlanta extends EmpleadoFamilia {
    private int antiguedad;

    public EmpleadoPlanta (String nombreCompleto, boolean casado, int canrHijos, int antiguedad) {
        super(nombreCompleto, canrHijos, casado);
        this.antiguedad = antiguedad;
    }
    
    protected double calcularBasico() { return 50000; }

    @Override
    protected double calcularAdicional() {
        return super.calcularAdicional() + antiguedad*2000;
    }
}
