import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int distancia = teclado.nextInt();
        double consumoXKm = 0.2;
        double precioXLitro = 1050;

        double precioTotal = distancia * consumoXKm * precioXLitro;
        System.out.println(precioTotal + "Sera el total del viaje");

    }
}
