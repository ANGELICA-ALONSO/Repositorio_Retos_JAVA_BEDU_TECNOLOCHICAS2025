public class Main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de Imagine Dragons", 1300.00);
        Entrada entrada2 = new Entrada("Show Infantil", 950.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_Record entrada3 = new Entrada_Record("Seminario de Java", 1500.50);
        entrada3.mostrarInformacion();
    }
}