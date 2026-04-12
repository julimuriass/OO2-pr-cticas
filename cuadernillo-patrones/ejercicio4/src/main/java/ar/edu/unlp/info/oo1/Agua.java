package ar.edu.unlp.info.oo1;

public class Agua implements Tipo {

    public double getProporcionAgua() { return 1; }
    public double getProporcionTierra() { return 0; }
    

    @Override
    public boolean equals(Object o) {
        return o instanceof Agua;
    }
}
