import java.util.Scanner;
class Modulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(modulo(a,b));
        sc.close();
    }
    public static double modulo(int a, int b){
        return (double)(a%b);
    }
}