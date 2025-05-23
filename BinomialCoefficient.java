import java.util.Scanner;

public class BinomialCoefficient
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
        int r = sc.nextInt();

        int nCr  = factorial(n) / (factorial(r) * factorial(n-r)) ;
        System.out.println("nCr = " +nCr);
    }    
}
