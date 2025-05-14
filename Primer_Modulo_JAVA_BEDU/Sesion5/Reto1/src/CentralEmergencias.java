public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Oscar");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBombero bombero = new UnidadBombero("UnidadBomberos", "Arturo");

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bombero.iniciarOperacion();
    }
}