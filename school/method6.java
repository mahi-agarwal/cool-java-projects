import java.util.*;
class method6
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        char c1= sc.next().charAt(0);
        System.out.println("Enter a character");
        char c2= sc.next().charAt(0);
        characters(c1,c2);
        System.out.println();
    }
    public static void characters(char a1, char a2)
    {
        int b1= a1;
        int b2= a2;
        if(b1>b2)
        {
            int flag= b1;
            b1= b2;
            b2= flag;
        }
        String s= "";
        int count= 0;
        for(int i=b1; i<=b2; i++)
        {
            char c= (char)i;
            count++;
            if(count>20)
            {
                System.out.println();
                count= 0;
            }
            System.out.print(c+ " ");
        }
    }
}