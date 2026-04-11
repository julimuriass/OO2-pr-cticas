package ar.edu.unlp.info.oo1;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExporter implements Exporter {
    
    @Override
    public String exportar(List<Socio> socios) {
        JSONArray lista = new JSONArray();
        
        for (Socio socio : socios) {
            JSONObject obj = new JSONObject();
            obj.put("nombre", socio.getNombre());
            obj.put("email", socio.getEmail());
            obj.put("legajo", socio.getLegajo());

            lista.add(obj);
        }

        return lista.toJSONString();
    }
}

