import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");
        var consola = new Scanner(System.in);

        final var PRECIO_DIARIO_NORMAL = 150.50;
        final var PRECIO_DIARIO_VISTA_MAR = 190.50;

        System.out.print("Nombre del Cliente: ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstancia = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false)? ");
        var tieneVistaMar = Boolean.parseBoolean(consola.nextLine());

        var precioTotal = (tieneVistaMar) ?
                diasEstancia*PRECIO_DIARIO_VISTA_MAR :
                diasEstancia*PRECIO_DIARIO_NORMAL;

        System.out.printf("""
                \n------- Detalles de la Reservación -------
                Cliente: %s
                Días de estadía: %d
                Costo total: %.2f€
                Habitación con vista al mar: %s
                """, nombreUsuario, diasEstancia, precioTotal,
                tieneVistaMar ? "Si :)": "No :(");

    }
}
