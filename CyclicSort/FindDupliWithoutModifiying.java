import java.util.Arrays;

public class FindDupliWithoutModifiying {
    public static void main(String[] args) {
        int [] arr={3,2,1,3};
        System.out.println(findDuplicate(arr));
        System.out.println(Arrays.toString(arr));
        
    }
    static int findDuplicate(int []arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int current_index=arr[i]-1;
                if(arr[i] != arr[current_index]){
                    swap(arr,i,current_index);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }

        }
        return -1;
    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }

}
