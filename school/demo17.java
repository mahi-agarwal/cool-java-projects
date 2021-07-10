import java.util.*;
class demo17
{
    public static void main()
    {
        //Arrange words of a string in ascending order of their length
        int count= 0, i, max=0;
        String flag= "";
        String fin= "";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String n= sc.nextLine();
        n= n+ " ";
        int l= n.length();
        for(i=0; i<=l-1; i++)
        {
            char c= n.charAt(i);
            if(c!=' ')
            {
               count++;
               flag= flag+ c; 
            }
            else
            {
                if(count>=max)
                {
                    max= count;
                    fin= fin+ " "+ flag+ " ";
                }
                else
                {
                    fin= flag+ " "+ fin;
                }
                count= 0;
                flag= "";
            }
        }
        System.out.println(fin);
        System.out.println();
    }
}