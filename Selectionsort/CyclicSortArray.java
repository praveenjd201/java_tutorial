import java.util.Arrays;

public class CyclicSortArray {
    public static void main(String[] args) {
        int []arr={3,2,4,5,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int  []arr){
        int i=0;
        
        while(i<arr.length){
            int correctindex= arr[i]-1;
            if(arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }

        }
        

    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
