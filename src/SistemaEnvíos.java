import java.util.Scanner;

public class SistemaEnvíos {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        // Definimos las tarifas de envío por kg
        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        // Solicitamos los valores de destino y peso
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Indique el peso en kg del paquete: ");
        var peso = Double.parseDouble(consola.nextLine());

        Double coste = switch (destino) {
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("No se ha ingresado el destino correctamente.");
                yield null;
            }
        };

        if (coste != null) {
            System.out.println("El costo de envío del paquete es: " +coste +"€");
        }
    }
}
