public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("FAC001","Diego Martínez",1380.70);
        Factura f2 = new Factura("FAC001","Carla Gómez", 1380.70);

//        Mostrar las facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

//        Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}