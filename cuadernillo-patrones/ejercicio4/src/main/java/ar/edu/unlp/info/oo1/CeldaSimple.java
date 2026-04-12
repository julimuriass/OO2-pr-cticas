package ar.edu.unlp.info.oo1;

public class CeldaSimple implements Celda {
    private Tipo tipo;
    
    public CeldaSimple(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularProporcionAgua() {
        return tipo.getProporcionAgua();
    }

    @Override
    public double calcularProporcionTierra() {
        return tipo.getProporcionTierra();
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si es el mismo objeto, literalmente es lo mismo.
        if (!(o instanceof CeldaSimple)) return false; 

        CeldaSimple otra = (CeldaSimple) o;
        return this.tipo.equals(otra.tipo);
    }
}
