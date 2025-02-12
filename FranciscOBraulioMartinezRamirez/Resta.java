import java.util.Scanner;

class Resta{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Resta de numeros");
System.out.println("Dame un numero: ");
int num1 = sc.nextInt();
System.out.println("Dame otro numero; ");
int num2 = sc.nextInt();
System.out.println(restar(num1,num2));
}
public static int restar(int num1, int num2){
return num1 - num2;
}
}
