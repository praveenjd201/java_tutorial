import java.util.Arrays;

public class MissingSmallestPositive {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        int missingno=missingPositive(arr);
        System.out.println(missingno);
        
    }
    static int missingPositive(int [] arr){
        int i=0;
        while(i<arr.length){
            int current_index=arr[i]-1;
            if(arr[i] >0 && arr[i] < arr.length && arr[i] != arr[current_index]){
                swap(arr,i,current_index);
            }else{
                i++;
            }
           
        }
        System.out.println(Arrays.toString(arr));
        int index=0;
        
        for(index=0;index < arr.length;index++){
            if(arr[index] != index+1 && arr[index]>index+1){
                return index+1;
            }

        }


       
        return index;
    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
