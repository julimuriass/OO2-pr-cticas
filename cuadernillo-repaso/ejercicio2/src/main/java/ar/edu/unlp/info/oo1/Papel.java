package ar.edu.unlp.info.oo1;

public class Papel implements Jugada {

    public Jugada pelearContra(Jugada otra) {
        return otra.pelearContraPapel(this);
    }
    
    public Jugada pelearContraPapel(Papel papel) {
        return this;
    }

    public Jugada pelearContraTijera(Tijera tijera) {
        return tijera;
    }

    public Jugada pelearContraPiedra(Piedra piedra) {
        return this;
    }
}
