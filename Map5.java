import java.util.*;
import java.util.HashMap;

class Employee
{
    private String name;
    private int empId;

    public Employee(String name, int empId){
        this.name=name;
        this.empId=empId;
    }
    public String toString()
    {
        return empId + " ";
    }
    @Override
    public void finalize()
    {
        System.out.println("Clean up work by GC before allocating memory from heap");
    }
}

public class Map5
{
    public static void main(String[] args) 
    {
        Employee e=new Employee("Virat", 171);

        WeakHashMap hm=new WeakHashMap<>();
        hm.put(e, "Virat");
        System.out.println(hm);

        e=null; // Eligible for Garbage collection
        System.gc(); // Invoking Garbage collector
        System.out.println("Last line");
    }
}
