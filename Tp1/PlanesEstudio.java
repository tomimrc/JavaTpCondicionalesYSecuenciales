import java.util.Scanner;

public class PlanesEstudio {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de horas al dia para estudiar");
        Scanner teclado = new Scanner(System.in);
        int horas = teclado.nextInt();
        System.out.println("Ingrese la cantidad de materias");
        int materias = teclado.nextInt();
        double horasXMateria = (double) horas / materias;
        System.out.println("la cantidad de horas para estudiar cada materia es de: " + horasXMateria);




       }
}
