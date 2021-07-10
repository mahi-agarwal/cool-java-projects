//percentage of each character
import java.util.Scanner;
class project14
{
    public static void main(String srgs[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String n= sc.nextLine();
        n= n.toLowerCase();
        int l= n.length();
        int[] counter= new int[256];
        float percent= 0f;
        //counting frequency of each character
        for(int i=0; i<l; i++)
        {
            char c= n.charAt(i);
            counter[(int)c]++;
        }
        //calculating and printing the frequency of each character
        for(int i=0; i<256; i++)
        {
            if(counter[i]!=0)
            {
                percent= (counter[i]*100)/l;
                System.out.println((char)i + ": "+ percent + '%');
            }
            percent= 0;
        }
        System.out.println();
   }
}