import java.util.*;
class demo16
{
    public static void main(String args[])
    {
        //Generating a pattern where every new row is generated fro  the positive difference between the digits of the number in the preceeding row
        int x, d, t;
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        d= 0;
        t= x;
        while(t>0)
        {
            d++;
            t= t/10;
        }
        int d2= d-1;
        System.out.println(x);
        for(int i=0; i<d2; i++)
        {
            String n= "";
            for(int j=0; j<d-1; j++)
            {
                int diff= Math.abs(((x%100) / 10) - (x%10));
                n = diff + n;
                x = x / 10;
            }
            x= Integer.parseInt(n);
            System.out.println(n);
            d = d - 1; 
        }
        System.out.println();
    }
}