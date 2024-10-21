import java.util.Scanner;

public class bucles1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int suma = 0;


        for (int i = 0; i < 4 ; i++) {
            System.out.println("Ingrese la cantidad de horas al dia que dedica ");
            suma = suma + teclado.nextInt();
        }

        System.out.println(suma);
    }
}
