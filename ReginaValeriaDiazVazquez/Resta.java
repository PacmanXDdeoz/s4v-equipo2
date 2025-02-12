import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int r = operation.nextInt();
        System.out.println("Ingresa otro numero");
        int i = operation.nextInt();
        System.out.println("tu resultado es:"+ resta(r, i));
    }

    public static int resta(int r, int i) {
        return r - i;
    }
}
