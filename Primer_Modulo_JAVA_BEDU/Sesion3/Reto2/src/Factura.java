import java.util.Optional;
import java.util.SplittableRandom;

public class Factura {
//    se utiliza el modificador de acceso "private" para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;    //manejo seguro del valor null

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //   Método con modificador de acceso "publico" para devuelver el resumen de la factura
    public String getResumen(){
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $ " + monto + "\n";

        //En dado caso que si se presente el RFC, se imprime. Si no, se muestra el mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }


}
