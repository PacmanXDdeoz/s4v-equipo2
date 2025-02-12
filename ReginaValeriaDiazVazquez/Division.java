import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        double r = operation.nextInt();
        System.out.println("Ingresa otro numero");
        double i = operation.nextInt();
        System.out.println("tu resultado es: "+ div(r, i));
    }

    public static double div(double r, double i) {
        return r / i;
    }
}
