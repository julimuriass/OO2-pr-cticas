package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TopografiaTest {
	
	Topografia topografiaAgua0, topografiaTierra0, topografiaMixta0, topografiaAgua1, topografiaTierra1, topografiaMixta1;
	
	@BeforeEach
	void setUp() throws Exception {

		topografiaAgua0 = new Topografia(
			new CeldaSimple(new Agua())
		);
		
		topografiaTierra0 = new Topografia(
			new CeldaSimple(new Tierra())
		);

		topografiaAgua1 = new Topografia(
			new CeldaSimple(new Agua())
		);
		
		topografiaTierra1 = new Topografia(
			new CeldaSimple(new Tierra())
		);

		topografiaMixta0 = new Topografia(
			new CeldaCompuesta(
				new CeldaSimple(new Agua()),
				new CeldaSimple(new Tierra()),
				new CeldaSimple(new Tierra()),
				new CeldaSimple(new Agua())
			)
		);

		topografiaMixta1 = new Topografia(
			new CeldaCompuesta(
				new CeldaSimple(new Agua()),
				new CeldaSimple(new Agua()),
				new CeldaSimple(new Tierra()),
				new CeldaSimple(new Agua())
			)
		);
	}
	
    @Test
    public void testProporcionAguaTopografiasSimples() {
        assertEquals(topografiaAgua0.calcularProporcionAgua(), 1.0);
        assertEquals(topografiaTierra0.calcularProporcionAgua(), 0.0);
    }

	@Test
    public void testProporcionTierraTopografiasSimples() {
        assertEquals(topografiaAgua0.calcularProporcionTierra(), 0.0);
        assertEquals(topografiaTierra0.calcularProporcionTierra(), 1.0);
    }

	@Test 
	public void testIgualdadTopografiasSimples() {
		assertEquals(topografiaAgua1.compararIgualdad(topografiaAgua0), true);
		assertEquals(topografiaTierra1.compararIgualdad(topografiaTierra0), true);
	}

	@Test 
	public void testIgualdadFalsaTopografiasSimples() {
		assertEquals(topografiaAgua1.compararIgualdad(topografiaTierra0), false);
	}

	@Test
	public void testProporcionAguaTopografiasMixtas() {
		assertEquals(topografiaMixta0.calcularProporcionAgua(), 0.5);
		assertEquals(topografiaMixta1.calcularProporcionAgua(), 0.75);
	}

	@Test
	public void testProporcionTierraTopografiasMixtas() {
		assertEquals(topografiaMixta0.calcularProporcionTierra(), 0.5);
		assertEquals(topografiaMixta1.calcularProporcionTierra(), 0.25);
	}

	@Test 
	public void testIgualdadFalsaTopografiasMixtas() {
		assertEquals(topografiaMixta0.compararIgualdad(topografiaMixta1), false);
	}

	@Test 
	public void testIgualdadTopografiasMixtas() {
		assertEquals(topografiaMixta0.compararIgualdad(topografiaMixta0), true);
	}

}
