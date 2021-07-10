import java.util.*;
class method3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        float m= sc.nextFloat();
        System.out.println(grade(m));
        System.out.println();
    }
   public static String grade(float a)
   {
        if(a>=91 && a<=100)
        {
            return "Grade AA- Excellent efforts!";
        }
        else if(a>=81 && a<=90)
        {
            return "Grade AB- Great job!";
        }
        else if(a>=71 && a<=80)
        {
            return "Grade BB- Very good!";
        }
        else if(a>=61 && a<=70)
        {
            return "Grade BC- Good!";
        }
        else if(a>=51 && a<=60)
        {
            return "Grade CD- Can do better";
        }
        else if(a>=41 && a<=50)
        {
            return "Grade DD- Must work hard.";
        }
        else if(a<=40)
        {
            return "Grade BB- Must work very hard.";
        }
        else
        { 
            return "Invalid entry";
        }
    }
}