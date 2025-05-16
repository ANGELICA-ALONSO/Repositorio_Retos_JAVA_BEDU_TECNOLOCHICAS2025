import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {

        Path ruta = Paths.get("src/errores.log");
        Path rutaError = Paths.get("src/registro_error.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;


        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            String linea;

            while ((linea = lector.readLine()) != null)
                totalLineas++;
            if (linea.contains("ERROR")) {
                conteoErrores++;
            }
            if (linea.contains("WARNING")) {
                conteoWarnings++;

        }

        // mostrar el resumen de los conteos
        System.out.println("Analisis completado:");
        System.out.println("Total de lineas leídas: " + totalLineas);
        System.out.println("Total de ERRORES: " + conteoErrores);
        System.out.println("Total de advertencias WARNING: " + conteoWarnings);



        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
// fallo en el archivo externo
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)){
                escritor.write("Se produjo un error al leer el archivo /errores.log: " + e.getMessage());
            } catch (IOException ex){
                System.out.println("Tampoco se pudo escribir en el archivo de registro de errores.");
            }
        }
    }
}