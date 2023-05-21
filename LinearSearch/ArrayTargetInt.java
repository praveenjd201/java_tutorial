// package LinearSearch;

// import java.io.LineNumberReader;

public class ArrayTargetInt{
    public static void main(String[] args) {

        // int num=new
        int target=34;
        int[] num ={12,34,34,53,2,54};
        int ans=linearSearch2(num, target);
        System.out.println(ans);

    }

    //retun the index value.
    static int linearSearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]== target)
                return index;                
        }
        return -1;
    }
    // retrun the element
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int element: arr){
            if (element == target)
               
                return element;                
        }
        return Integer.MAX_VALUE;
    } 

}