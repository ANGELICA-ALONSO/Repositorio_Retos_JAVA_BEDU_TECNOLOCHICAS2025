import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion; //Crear variable para almacenar la opcion del menú.

//        El siguiente metodo repetirá el menú siempre y cuando la opción no sea salir (4).
        do {
//            Aquí se muestra el menú de opciones.
            System.out.println("\n Bienvenido al Cajero Automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero ");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt(); //aquí lee la opción elegida por el usuario
//            Con la estrucura de Switch se manejan las opciones del menú.
            switch (opcion) {
                case 1 -> {
                    System.out.println("Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("¡El monto debe ser mayor a 0!");
                        continue; //vuelve al menú sin modificar el saldo
                    }
                    saldo += deposito; //aumenta el saldo
                    System.out.println("Depósito relizado. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    System.out.println("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("¡El monto debe ser mayor a cero!");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro;
                        System.out.println("¡Retiro exitoso! Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
//                    Salir del programa
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta pronto!");
                }
                default -> {
//                    Opción no válida
                    System.out.println("Opción no Válida. Intenta nuevamente.");
                }
            }

        } while (opcion != 4);

        scanner.close();
    }
}