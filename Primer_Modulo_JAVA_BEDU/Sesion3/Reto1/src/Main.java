public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Angelica Alonso", "P12345");

        Vuelo vuelo = new Vuelo("VN123","España","13:40");

//        Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("¡Reserva relizada exitosamente!.\n");
        } else {
            System.out.println("No se pudo relizar la Reserva. Intente nuevamente.\n");
        }

//        Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

//        Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

//        Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

//        Nueva reservación
        vuelo.reservarAsiento("Adrian","P9876");
        System.out.println(vuelo.obtenerItinerario());

    }
}