import java.util.Scanner;
class Suma{
public static int sumar(int a, int b) {
 return a+b;
}
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese el primer numero: ");
int num1=scanner.nextInt();
System.out.println("Ingrese el segundo numero: ");
int num2=scanner.nextint();
int resultado= sumar(num1,num2);
System.out.println("La suma es: " + resultado);
  scanner.close();
}
}
