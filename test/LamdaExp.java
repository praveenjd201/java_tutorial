@FunctionalInterface
interface A{
    public int add(int i,int j);
    

}


public class LamdaExp {
    public static void main(String[] args) {

        A obj= (i,j) ->  i+j; // lamda expression
            
        

        
       
        
        int result = obj.add(5,10);
        System.out.println(result);
    }
}
