import java.util.Scanner;

public class ListasReproduccion {
    public static void main(String[] args) {
        System.out.println("Ingrese su estado de animo \nfeliz, \ntriste, \nenergico, \nrelajado");
        Scanner teclado = new Scanner(System.in);
        String estado = teclado.nextLine().toLowerCase();


        switch (estado) {
            case "feliz":
                System.out.println("Estas feliz, tu musica sera asdasd");
                break;
            case "triste":
                System.out.println("Estas triste, tu musica sera asdasd");
                break;
            case "energico":
                System.out.println("Estas energico, tu musica sera asdasd");
                break;
            case "relajado":
                System.out.println("Estas relajado, tu musica sera asdasd");
                break;
            default:
                System.out.println("Ingresaste una opcion no válida");

    }}
}
