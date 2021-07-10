import java.util.*;
class overload3
{
    static void SumSeries(int n, double x)
    {
        double s= x/1;
        for(int i=2; i<=n; i++)
        {
            if(i%2==0)
            {
                s= s - (x/i);
            }
            else
            {
                s= s + (x/i);
            }
        }
        System.out.println("Sum of the series= "+ s);
    }
    static void SumSeries()
    {
        double s=0, k=1;
        for(int i=1; i<=20; i++)
        {
            for(int j=1; j<=i; j++)
            {
                k= k*j;
            }
            s= s+k;
        }
        System.out.println("Sum of the series= "+ s);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose sum of series option:");   
        System.out.println("1. x/1 - x/2 + x/3 - x/4....n");
        System.out.println("2. 1+(1x2)+(1x2x3)+....(1x2...x20)");
        int opt= sc.nextInt();
        switch(opt)
        {
            case 1:
            System.out.println("Enter a value");
            double a= sc.nextDouble();
            System.out.println("Enter a limit");
            int b= sc.nextInt();
            SumSeries(b,a);
            break;
            
            case 2:
            SumSeries();
            break;
            
            default:
            System.out.println("Invalid value");
        }
        System.out.println();
    }
}