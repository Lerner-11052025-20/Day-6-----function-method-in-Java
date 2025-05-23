import java.util.Scanner;

public class Sum
{
    public int sum(int a , int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Sum s = new Sum();
        System.out.println(s.sum(n,m));
    }
}