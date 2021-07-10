import java.io.*;
class pattern2 
{
    public static void main(String args[])
    {
        int j, k;
        //loop for number of lines for the increasing part 
        for(j=1; j<=7; j++)
        {
            System.out.println();
            //loop for printing numbers in each line 
            for(k=1; k<=j; k++)
            {
                System.out.print(k);
            }
        }
        //loop for number of lines for the decreasing part
        for(j=6; j>0; j--)
        {
            System.out.println();
            //loop for printing numbers in each line 
            for(k=1; k<=j; k++)
            {
                System.out.print(k);
            }
        }
        System.out.println();
    }
}