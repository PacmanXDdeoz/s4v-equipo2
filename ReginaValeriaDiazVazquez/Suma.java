import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int r = operation.nextInt();
        System.out.println("Ingresa otro numero");
        int i = operation.nextInt();
        System.out.println("tu resultado es:"+ suma(r, i));
    }

    public static int suma(int r, int i) {
        return r + i;
    }
}
