import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        double peso = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de minutos que entrenó");
        int duracion = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el tipo de ejercicio: \nCorrer\nNadar\nAndar\nBicicleta");
        String tipoEjercicio = teclado.nextLine().toLowerCase();

//        tipoEjercicio.toLowerCase();
        double caloriasNadar = duracion * 1.8;
        double caloriasCorrer = duracion * 1.6;
        double caloriasAndar = duracion * 1.2;
        double caloriasBicicleta = duracion * 1.4;

        switch (tipoEjercicio){
            case "correr":
                System.out.println(caloriasCorrer  + " fueron  quemadas en su entrenamiento");
                break;
            case "nadar":
                System.out.println(caloriasNadar  + " fueron  quemadas en su entrenamiento");
                break;
            case "andar":
                System.out.println(caloriasAndar + " fueron  quemadas en su entrenamiento");
                break;
            case "bicicleta":
                System.out.println(caloriasBicicleta + " fueron  quemadas en su entrenamiento");
                break;
            default:
                System.out.println("Eligió una opción inválida");
        }

    }
}
