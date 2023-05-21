import java.util.ArrayList;
import java.util.Vector;

public class SubArraySum {
    public static void main(String[] args) {
        int [] arr={1,2,3,7,5};
        
        int n=5;
        int s=3;
        System.out.println(subArraySum(arr, n, s));
        
    }
    static ArrayList<Integer> subArraySum(int[] arr, int n,int  s){
        ArrayList <Integer> ans=new ArrayList<>();
      
        int j=0;
        int sum=0;
        for(int i=0;i<n; i++){
            sum += arr[i];

            while(sum > s && j < i){
                sum=sum-arr[j];
                j++;

            }
            if(sum == s){
                ans.removeAll(ans);
                ans.add(j+1);
                ans.add(i+1);
                
            }
            break;

        }
        ans.add(-1);
        
        return ans;
    }
}
