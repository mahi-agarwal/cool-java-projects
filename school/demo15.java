import java.util.*;
class demo15
{
    public static void main(String args[])
    {
        //Generate pattern for n rows given by the user
        int n,f ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        n= sc.nextInt();
        if(n>0)
        {
            System.out.println('*');
            for(f=2; f<=n; f++)
            {
                if(f%2==0 && f%4!=0)
                {
                    System.out.println("  *");
                    if(f-1>0)
                    {
                        System.out.println("   *");
                    }
                }
                if(f%4==0)
                {
                    System.out.println("  *");
                    if(f-1>0)
                    {
                        System.out.println('*');
                    }
                }
            }
        }
        System.out.println();
    }
}
    


