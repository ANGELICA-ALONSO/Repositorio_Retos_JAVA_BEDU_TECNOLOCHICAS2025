import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
//  Lista de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Orden natural: por tema (Comparable)
        Collections.sort(temas);
        System.out.println("Temas ordenada por titulo (orden natural:)");
        for (Tema t : temas){
            System.out.println(t);
        }
        // Orden personalizado: por prioridad (Comparator)
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\n Temas ordenados por prioridad (1=urgente, 2=importante, 3=opcional)");
        for (Tema t : temas){
            System.out.println(t);
        }

//    Mapa concurrente de recursos usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

//        Mostrar el repositorio de recursos por tema
        System.out.println("\n Repositorio de recursos por tema: ");
        for (String tema : recursos.keySet()){
            System.out.println(tema + " -> " + recursos.get(tema));
        }
    }

}