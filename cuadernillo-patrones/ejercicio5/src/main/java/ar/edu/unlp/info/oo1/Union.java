package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Union implements ElementoQuimico{
    private List<ElementoQuimico> elementos;

    public Union(ArrayList<ElementoQuimico> elementos) {
        this.elementos = elementos;
    }

    public double pesoMolecular() {
        return elementos.stream().mapToDouble(e -> e.pesoMolecular()).sum();
    }


    public String formula() {
        String resultado = elementos.stream()
                                    .map(e -> e.formula())
                                    //“Agrupame los elementos por su propio valor, guardalos en un mapa ordenado, y contá cuántos hay de cada uno.”
                                    .collect(Collectors.groupingBy(
                                        Function.identity(), // Significa: “usá el mismo elemento como clave”. "H" se agrupa bajo "H", "Na" bajo "Na". No transformás nada, solo agrupás por el mismo valor
                                        LinkedHashMap::new, // mantiene orden de aparición. Ejemplo: entrada ["Na", "H", "Na", "O"], con LinkedHashMap {Na=2, H=1, O=1} 
                                        Collectors.counting() // Contar cad grupo.
                                    ))
                                    .entrySet() //Convertís el Map en un stream de pares: (H,2), (O,1), (Na,3). Cada elemento ahora es un Map.Entry<String, Long>
                                    .stream()
                                    // Transformás cada par en un string: e.getKey() → el nombre ("H"), e.getValue() → la cantidad (2)
                                    .map(e -> e.getKey() + (e.getValue() > 1 ? e.getValue() : ""))
                                    .collect(Collectors.joining()); //Juntas todos los strings en uno solo.

        return resultado;
    }


    public int carga() {
        return elementos.stream().mapToInt(e -> e.carga()).sum();
    }

    public boolean tieneMetal() {
        return elementos.stream().anyMatch(e -> e.tieneMetal());
    }
    
    public boolean tieneNoMetal() {
        return elementos.stream().anyMatch(e -> e.tieneNoMetal());
    }


    public boolean esValido() {
        boolean hayMetal = this.tieneMetal();
        boolean hayNoMetal = this.tieneNoMetal();
    
        // Metal + Metal → inválido
        if (hayMetal && !hayNoMetal) {
            return false;
        }
    
        return true;
    }
    
      public boolean esMolecula() {
        if (carga() == 0) return true;
        return false;
      }

    
}
