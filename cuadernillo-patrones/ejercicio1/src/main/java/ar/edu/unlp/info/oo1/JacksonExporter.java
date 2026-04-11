package ar.edu.unlp.info.oo1;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JacksonExporter implements Exporter{

    @Override
    public String exportar(List<Socio> socios) {
        // creo objeto {}
        ObjectMapper mapper = new ObjectMapper(); // El objeto ppal de Jackson. Es como el cerebro que convierte objetos Java -> JSON. Convierte JSON -> objetos Java.
        ArrayNode array = mapper.createArrayNode(); // createArrayNode() -> rep un array JSON (como []). Ejemplo: [{...},{...}].

        // agrego campos.
        for (Socio socio : socios) {
            ObjectNode obj = mapper.createObjectNode(); //createObjectNode() -> Representa un objeto JSON (como {}). Ejemplo: { "nombre": "Arya"}, eso es un ObjectNode.
            obj.put("nombre", socio.getNombre());// put() agrega un campo al objeto JSON.
            obj.put("email", socio.getEmail());
            obj.put("legajo", socio.getLegajo());

            //Lo meto en el array.
            array.add(obj); 
        }

        // Lo convierto a string JSON.
        return array.toString();
    }
    
}
