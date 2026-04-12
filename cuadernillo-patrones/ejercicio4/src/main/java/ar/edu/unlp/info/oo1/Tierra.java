package ar.edu.unlp.info.oo1;

public class Tierra implements Tipo {
    
    public double getProporcionAgua() { return 0; }
    public double getProporcionTierra() { return 1; }
    public double getProporcionPantano() { return 0; }

    @Override
    public boolean equals(Object o) {
        return o instanceof Tierra;
    }

}
