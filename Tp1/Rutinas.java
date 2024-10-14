import java.util.Scanner;

public class Rutinas {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese su nivel de entrenamiento \nPrincipiante \nIntermedio \nAvanzado");
        String nivel = teclado.nextLine().toLowerCase();

        switch (nivel){
            case "principiante":
                System.out.println("Su rutina seran 3 ejercicios y durará 30 minutos");
                break;
            case "intermedio":
                System.out.println("Su rutina seran 5 ejercicios y durará 50 minutos");
                break;
            case "avanzado":
                System.out.println("Su rutina seran 7 ejercicios y durará 90 minutos");
                break;
            default:
                System.out.println("Ingresó una opcion inválida");
        }

    }
}
