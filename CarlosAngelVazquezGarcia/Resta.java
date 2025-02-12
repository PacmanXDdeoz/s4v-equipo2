import java.util.Scanner;
class Resta{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(resta(a,b));
        sc.close();
    }
    public static int resta(int a, int b){
        return (int)a-b;
    }
}