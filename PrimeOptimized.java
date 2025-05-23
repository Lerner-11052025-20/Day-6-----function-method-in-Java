import java.util.Scanner;

public class PrimeOptimized
{













    public boolean isPrime1(int n)
    {
        if(n==1)    return false;
        // for(int i=2 ; i<=n-1 ; i++)
        for(int i=2 ; i<= (int)(Math.sqrt(n-1)) ; i++)
        {
            if(n%i == 0)    return false;
        }
        return true;
    }












    public boolean isPrime2(int n)
    {
        if(n==1)    return false;
        for(int i=2 ; i<=(int)(Math.sqrt(n-1)) ; i++)     if(n%i == 0)    return false;
        return true;
    }
    










    
    public void isPrime3(int n) //boolean hot to last ma farziyat return true; lakhvu padt jethi calling ma Syso(po.isPrime(n)); hovathi last ma ek true print thate pan Syso(); no lakho to ------------> isPrime5(n); onlt lakho and jovo niche
    {
        if(n==1)    System.out.println("not prime as well as not composite");
        if(n<=0)    System.out.println("not prime");

        boolean flag = true;
        for(int i=2 ; i<=n ; i++)
        {

            for(int j=2 ; j<=(int)(Math.sqrt(i-1)) ; j++)   //(int)(Math.sqrt(n-1))
            {
                if(i%j==0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag==true)  System.out.print(i+ " ");
            else
            {
                flag = true;
            }    
        }
    }

















    public boolean isPrime5(int n) //boolean hot to last ma farziyat return true; lakhvu padt jethi clling ma Syso(po.isPrime(n)); hovathi last ma ek true print thate
    {
        if(n==1)   return false;
        if(n<=0)    return false;

        boolean flag = true;
        for(int i=2 ; i<=n ; i++)
        {

            for(int j=2 ; j<=(int)(Math.sqrt(i-1)) ; j++)   //(int)(Math.sqrt(n-1))
            {
                if(i%j==0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag==true)  System.out.print(i+ " ");
            else
            {
                flag = true;
            }    
        }

        return false;
    }
















    public void isPrime4(int n)
    {
        if(n>=1) //only for the natural numbers system
            {
                boolean flag = true;
                for(int i=2 ; i<=(int)(Math.sqrt(n-1)) ; i++)
                {
                    if(n%i == 0)
                    {
                        flag = false;
                        break;
                    }
                }
    
                if(n==1)
                {
                    System.out.println("1 is NOT PRIME & NOT COMPOSITE number.");
                }
                else if(n==2)
                {
                    System.out.println("2 is an EVEN PRIME number.");
                }
                else if(flag == true)
                {
                    System.out.println("your entered number " +n+ " is a PRIME number." );
                }
                else
                {
                    System.out.println("Your entered number is +ve number as well as a COMPOSITE number but NOT PRIME number.");
                }
            }
            else
            {
                if(n==0)
                {
                    System.out.println("Your enterd number Is O , which is a not valid number for checking PRIME numbers.");
                }
                else
                {
                    System.out.println("your entered number " +n+ " , Is a negative number , which is a not valid number for checking PRIME numbers.");
                }
            }
    }














    public void isPrime6(int st , int end) //boolean hot to last ma farziyat return true; lakhvu padt jethi calling ma Syso(po.isPrime(n)); hovathi last ma ek true print thate pan Syso(); no lakho to ------------> isPrime5(n); onlt lakho and jovo niche
    {
        //if(st==1)    System.out.println("not prime as well as not composite");
        
        
        
        if(st<=0 || end<=0)    System.out.println("invalid input");
        // bhega chhe 
        
        else
        {            
            boolean flag = true;
            for(int i=st ; i<=end ; i++)
            {
                for(int j=2 ; j<=(int)(Math.sqrt(i-1)) ; j++)   //(int)(Math.sqrt(n-1))
                {
                    if(i%j==0)
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag==true)  System.out.print(i+ " ");
                else
                {
                    flag = true;
                }    
            }
        }
    }


















    



    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            PrimeOptimized po = new PrimeOptimized();
            // po.isPrime3(n);
            po.isPrime6(n,m);
            // po.isPrime5(n);
            // System.out.println(po.isPrime5(n));
            // System.out.println(po.isPrime1(n));

            sc.close();
        }
    }
}