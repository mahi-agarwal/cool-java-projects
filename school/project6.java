/*to create an ice cream sandwich i.e. the ends are repetition 
 *of one letter and the middle has a different letter repeated.
 *Also accept the number of repetitions.*/
import java.util.*;
class project6
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        //accepting the input
        System.out.println("Enter the first character:");
        char c1= sc.next().charAt(0);
        System.out.println("Enter the second character:");
        char c2= sc.next().charAt(0);
        System.out.println("Enter the number of repetitions:");
        int n= sc.nextInt();
        String s= "";
        //adding the first character's repetitions to a new String
        for(int i=1; i<=n; i++)
        {
            s= s+ c1;
        }
        //adding the second character's repetitions
        for(int i=1; i<=n; i++)
        {
            s= s+ c2;
        }
        //adding the first character's repetitions again
        for(int i=1; i<=n; i++)
        {
            s= s+ c1;
        }
        //printing the output String
        System.out.println("Ice cream sandwich:");
        System.out.println(s);
        System.out.println();
    }
}