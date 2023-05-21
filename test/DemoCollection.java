
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

class Student implements Comparable <Student>{
    int age;
    String name;
    
    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student that){
        if (this.age > that.age)
                return 1;
            else
                return -1; 

    }

    
}

public class DemoCollection {

    

    
    public static void main(String[] args) {

        Comparator <Student> com= (i,j) -> i.age > j.age ?1:-1;            
    
            
        // sort the string array with the help of length of the string
        List <Student> stud=new ArrayList<Student>();
        stud.add(new Student( 27, "Praveen"));
        stud.add(new Student(23, "sharath"));
        stud.add(new Student( 44, "shanthi"));
        stud.add(new Student(54, "dhamodaran"));
       
              
        
        Collections.sort(stud,com);
        for(Object n: stud)
        System.out.println(n);












        // Map <String,Integer> map=new HashMap <String,Integer>();
        // map.put("praveen",89);  
        // map.put("ragul",78); 
        // map.put("ajith",98);     

        // // System.out.println(map.get(100));

        // // System.out.println(map.keySet()); 

        // for(String m:map.keySet())
        // {
        //     System.out.println(m+" : "+ map.get(m));
        // }

        // System.out.println(map.entrySet());




 
        // for(Map.Entry m:map.entrySet()){  
        //  System.out.println(m.getKey()+" "+m.getValue());  
        // }  
        
        // Collection <Integer> num= new ArrayList <Integer> ();
        // num.add(2);
        // num.add(5);
        // num.add(5);
        // num.add(65);
        // num.add(54);
        // num.add(23);

        // // System.out.println(num.get(2));
        
        // Iterator<Integer> it=num.iterator();

        // while(it.hasNext())
        //     System.out.println(it.next());
            

        

        
        

        // for(int n:num){
        //     System.out.println(n);
        // }

    }
}
