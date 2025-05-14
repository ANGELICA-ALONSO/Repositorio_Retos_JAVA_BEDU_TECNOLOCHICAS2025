public class Main {
    public static void main(String[] args) {
//        Crear una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 9600.0);

//        Crear una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000",9800.0);

//        Mostrar la información
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

//        Validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿El RFC es válido para esta cuenta?: " + rfcValido);
    }
}