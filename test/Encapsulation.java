

class Human{
    private String name;
    private int age;

      

    public String getName(){

        return name;
    }
    public int getAge(){

        return age;
    }
    public void setName(String name){
        this.name=name;
        
    }
    public void setAge(int age){
        this.age=age;
    }
    public Human(){
        age=12;
        name="jfkfjd";

    }  
}
class A{
    public A(){
        System.out.println("hey iam construtor A");
    }

    public A(int a){
        System.out.println("hay iam int a");
    }
}
class B extends A{
    
    

    public B(){
        super();
        
        System.out.println("hey iam construtor B");
    }
    public B(int b){
        super();
        System.out.println("hey iam int b");
    }       

}

public class Encapsulation {
    public static void main(String []args){
        // Human obj1=new Human();
        // Human obj2=new Human();

        new B();

        // obj1.setName("praveen");
        // obj1.setAge(26);

        //obj1.name="Praveen kumar";
        // System.out.println(obj1.getName() + ":" + obj1.getAge());    
        
             

    }
    
}
