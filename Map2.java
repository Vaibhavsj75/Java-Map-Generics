import java.util.*;

public class Map2 
{
    
    public static void main(String[] args) {
        
        Map map=new HashMap<>();

        map.put(1, "Vaibhav");//Entry
        map.put(2, "Virat");
        map.put(3, "Java");
        map.put(4, "Dhoni");

        System.out.println(map);

        System.out.println(map.get(4));

        Set Keyset=map.keySet();
        Iterator itr1=Keyset.iterator();
        while (itr1.hasNext()) 
        {
            // System.out.println(itr1.next());
            Integer key=(Integer)itr1.next();
            System.out.println(key);
        }

        Collection values=map.values();
        Iterator itr2=values.iterator();
        while (itr2.hasNext()) 
        {
            // System.out.println(itr2);
            String name=(String)itr2.next();
            System.out.println(name);
        }

        Set entrySet=map.entrySet();
        Iterator itr3=entrySet.iterator();
        while (itr3.hasNext()) 
        {
            // System.out.println(itr3);
            Map.Entry data=(Map.Entry)itr3.next();
            System.out.println(data.getKey()+ " : " + data.getValue());
        }

    
    }
}
