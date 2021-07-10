import java.util.*;
class method1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("isEven method");
        System.out.println("Enter an integer");
        int a= sc.nextInt();
        System.out.println(isEven(a));
        System.out.println();
    }
    public static boolean isEven(int x)
    {
        if(x%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }  
}