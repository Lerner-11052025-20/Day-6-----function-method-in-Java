import java.util.Scanner;

public class Factorial
{
    public static int factorial(int n)
    {
        int pro=1;
        for(int i=1 ; i<=n ; i++)   pro*=i;
        return pro;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        System.out.println(factorial(n));
    }
}