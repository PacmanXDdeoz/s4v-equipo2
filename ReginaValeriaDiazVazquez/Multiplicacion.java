import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int r = operation.nextInt();
        System.out.println("Ingresa otro numero");
        int i = operation.nextInt();
        System.out.println("tu resultado es:"+ multi(r, i));
    }

    public static int multi(int r, int i) {
        return r * i;
    }
}
