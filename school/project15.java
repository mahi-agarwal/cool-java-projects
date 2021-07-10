//boarding pass
import java.util.*;
class project15
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter full name:");
        String name= sc.nextLine();
        System.out.println("Enter gender-1.female 2.male 3.other");
        int g= sc.nextInt();
        System.out.println("Enter marital status-1.married 2.unmarried");
        int m= sc.nextInt();
        String[] gender= {"Ms." , "Mr." , ""};
        if(m==1)
        {
            gender[0]= "Mrs.";
        }
        int space= name.indexOf(' ');
        if(space<0)
        {
            name= name+ " ";
            space= name.indexOf(' ');
        }
        //separating the different parts of the full name
        String first= name.substring(0,space);
        int space2= name.lastIndexOf(' ');
        String second= name.substring(space,space2);
        String last= name.substring(space2);
        //printing the output
        System.out.println("Boarding pass: "+ last+'/'+second+'/'+first+'/'+gender[(g-1)]);
        System.out.println();
    }
}