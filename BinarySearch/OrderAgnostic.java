public class OrderAgnostic {
    public static void main(String[] args) {
         int [] arr={12,15,16,25,26,27,30,39,40,55};
        // int [] arr={80,72,52,51,45,43,41,20,12,9};
        int target= 26;
        System.out.println(orderAnnostic(arr, target));

    }
    static int orderAnnostic(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc= (arr[start] < arr[end]);
        
        while(start <= end){
            int mid=start+ (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }else if(target >arr[mid]){
                end=mid-1;
            }else start=mid+1;
        }
        return -1;

    }
    
}
