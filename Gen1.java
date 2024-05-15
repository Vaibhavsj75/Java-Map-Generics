
import java.util.*;

public class Gen1
{
    public static void main(String[] args) 
    {
        // //typesafety
        // String ar[]=new String[10];
        // ar[1]="vaibhav";
        // ar[2]="Virat";
        // // ar[3]=10; //CE

        // String name1=ar[1];
        // String name2=ar[2];

        //Notypesafety
        //typesafety achived using generics
        ArrayList<String> al=new ArrayList<String>();

        al.add("Vaibhav");
        al.add("virat");

        // al.add(10);

        // String n1=(String)al.get(1);//typecasting
        // String n2=(String)al.get(2);
        // String n3=(String)al.get(3);

        String n1=al.get(1);
        String n2=al.get(2);
        



        }

    }

