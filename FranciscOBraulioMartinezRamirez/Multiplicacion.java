import java.util.Scanner;

class Multiplicacion{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("Multiplicacion de numeros");
 System.out.println("Dame un numero");
  int num1 = sc.nextInt();
 System.out.println("Otro numero");
  int num2 = sc.nextInt();
 System.out.println("El resultado es: " + multiplicar(num1, num2));
}
public static int multiplicar(int num1, int num2){
return num1 * num2;
}
}
