import java.util.Scanner;

public class Libros {
    public static void main(String[] args) {
        System.out.println("Ingrese su categoria:fantasia, misterio, romance, ciencia ficcion");
        Scanner teclado = new Scanner(System.in);
        String categoria = teclado.nextLine().toLowerCase();


        switch (categoria) {
            case "fantasia":
                System.out.println("Podrias leer el mago de oz");
                break;
            case "misterio":
                System.out.println("Podrias leer la isla siniestra");
                break;
            case "romance":
                System.out.println("Podrias leer emily en paris");
                break;
            case "ciencia ficcion":
                System.out.println("Podrias leer interestellar");
                break;
            default:
                System.out.println("La opcion ingresada no es valida");

        }
    }
}
