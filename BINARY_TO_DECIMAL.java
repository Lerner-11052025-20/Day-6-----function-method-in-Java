// import java.util.Scanner;
// public class BINARY_TO_DECIMAL
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum=0,copy=n;
//         int power = 1;
//         while(copy>0)
//         {
//             int ld = copy%10;
//             sum = sum + (ld*power);
//             power *= 2;
//             copy /= 10;
//         }
//         System.out.println(sum);
//     }
// }



















import java.util.Scanner;
public class BINARY_TO_DECIMAL
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0,copy=n;
        int power = 1;
        while(copy>0)
        {
            int ld = copy%2;
            sum = sum + (ld*power);
            power *= 10;
            copy /= 2;
        }
        System.out.println(sum);
    }
}