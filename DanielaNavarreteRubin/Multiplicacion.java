import java.util.Scanner;

public class Multiplicacion {
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = multiplicar(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
