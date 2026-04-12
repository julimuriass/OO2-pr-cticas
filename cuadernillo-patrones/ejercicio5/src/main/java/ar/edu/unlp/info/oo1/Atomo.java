package ar.edu.unlp.info.oo1;

public abstract class Atomo implements ElementoQuimico{
    private String nombre, simbolo;
    private int pesoAtomico, carga;
    private boolean esMetal;

    public Atomo(String nombre, String simbolo, int pesoAtomico, int carga, boolean esMetal) {
        this.carga = carga;
        this.esMetal = esMetal;
        this.nombre = nombre;
        this.pesoAtomico = pesoAtomico;
        this.simbolo = simbolo;
    }

    public double pesoMolecular() { return pesoAtomico; }

    public int carga() { return carga; }

    public boolean esValido() { return true; }

    public String formula() { return simbolo; }

    public boolean tieneMetal() {
        return esMetal;
    }
    
    public boolean tieneNoMetal() {
        return !esMetal;
    }

}
