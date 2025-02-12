import java.util.Scanner;
class Division{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(division(a,b));
        sc.close();
    }
    public static double division(int a, int b){
        return (double)a/b;
    }
}