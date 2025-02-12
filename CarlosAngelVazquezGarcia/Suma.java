import java.util.Scanner;
class Suma{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(suma(a,b));
        sc.close();
    }
    public static int suma(int a, int b){
        return (int)a+b;
    }
}