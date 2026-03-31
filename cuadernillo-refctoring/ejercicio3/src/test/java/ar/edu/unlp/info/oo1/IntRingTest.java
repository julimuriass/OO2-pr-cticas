package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntRingTest {
    IntRing iRing;

    @BeforeEach
    void setUp() {
        int[] numeros = {10, 20, 30, 40, 50};
        iRing = new IntRing(numeros);
    }

    @Test
    public void nextTest() {
        assertEquals(iRing.next(), 10);
    }
}
