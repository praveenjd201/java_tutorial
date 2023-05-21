import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
       // Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        int count=9;
        System.out.println(count);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                list.get(i).add(count);   
                count -=1;             
            }
        }
        System.out.println(list);
        System.out.println(list.get(0).get(1));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(i).get(j) +" ");
            }
            System.out.println();

        }

    }
}
