import java.util.Scanner;

public class RecomendacionPeliculas {
    public static void main(String[] args) {
        System.out.println("Ingrese su genero favorito : accion, comedia, drama, ciencia ficcion");
        Scanner teclado = new Scanner(System.in);
        String genero = teclado.nextLine().toLowerCase();

        switch (genero) {
            case "accion":
                System.out.println("Podrias ver el transportador");
                break;
            case "comedia":
                System.out.println("Podrias ver son como niños");
                break;
            case "drama":
                System.out.println("Podrias ver la isla siniestra");
                break;
            case "ciencia ficcion":
                System.out.println("Podrias ver interestellar");
                break;
            default:
                System.out.println("La opcion ingresada no es valida");

        }
    }
}
