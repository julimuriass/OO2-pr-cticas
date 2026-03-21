package ar.edu.unlp.info.oo1;


public interface Jugada {

	public Jugada pelearContra(Jugada otro);

	public Jugada pelearContraTijera(Tijera tijera);
	public Jugada pelearContraPiedra(Piedra piedra);
	public Jugada pelearContraPapel(Papel papel);


}
