import java.util.*;

public class Map4 
{
    
    public static void main(String[] args) {
        
        Hashtable ht=new Hashtable<>();

        ht.put(1, "virat");
        // ht.put(2, "Akshay");
        ht.put(3, "Vaibhav");
        // ht.put(null, "Striver");
        ht.putIfAbsent(2, "Akshay");

        System.out.println(ht);


        TreeMap tm=new TreeMap();

        // Integer i=new Integer(null)

        tm.put(2, "Virat");
        tm.put(1, "Akshay");
        tm.put(4, "Dhoni");
        tm.put(3, "Vaibhav");

        System.out.println(tm);

    }
}
