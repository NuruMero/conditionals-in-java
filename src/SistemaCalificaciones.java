import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("Introduce la nota (1-10): ");
        var notaNum = Double.parseDouble(consola.nextLine());
        var notaLetra = "";

        if (notaNum <= 10 && notaNum>=9) {
            notaLetra = "A";
        } else if (notaNum <9 && notaNum>=8) {
            notaLetra = "B";
        } else if (notaNum <8 && notaNum>= 7) {
            notaLetra = "C";
        } else if (notaNum <7 && notaNum>= 6) {
            notaLetra = "D";
        } else if (notaNum <6 && notaNum>= 0) {
            notaLetra = "F";
        } else {
            notaLetra = "Valor desconocido";
        }

    }
}
