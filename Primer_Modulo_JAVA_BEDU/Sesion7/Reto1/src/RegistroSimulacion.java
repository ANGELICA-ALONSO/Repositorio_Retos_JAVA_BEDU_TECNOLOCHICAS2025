import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {

        // 1. Crear un objeto Path que apunte a un archivo parametros.txt en la carpeta config
        Path rutaCarpeta = Paths.get("src/reto1/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        // 2. Contenido a escribir en el archivo
        String contenido = "Tiempo de ciclo: 55.8 segundos\n" +
                "Velocidad de línea: 1.2 m/s\n" +
                "Número de estaciones: 8\n";
        try {
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Se creó la carpeta /config/");
            }
            // Escribir el contenido en el archivo
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("Se ha escrito correctamente el contenido en el archivo");

            // validar si se ha creado el archivo
            if (Files.exists(rutaArchivo)) {
                System.out.println("Se ha creado exitosamente el archivo en : " + rutaArchivo.toAbsolutePath());

                //lectura del contenido
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo: ");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no se ha creado");
            }
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }
    }
}