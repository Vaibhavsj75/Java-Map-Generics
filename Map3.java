import java.util.*;

class Student
{
        private String name;
        private int age;
        private String city;

        public Student(String name, int age, String city){
            
            this.name=name;
            this.age=age;
            this.city=city;

        }
        public String getName()
        {
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getCity(){
            return city;
        }

        public String toString(){
            return name + " " + age + " " + city;
        }
    }


public class Map3
{
    public static void main(String[] args)
    {
        Student st1=new Student("Vaibhav", 18, "Bengaluru");
        Student st2=new Student("Virat", 19, "Mumbai");
        Student st3=new Student("Dhoni", 20, "Delhi");

        Map map=new HashMap();

        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);

        System.out.println(map);

        Set set=map.entrySet();
        Iterator itr=set.iterator();

        while (itr.hasNext()) 
        {
            // System.out.println(itr.next());
            Map.Entry data=(Map.Entry)itr.next();
            System.out.println(data.getKey()+ " : " +data.getValue());
        }
    }


}
