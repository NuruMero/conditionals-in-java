import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        System.out.println("*** Estación del año ***");
        var consola = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        var numMes = Integer.parseInt(consola.nextLine());
        var estacion = "";

        switch (numMes) {
            case 12,1,2 -> estacion = "Invierno";
            case 3,4,5 -> estacion = "Primavera";
            case 6,7,8 -> estacion = "Verano";
            case 9,10,11 -> estacion = "Otoño";
            default -> estacion = "Estacion desconocida";
        }

        /*
        if (numMes == 12 || numMes == 1 || numMes == 2) {
            estacion = "Invierno";
        } else if (numMes >= 3 && numMes <= 5) {
            estacion = "Primavera";
        } else if (numMes >= 6 && numMes <= 8) {
            estacion = "Verano";
        } else if (numMes >= 9 && numMes <= 11) {
            estacion = "Otoño";
        } else {
            estacion = "Estación desconocida";
        }
         */

        System.out.println("La estación es: " +estacion);

    }
}
