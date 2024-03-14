/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller5.demodocker;

/**
 *
 * @author yhonatan.gomez
 */
import static spark.Spark.*;

public class DemoDocker {

    public static void main(String... args) {
        port(getPort());
        staticFileLocation("/public");
        get("hello", (req, res) -> "Hello Docker!");

 get("/Seno", (req, res) -> {
    // Obtener el valor del ángulo del parámetro de consulta 'angle'
    double value1 = Double.parseDouble(req.queryParams("angle"));
    
    // Calcular el seno del ángulo
    double seno1 = Math.sin(value1);

    // Imprimir el ángulo y su seno en la consola del servidor
    System.out.println("Ángulo recibido: " + value1);
    System.out.println("Seno calculado: " + seno1);

    // Devolver el seno como respuesta
    return seno1;
});


        get("Coseno", (req, res) -> {
            double value = Double.parseDouble(req.queryParams("angle"));
            double Coseno = Math.cos(value);
            return "Coseno de " + value + " es " + Coseno;
        });

        get("Palindromo", (req, res) -> {
            String value = req.queryParams("PalindromoOK");
            String theOtherWay = new StringBuffer(value).reverse().toString();
            if (value.equals(theOtherWay)) {
                return value + " is a palindrome";
            }
            return value + " is not a palindrome";
        });

        get("Magnitud", (req, res) -> {
            double numa = Double.parseDouble(req.queryParams("a"));
            double numb = Double.parseDouble(req.queryParams("b"));
            double magnitud = Math.hypot(numa, numb);
            return magnitud;
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
