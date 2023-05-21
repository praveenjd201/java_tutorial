import java.util.Arrays;

public class MissingValueArray {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4};
        System.out.println(sort(arr));

    }   
    
    static int sort(int  []arr){
        int i=0;
        
        while(i<arr.length){
            int correctindex= arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));

        for(int j=0;j<arr.length;j++){
            if( arr[j] != j){
                return j;
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
