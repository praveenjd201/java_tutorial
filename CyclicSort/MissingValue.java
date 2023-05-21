import java.util.Arrays;

public class MissingValue {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        
        
        System.out.println(missingValue(arr));
        
    }
    
    static int missingValue(int[] arr){
        int i=0;
        
        
        while(i<arr.length){
          

            int correctindex= arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
       
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index){
                return  index;
            }
        }
        return arr.length;
        

    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
