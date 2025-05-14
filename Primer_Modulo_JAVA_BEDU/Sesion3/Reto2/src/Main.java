public class Main {
    public static void main(String[] args) {
//        Factura con RFC
        Factura facturaConRFC = new Factura(3900.80,"Servicio de consultoria", "ABCD010101XYZ");

//        Factura SIN RFC (null)
        Factura facturaSinRFC = new Factura(1200.50, "Reparación de equipo de cómputo", null);

//        Se imprimen los dos casos sobre la factura.
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}