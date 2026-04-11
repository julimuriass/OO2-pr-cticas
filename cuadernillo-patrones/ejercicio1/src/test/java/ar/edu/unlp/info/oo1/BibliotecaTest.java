package ar.edu.unlp.info.oo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class BibliotecaTest {
	private Biblioteca biblioteca;

	@BeforeEach
	void setup() {
		this.biblioteca = new Biblioteca();
		this.biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		this.biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}

	@Test
	public void exportarSocioTest() throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		String result = this.biblioteca.exportarSocios(); 
		JsonNode expectedJson = mapper.readTree(
			"[\n" +
			"  {\n" +
			"    \"nombre\": \"Arya Stark\",\n" +
			"    \"email\": \"needle@stark.com\",\n" +
			"    \"legajo\": \"5234-5\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"nombre\": \"Tyron Lannister\",\n" +
			"    \"email\": \"tyron@thelannisters.com\",\n" +
			"    \"legajo\": \"2345-2\"\n" +
			"  }\n" +
			"]"
		);

		JsonNode resultJson = mapper.readTree(result);
		
		assertEquals(expectedJson, resultJson);
	}

	
}
