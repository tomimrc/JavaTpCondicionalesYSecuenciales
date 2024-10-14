import java.util.Scanner;

public class Felicidad {
    public static void main(String[] args) {
        System.out.println("Ingrese su nivel de satisfaccion del 1 al 10");
        Scanner teclado = new Scanner(System.in);
        int satisfaccion = teclado.nextInt();
        System.out.println("Ingrese su nivel de salud del 1 al 10");
        int salud = teclado.nextInt();
        System.out.println("Ingrese su nivel de estres del 1 al 10");
        int estres = teclado.nextInt();

        double indiceFelicidad = (satisfaccion +salud - estres) / 2;

        System.out.println("Su nivel de felicidad  es de : " + indiceFelicidad);
    }
}
