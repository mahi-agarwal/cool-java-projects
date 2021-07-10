import java.util.*;
class demo3
{
    public static void main(String args[])
    {
        //Accept a number and find out whether it is divisible by 5 or not; if not, print the nearest number to it divisible by 5
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n= sc.nextInt();
        int d= n%5;
        if(d==0)
        {
          System.out.println("The number entered is divisible by 5");
        }
        else
        {
          if(d>2)
          {
              d= 5-d;
              n= n+d;
          }
          else
          {
          n= n-d;
          }
          System.out.println("The nearest number from the entered number which is divisible by 5 is "+ n);
        }
        System.out.println();
    }
}