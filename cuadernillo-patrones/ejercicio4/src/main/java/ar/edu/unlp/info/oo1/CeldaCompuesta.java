package ar.edu.unlp.info.oo1;

import java.util.Arrays;

public class CeldaCompuesta implements Celda {
    //private Celda noroeste;
    //private Celda noreste;
    //private Celda suroeste;
    //private Celda sureste;

    private Celda[] celditas = new Celda[4];

    public CeldaCompuesta(Celda noroeste, Celda noreste, Celda sureste, Celda suroeste) {
        this.celditas[0] = noroeste;
        this.celditas[1] = noreste;
        this.celditas[2] = sureste;
        this.celditas[3] = suroeste;
    }

    public double calcularProporcionAgua() {
        return (Arrays.stream(celditas).mapToDouble(c -> c.calcularProporcionAgua()).sum())/4;
    }

    public double calcularProporcionTierra() {
        return (Arrays.stream(celditas).mapToDouble(c -> c.calcularProporcionTierra()).sum())/4;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CeldaCompuesta)) return false;

        CeldaCompuesta otra = (CeldaCompuesta) o;

        for (int i = 0; i < 4; i++) {
            if (!this.celditas[i].equals(otra.celditas[i])) {
                return false;
            }
        }
        return true;
    }
}
