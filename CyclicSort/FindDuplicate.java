import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        
        int [] arr={1,3,4,2,2};
        
        System.out.println(findDuplicate(arr));

    }
    static List <Integer>  findDuplicate(int[] arr){
        int i=0;
        
        
        while(i<arr.length){
          

            int correctindex= arr[i]-1;
            if(arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
        List <Integer> ans=new ArrayList<>();
        
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
        

    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }


}
