import java.util.Scanner;
class Resta {
public static int restar(int a,int b){
return a-b;
}
 public static void main (String[] args){
Scanner sc= new Scanner (System.in);
System.out.print("Ingrese el primer numero; ");
int num1= scanner.nextInt();
System.out.print("Ingrese el segundo numero: ");
int num2= scanner.nextInt();
System.out.println("La resta es: " + restar(num1, num2));
scanner.close();
}
}
