import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {
        System.out.println("Ingrese su categoria: jubilado, estudiante, adulto");
        Scanner teclado = new Scanner(System.in);
        String categoria = teclado.nextLine().toLowerCase();
        System.out.println("Ingrese el precio");
        int precio = teclado.nextInt();

        switch (categoria) {
            case "jubilado":
                System.out.println("El precio es de: " + precio * 0.85);
                break;
            case "estudiante":
                System.out.println("El precio es de: " + precio * 0.90);
                break;
            case "adulto":
                System.out.println("El precio es de: " + precio * 0.95);
                break;
            default:
                System.out.println("La opcion ingresada no es valida");

        }
    }
}
