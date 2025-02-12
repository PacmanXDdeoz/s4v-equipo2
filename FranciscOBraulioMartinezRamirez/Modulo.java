import java.util.Scanner; 
class Modulo{ 
public static void main(String[] args){ 
Scanner sc = new Scanner(System.in);
 System.out.println("Division con modulo");
 System.out.println("Dame un numero");
  int num1 = sc.nextInt();
 System.out.println("Otro numero");
  int num2 = sc. nextInt(); 
 System.out.println("El modulo es: " + modulo(num1, num2));
}
 public static int modulo(int num1, int num2){
 return num1 % num2;
}
}
