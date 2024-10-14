import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        System.out.println("ingrese su fecha de nacimiento | DD/MM/AAAA");
        String fecha = new Scanner(System.in).nextLine();
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        if (dia > 32){
            System.out.println("fecha incorrecta");
        }else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries\n Hoy será un día lleno de energía y oportunidades. Aprovecha cada momento.");
        } else if (mes == 4 || mes == 5 && dia <= 20) {
            System.out.println("Tauro\n La paciencia será tu mejor aliada hoy. No te precipites en tus decisiones.");
        } else if (mes == 5 || mes == 6 && dia <= 20) {
            System.out.println("Géminis\n Tu mente estará muy activa. Aprovecha para aprender algo nuevo.");
        } else if (mes == 6 || mes == 7 && dia <= 22) {
            System.out.println("Cáncer\n Las emociones estarán a flor de piel. Cuida de ti y de los tuyos.");
        } else if (mes == 11 || mes == 12 && dia <= 21) {
            System.out.println("Sagitario\n La aventura te espera. No temas a los cambios y a los nuevos desafíos.");
        } else if (mes == 12 || mes == 1 && dia <= 19) {
            System.out.println("Capricornio\n La perseverancia te llevará lejos hoy. Sigue adelante con determinación.");
        } else if (mes == 1 || mes == 2 && dia <= 18) {
            System.out.println("Acuario\n Tu creatividad estará en su punto máximo. Deja fluir tus ideas.");
        } else if (mes == 2 || mes == 3) {
            System.out.println("Piscis\n La compasión y la empatía serán tus mejores cualidades hoy. Ayuda a los demás.");
        } else if (mes == 7 || mes == 8 && dia <= 22) {
            System.out.println("Leo\n Tu carisma brillará hoy. Sé el líder que siempre has sido.");
        } else if (mes == 8 || mes == 9 && dia <= 22) {
            System.out.println("Virgo\n La organización será clave hoy. Planifica tus actividades con cuidado.");
        } else if (mes == 9 || mes == 10 && dia <= 22) {
            System.out.println("Libra\n Busca el equilibrio en todas tus relaciones. La armonía es importante.");
        } else if (mes == 10 || mes == 11 && dia <= 21) {
            System.out.println("Escorpio\n Las profundidades de tu mente te guiarán hoy. Sigue tu intuición.");
        } else {
            System.out.println("Fecha invalida  ");
        }
    }
}