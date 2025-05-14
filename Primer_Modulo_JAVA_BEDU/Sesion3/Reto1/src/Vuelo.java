public class Vuelo {
    final String codigoVuelo;   //final se refiere a que es una variable constante que no cambiará una vez asignada.
    String destino;
    String horaSalida;
    Pasajero asientoReservado;   //se asiganra una instacia de la clase pasajero.

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

//    Este es un método con parámetro y valor de retorno.
    public boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else  {
            return false;
        }
    }

//    Método con sobrecarga: permite resrvar con una cadena simples.
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }
//    Método sin retorno
    public void cancelarReserva(){
        asientoReservado = null;
    }

    //Método que retorna un String
    public String obtenerItinerario(){
        String informacion = "Itinerario del vuelo:\n";
        informacion += "Código: " + codigoVuelo +"\n";
        informacion += "Destino: " + destino + "\n";
        informacion += "Salida: "+ horaSalida + "\n";
        if (asientoReservado != null){
            informacion += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            informacion += "Pasajero: [Sin reserva]\n";
        }

        return informacion;
    }

}
