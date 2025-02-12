import java.util.Scanner;

public class Division {
    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN;
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el denominador: ");
        double num2 = scanner.nextDouble();

        double resultado = dividir(num1, num2);
        System.out.println("Resultado de la división: " + resultado);

        scanner.close();
    }
}
