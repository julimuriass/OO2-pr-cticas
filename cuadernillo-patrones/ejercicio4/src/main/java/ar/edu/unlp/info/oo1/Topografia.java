package ar.edu.unlp.info.oo1;

public class Topografia {
    private Celda imagen;

    public Topografia(Celda imagen) {
        this.imagen = imagen;
    }

    public double calcularProporcionAgua() {
        return imagen.calcularProporcionAgua();
    }

    public double calcularProporcionTierra() {
        return imagen.calcularProporcionTierra();
    }

    public boolean compararIgualdad(Topografia topografia) {
        return this.imagen.equals(topografia.imagen);
    }
    
}
