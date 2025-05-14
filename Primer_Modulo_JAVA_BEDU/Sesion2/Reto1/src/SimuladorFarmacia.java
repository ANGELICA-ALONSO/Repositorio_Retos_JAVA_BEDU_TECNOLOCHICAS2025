import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio Unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

//        Calcular el total
        double totalSinDescuento = precioUnitario * cantidad;

//        Evaluar si aplica descuento o no
        var aplicaDescuento = totalSinDescuento > 500; //var infiere que tipo de dato va a arrojar
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

//        Total
        double totalConDescuento = totalSinDescuento - descuento;

//        lo que se mostrará en pantalla será:
        System.out.println("\nResumen de compra: ");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: " + totalSinDescuento);
        System.out.println("Total con descuento: " + totalConDescuento);
        System.out.println("¡Gracias por su compra!");
    }
}