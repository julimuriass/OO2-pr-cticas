package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


 public class JugadaTest {
	
	Jugada piedra1, piedra2, papel1, papel2, tijera1, tijera2;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra1 = new Piedra();
		tijera1 = new Tijera();
		papel1 = new Papel();

		piedra2 = new Piedra();
		papel2 = new Papel();
		tijera2 = new Papel();
	}
	
    @Test
    public void testPiedraVsPiedra() {
		Jugada resultado;
		resultado = piedra1.pelearContra(piedra2);
		assertTrue(resultado instanceof Piedra);
    }

	@Test 
	public void testPiedraVsTijera() {
		Jugada resultado;
		resultado = piedra1.pelearContra(tijera1);
		assertTrue(resultado instanceof Piedra);
	}

	@Test void testPiedraVsPapel() {
		Jugada resultado;
		resultado = piedra1.pelearContra(papel1);
		assertTrue(resultado instanceof Papel);
	}

	@Test void testTijeraVsTijera() {
		Jugada resultado;
		resultado = tijera1.pelearContra(tijera2);
		assertTrue(resultado instanceof Tijera);
	}

	@Test void testTijeraVsPapel() {
		Jugada resultado;
		resultado = tijera1.pelearContra(papel1);
		assertTrue(resultado instanceof Tijera);
	}

	@Test void testTijeraVsPiedra() {
		Jugada resultado;
		resultado = tijera1.pelearContra(piedra1);
		assertTrue(resultado instanceof Piedra);
	}

	@Test void testPapelVsPapel() {
		Jugada resultado;
		resultado = papel1.pelearContra(papel2);
		assertTrue(resultado instanceof Papel);
	}

	@Test void testPapelVsTijeral() {
		Jugada resultado;
		resultado = papel1.pelearContra(tijera1);
		assertTrue(resultado instanceof Tijera);
	}

	@Test void testPapelVsPiedra() {
		Jugada resultado;
		resultado = papel1.pelearContra(papel2);
		assertTrue(resultado instanceof Papel);
	}

}
