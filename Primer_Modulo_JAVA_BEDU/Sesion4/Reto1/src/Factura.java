import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

//    Constructor


    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

//    Método toString() que representa la visualización del objeto


    @Override
    public String toString() {
        return "Factura{" +
                "folio='" + folio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", total=" + total +
                '}';
    }

//    Método equals() nos permite comparar si dos facturas tienen el mismo folio, referente a su contenido y no su espacio en memoria

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //mismo objeto en memoria
        if (o == null || getClass() != o.getClass())  return false;

        Factura otra = (Factura) o;
        return this.folio.equals(otra.folio); //se compara solo el folio

    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
