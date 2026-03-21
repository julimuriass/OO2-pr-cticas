package ar.edu.unlp.info.oo1;

public class Piedra implements Jugada{
    
    public Jugada pelearContra(Jugada otro) {
        return otro.pelearContraPiedra(this);
    }

    public Jugada pelearContraPiedra(Piedra piedra) {
        return this;
    }

    public Jugada pelearContraPapel(Papel papel) {
        return papel;
    }

    public Jugada pelearContraTijera(Tijera tijera) {
        return this;
    }
}
