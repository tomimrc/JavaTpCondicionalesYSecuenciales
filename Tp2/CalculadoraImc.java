import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        System.out.println("Ingrese su peso en kg");
        Scanner teclado = new Scanner(System.in);
        float peso = teclado.nextFloat();
        System.out.println("Ingrese su altura en m utilizando la coma");
        double altura = teclado.nextDouble();
        double imc = peso / (altura * 2);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }else if (imc >= 30) {
            System.out.println("Obesidad");
        }
    }
}

