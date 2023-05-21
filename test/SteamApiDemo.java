import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamApiDemo {
    
    
    public static void main(String[] args) {
        int result=0;
        List <Integer> nums=Arrays.asList(1,2,3,4,5,6,7);

        Stream <Integer> s1=nums.stream();
        Stream <Integer> s2=s1.filter(n -> n%2==0);
        Stream <Integer> s3=s2.map(n->n*2);
        int out=s3.reduce(0,(c,e) -> c+e );

            

        System.out.println(out);

        nums.forEach(t ->  System.out.println(t));

        

     
        // for (int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         result=result+n;
                
        //     }
           
        // }
        // System.out.println(result);
        

        




    }
}
