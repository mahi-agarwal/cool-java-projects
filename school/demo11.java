import java.util.*;
class demo11
{
    public static void main()
    {
        //Declare a class student and allot the stream according to the average marks of 5 subjects
        float m= 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of the student");
        String name= sc.nextLine();
        System.out.println("Enter the student's roll no.");
        int roll= sc.nextInt();
        System.out.println("Enter the marks of 5 subjects(Press enter after each)");
        for(int i=1;i<=5; i++)
        {
            float m1= sc.nextFloat();
            m= m+m1;
        }
        m= (m/5);
        System.out.println("Student's name: "+ name);
        System.out.println("Roll no.: "+ roll);
        String stream= "";
        if(m>=90)
        {
            stream= "Science with Computers";
        }
        else if(m>=80 && m<=89)
        {
            stream= "Science without Computers";
        }
        else if(m>=70 && m<=79)
        {
            stream= "Commerce with Maths";
        }
        else if(m>=60 && m<=69)
        {
            stream= "Commerce without Maths";
        }
        else
        {
            stream= "Invalid Values";
        }
        System.out.println(stream);
        System.out.println();
    }
}
