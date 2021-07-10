import java.util.*;
class demo18
{
    public static void main()
    {
        //Accepting a string and removing all words which begin with a vowel, and printing the new string
        int l, i1=1, i2, word=0;
        System.out.println("Enter a string");
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        n= n.toLowerCase();
        n= " "+ n+ " ";
        String flag1= "";
        String flag= "";
        l= n.length();
        for(i1=1; i1<=l-1; i1++)
        {
            char c1= n.charAt(i1);
            char pre= n.charAt(i1-1);
            if(c1!= 'a' && c1!= 'e' && c1!= 'i' && c1!= 'o' && c1!= 'u' && pre==' ')
            {
                i2= i1;
                char c2= n.charAt(i2);
                while(c2!=' ')
                {
                    c2= n.charAt(i2);
                    flag1= flag1+ c2;
                    i2++;
                }
                flag= flag+ flag1;
                flag1= "";
            }
        }
        System.out.println(flag);
        System.out.println();
    }
}