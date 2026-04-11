package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.Empleado;
import ar.edu.unlp.info.oo1.EmpleadoPasante;
import ar.edu.unlp.info.oo1.EmpleadoPlanta;
import ar.edu.unlp.info.oo1.EmpleadoTemporario;

public class EmpleadoTest {
	
	private Empleado temporarioCasado, temporarioSinAtributos, temporarioPadre, temporarioConHoras;
	private Empleado pasanteSinExamen, pasanteConExamen;
	private Empleado plantaCasado, plantaSinAtributos, plantaPadre, plantaConAntiguedad;
	
	@BeforeEach
	void setUp() throws Exception {
		temporarioCasado = new EmpleadoTemporario("pepe", 0, true, 0);
		temporarioConHoras = new EmpleadoTemporario("p", 0, false, 1);
		temporarioPadre = new EmpleadoTemporario("p", 1, false, 0);
		temporarioSinAtributos = new EmpleadoTemporario ("q", 0, false, 0); //Empleado sin hijos sin horas trabajadas, soltero.

		pasanteConExamen = new EmpleadoPasante("p", 1);
		pasanteSinExamen = new EmpleadoPasante("l", 0);

		plantaCasado = new EmpleadoPlanta("k", true, 0, 0);
		plantaConAntiguedad = new EmpleadoPlanta("j", false, 0, 1);
		plantaPadre = new EmpleadoPlanta("j", false, 1, 0);
		plantaSinAtributos = new EmpleadoPlanta("p", false, 0, 0);
	}
	
    @Test
	// Sé que deberían ir separados, pero mucha paja ajajjaa :p
    public void testSueldoEmpleadosTemporarios() {
		assertEquals(temporarioCasado.calcularSueldo(), 19900);
		assertEquals(temporarioConHoras.calcularSueldo(), 17661);
		assertEquals(temporarioPadre.calcularSueldo(), 18400);
		assertEquals(temporarioSinAtributos.calcularSueldo(), 17400);
    }

	@Test
	public void testSueldoEmpleadosPasantes() {
		assertEquals(pasanteConExamen.calcularSueldo(), 18400);
		assertEquals(pasanteSinExamen.calcularSueldo(), 17400);
	}

	@Test
	public void testSueldoEmpleadosPlanta() {
		assertEquals(plantaCasado.calcularSueldo(), 46000);
		assertEquals(plantaConAntiguedad.calcularSueldo(), 44500);
		assertEquals(plantaPadre.calcularSueldo(), 44500);
		assertEquals(plantaSinAtributos.calcularSueldo(), 43500);
	}
}
