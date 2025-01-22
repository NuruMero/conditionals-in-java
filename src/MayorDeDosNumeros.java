import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** El mayor de dos números ***");
        var consola = new Scanner(System.in);

        System.out.print("Primer valor: ");
        var primero = Double.parseDouble(consola.nextLine());

        System.out.print("Segundo valor: ");
        var segundo = Double.parseDouble(consola.nextLine());

        // El mayor de dos numeros
        var resultado = (primero >= segundo) ? primero : segundo;

        System.out.println("El valor mas alto es " +resultado);
    }
}
