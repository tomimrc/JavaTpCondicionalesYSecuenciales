import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();


        String recomendacion;

        switch (estadoAnimo) {
            case "feliz":
                recomendacion = "¡Genial! Disfruta de un paseo al aire libre o comparte un momento con amigos.";
                break;
            case "triste":
                recomendacion = "Lamento que te sientas así. Te recomiendo ver tu película favorita o escuchar música que te haga sentir mejor.";
                break;
            case "enérgico":
                recomendacion = "¡Fantástico! Aprovecha tu energía para hacer ejercicio o practicar un deporte.";
                break;
            case "relajado":
                recomendacion = "Excelente. Dedica tiempo a la meditación o a leer un buen libro.";
                break;
            default:
                recomendacion = "No reconozco ese estado de ánimo. Por favor, elige entre feliz, triste, enérgico o relajado.";
        }


        System.out.println(recomendacion);

    }
}
