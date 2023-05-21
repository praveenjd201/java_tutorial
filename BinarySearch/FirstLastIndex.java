import java.util.Arrays;

// Find the First and last position of target element in sorted array.

public class FirstLastIndex {
    public static void main(String[] args) {
        int [] arr={2,5,6,6,6,8,34};
        int target=6;
        int [] indexes=firstlastIndex(arr,target);
        // System.out.println(Arrays.toString(indexes));
        for(int ans:indexes ){
            System.out.print(ans+" ");
           
        }
    
        
    }

    static int [] firstlastIndex(int [] arr,int target){
        int [] ans= {-1,-1};
        ans[0]=searchtarget(arr, target, true);
        if(ans[0] != -1){
            ans[1]=searchtarget(arr, target, false);
        }
        return ans;
    }

    static int searchtarget(int [] arr,int target,Boolean ifStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target < arr[mid]){ 
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(ifStartIndex == true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;

    }
}
