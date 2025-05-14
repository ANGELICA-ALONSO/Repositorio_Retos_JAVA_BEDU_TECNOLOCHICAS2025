public class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

// Orden natural: por titulo (alfabéticamente)
    @Override
    public int compareTo(Tema o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "| Prioridad: " + prioridad;
    }
}


