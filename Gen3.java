import java.util.*;



class Gen<T>
{
    T obj;

    public Gen(T obj)
    {
        this.obj=obj;
    }

    void disp()
    {
        System.out.println("This type of data : " + obj.getClass().getName());
    }

    public T getObj()
    {
        return obj;
    }
}
public class Gen3
{
    public static void main(String[] args) 
    {
        Gen<String> g1=new Gen<String>("Hey");

        g1.disp();
        System.out.println(g1.getObj());

        // ArrayList<Gen> list1=new ArrayList<Gen>();

        // List<String> list2=new ArrayList<String>();

        // Collection<Integer> list3=new ArrayList<Integer>();

        // List<Object> list 4=new ArrayList<Integer>(); //CE
        // list<Integer> list5=new ArrayList<Integer>();
    }
}

