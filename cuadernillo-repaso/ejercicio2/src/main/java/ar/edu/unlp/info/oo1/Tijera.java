package ar.edu.unlp.info.oo1;

public class Tijera implements Jugada {

    public Jugada pelearContra(Jugada otro) {
        return otro.pelearContraTijera(this);
    }

    public Jugada pelearContraTijera(Tijera tijera) {
        return this;
    }

    public Jugada pelearContraPiedra(Piedra piedra) {
        return piedra;
    }

    public Jugada pelearContraPapel(Papel papel) {
        return this;
    }
    
}
