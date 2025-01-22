import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticación ***");
        var consola = new Scanner(System.in);

        final var NOMBRE_ADMIN = "admin";
        final var PASSWD_ADMIN = "123";

        System.out.print("Ingresa el nombre de usuario: ");
        var nombre = consola.nextLine().strip();

        System.out.print("Ingresa la contraseña: ");
        var passwd = consola.nextLine().strip();

        var mensajeAutenticacion = switch (nombre) {
            case NOMBRE_ADMIN -> {
                if (passwd.equals(PASSWD_ADMIN))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, por favor corregir.";
            }
            default -> {
                if (passwd.equals(PASSWD_ADMIN))
                    yield "Usuario incorrecto, por favor corregir.";
                else
                    yield "Usuario y password incorrectos, por favor corregir.";
            }
        };

        System.out.println(mensajeAutenticacion);
    }
}
