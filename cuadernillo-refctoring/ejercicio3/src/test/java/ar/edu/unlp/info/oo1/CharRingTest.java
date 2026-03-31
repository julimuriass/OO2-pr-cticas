package ar.edu.unlp.info.oo1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharRingTest {
	CharRing cRing;
	
	@BeforeEach
	void setUp() {
		cRing = new CharRing("Hola");
	}
	
    @Test
    public void testNext() {
        assertEquals(cRing.next(), 'H');
    }
}
