public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(180.5),
                new PagoTarjeta(400.0, 650),
                new PagoTransferencia(250,false) //aqui fallará en la autenticación
        };

        for (MetodoPago pago : pagos){
            if (pago.autenticar()){
                System.out.println("¡Autenticación exitosa!");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}