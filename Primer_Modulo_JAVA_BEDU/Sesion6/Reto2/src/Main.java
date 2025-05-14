import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//  Lista de temas
        List<Tema> temas = new ArrayList<>();
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
    }
}