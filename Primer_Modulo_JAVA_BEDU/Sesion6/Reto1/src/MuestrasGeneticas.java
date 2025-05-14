import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class MuestrasGeneticas {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden

        ArrayList<String> muestrasEspecies = new ArrayList<>();
        muestrasEspecies.add("Homo sapiens");
        muestrasEspecies.add("Mus musculus");
        muestrasEspecies.add("Arabidopsis thaliana");
        muestrasEspecies.add("Mus musculus");

        System.out.println("Orden de llegada de las especies: ");
        for (String especie : muestrasEspecies){
            System.out.println("- " + especie);
        }

// Paso 2: HashSet para filtrar especies únicas

        HashSet<String> especiesUnicas = new HashSet<>(muestrasEspecies);   //al agregar el Arraylista anterior como paramentro en el HashSet se eliminan los duplicados.

        System.out.println("\n Tipos únicos de especies encontrados:");
        for (String unicas : especiesUnicas) {
            System.out.println("- " + unicas);
        }

// Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> catalogoInvestigador = new HashMap<>();
        catalogoInvestigador.put("M-001", "Dra.López");
        catalogoInvestigador.put("M-002", "Dr. Hernández");
        catalogoInvestigador.put("M-003", "Dra. Carmona");

        System.out.println("\n Catalogo de investigadores (ID de muestra con investigador): ");
        for (Map.Entry<String, String> entrada : catalogoInvestigador.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

// Paso 4: Una búsqueda por ID de muestra ("M-002" por ejemplo).
        String idBuscar = "M-002";
        System.out.println("\n Investigar asociado para " + idBuscar + ": " + catalogoInvestigador.get(idBuscar));

    }
}