import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.*;

public class Map1 
{
    public static void main(String[] args) 
    {
        // HashMap hm=new HashMap<>();
        // Hashtable ht=new Hashtable<>();
        // LinkedHashMap lhm=new LinkedHashMap<>();
        // TreeMap tm=new TreeMap();

        HashMap hm=new HashMap<>();

        // hm.put(null, null);
        hm.put(01, "Vaibhav");
        hm.put(02, "Striver");
        hm.put(03, "Coder");
        // hm.put(03, "Coder");

        System.out.println(hm);

        HashMap hm1=new HashMap<>();

        hm1.put("Striver", "Singh");
        hm1.put("Vaibhav", "Jadhav");
        hm1.put("Virat", "Kholi");

        System.out.println(hm1);

        LinkedHashMap lhm=new LinkedHashMap<>();

        lhm.put("Striver", "Singh");
        lhm.put("Vaibhav", "Jadhav");
        lhm.put("Virat", "Kholi");

        System.out.println(lhm);
        
    }
}
