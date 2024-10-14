import java.util.Scanner;
import java.util.Random;

public class PiedaPapelTijera {
    public static void main(String[] args) {
        System.out.println("Elige\n 1-piedra \n 2-papel  \n 3-tijera. \n Ingresa el nro");
        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();
        int eleccionMaquina = new Random().nextInt(1,4);

        if (eleccion == eleccionMaquina){
            System.out.println("Empate elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        } else if (eleccion == 1 && eleccionMaquina == 2) {
            System.out.println("Perdiste! elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        } else if (eleccion == 2 && eleccionMaquina == 3) {
            System.out.println("Perdiste! elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        }else if (eleccion == 2 && eleccionMaquina == 1) {
            System.out.println("ganaste! elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        }else if (eleccion == 3 && eleccionMaquina == 2) {
            System.out.println("ganaste! elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        }else if (eleccion == 3 && eleccionMaquina == 1) {
            System.out.println("Perdiste! elegiste " + eleccion +" la maquina eligio: " + eleccionMaquina);
        }
    }
}

