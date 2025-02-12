import java.util.Scanner;

class Division{ 
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Division de numeros");
 System.out.println("Dame el primer numero");
 int num1 = sc.nextInt();
 System.out.println("Dame otro numero");
 int num2 = sc.nextInt();
 System.out.println("El resultado es: " + dividir(num1, num2));
}
public static double dividir(int num1, int num2){
if (num2==0){
 System.out.println("No se puede dividir entre 0");
return 0;
}
return (double) num1/num2;
}
}
