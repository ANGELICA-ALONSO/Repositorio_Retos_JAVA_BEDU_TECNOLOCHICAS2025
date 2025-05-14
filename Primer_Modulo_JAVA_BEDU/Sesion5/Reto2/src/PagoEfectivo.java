public class PagoEfectivo extends MetodoPago {
    public PagoEfectivo(double monto){
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true;  //En este caso, no se requiere validación para efectivo
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}
