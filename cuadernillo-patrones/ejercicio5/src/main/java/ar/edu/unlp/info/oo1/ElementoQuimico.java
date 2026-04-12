package ar.edu.unlp.info.oo1;

public interface ElementoQuimico {
    
    public double pesoMolecular();
    public String formula();
    public int carga();
    public boolean esValido();    


    boolean tieneMetal();
    boolean tieneNoMetal();
    
} 
