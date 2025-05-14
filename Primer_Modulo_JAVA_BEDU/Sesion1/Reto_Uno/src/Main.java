import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Paciente paciente1 = new Paciente();
        System.out.println("Ingrese el nombre del paciente: ");
        paciente1.nombre = datos.nextLine();
        System.out.println("Ingrese la edad del paciente: ");
        paciente1.edad = datos.nextInt();
        System.out.println("Ingrese el número de expediente del paciente: ");
        datos.nextLine();
        paciente1.numExp = datos.nextLine();

        paciente1.mostrarInformacion();

    }
}