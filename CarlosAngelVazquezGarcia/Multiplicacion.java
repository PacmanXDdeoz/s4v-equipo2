import java.util.Scanner;
class Multiplicacion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multiplicacion(a,b));
        sc.close();
    }
    public static int multiplicacion(int a, int b){
        return (int)a*b;
    }
}