import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr= {18,12,-7,3,14,28};
        System.out.println(Arrays.toString(arr));
        Scanner in=new Scanner(System.in);
        int target  = in.nextInt();
        int start=1;
        int  end= 4;
        boolean search=searchIn(arr, target, start, end);
        System.out.println(search);
                
    }
    static boolean searchIn(int[]arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i] == target) return true;
            
        }
        return false;
    }
   
}
