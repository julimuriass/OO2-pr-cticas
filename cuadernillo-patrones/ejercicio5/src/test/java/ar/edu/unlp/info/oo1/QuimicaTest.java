package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class QuimicaTest {
	private Atomo hidrogeno, oxigeno, sodio, cloro;
	private Union agua, sal, sodioSodio;

	@BeforeEach
	void setup() {
		hidrogeno = new Hidrogeno("Hidrogeno", "H", 1, 1, false);
        oxigeno = new Oxigeno("Oxigeno", "O", 16, -2, false);
        sodio = new Sodio("Sodio", "Na", 23, 1, true);
		cloro = new Cloro("Cloro", "Cl", 35, -1, false);

		agua = new Union(new ArrayList<>(List.of(
            hidrogeno, hidrogeno, oxigeno
        )));

		sal = new Union(new ArrayList<>(List.of(
            sodio, cloro
        )));

		 // Crear unión inválida: Na + Na
		 sodioSodio = new Union(new ArrayList<>(List.of(
            sodio, sodio
        )));

	}

	@Test
	public void testEsMolecula() {
		assertEquals(agua.esMolecula(), true);
	}

	@Test
	public void testNoEsMolecula() {
		assertEquals(sodioSodio.esMolecula(), false);
	}

	@Test
	public void testPesoAtomico() {
		assertEquals(cloro.pesoMolecular(), 35);
		assertEquals(agua.pesoMolecular(), 18);
	}

	@Test
	public void testEsValido() {
		assertEquals(agua.esValido(), true);
	}
	
	@Test
	public void testNoEsValido() {
		assertEquals(sodioSodio.esValido(), false);
	}

	@Test
	public void testFormula() {
		assertEquals(agua.formula(), "H2O");
	}

}
