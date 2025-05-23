import java.util.Scanner;

public class Product
{
    public static int product(int a , int b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(product(n,m));
    }
}