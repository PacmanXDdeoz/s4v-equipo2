import java.util.Scanner;

class Bienvenida{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame tu nombre");
    String nombre = sc.nextLine();
    System.out.println("Bienvenido: " + nombre);
}
}
