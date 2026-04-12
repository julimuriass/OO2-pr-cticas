package ar.edu.unlp.info.oo1;

public class Pantano implements Tipo {

    public double getProporcionAgua() { return 0; }
    public double getProporcionTierra() { return 0; }
    public double getProporcionPantano() { return 1; }
    

    @Override
    public boolean equals(Object o) {
        return o instanceof Pantano;
    }
    
}
