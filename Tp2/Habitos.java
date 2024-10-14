import java.util.Scanner;

public class Habitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día duermes? ");
        int horasSueño = scanner.nextInt();


        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();


        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();


        String evaluacion = "Tus hábitos saludables son: ";

        if (horasSueño >= 7) {
            evaluacion += "\n- Duerme suficiente.";
        } else {
            evaluacion += "\n- Podrías mejorar tu descanso.";
        }

        if (horasEjercicio >= 1) {
            evaluacion += "\n- Haces ejercicio regularmente.";
        } else {
            evaluacion += "\n- Te falta actividad física.";
        }

        if (comidasSaludables >= 3) {
            evaluacion += "\n- Tienes una buena ingesta de comidas saludables.";
        } else {
            evaluacion += "\n- Intenta aumentar tus comidas saludables.";
        }

        System.out.println(evaluacion);

    }
}