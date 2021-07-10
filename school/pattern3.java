import java.io.*;
class pattern3
{
    public static void main(String args[])
    {
        int j, k;
        //loop for number of lines
        for(j=1; j<=7; j++)
        {
            System.out.println();
            //loop for printing numbers in each line
            for(k=7; k>=j; k--)
            {
                System.out.print(k);
            }
        }
        System.out.println();
    }
}