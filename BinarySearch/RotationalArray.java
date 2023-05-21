public class RotationalArray {
    public static void main(String[] args) {
        
        int [] arr={2,9,1,2,2,2,2};
        int target = 2;
        System.out.println(searchTarget(arr, target));

    }
    static int searchTarget(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int pivot=findPivotDuppicate(arr,start, end);
        System.out.println(pivot);
        
        if(target == arr[pivot]){
            return pivot;
        }
        if(pivot == -1){
            return binarySearch(arr,target,start,end);
        }
        if(target < arr[start]){
            start=pivot+1;
            return binarySearch(arr,target,start,end);
        }else{
            end=pivot-1;
            return binarySearch(arr,target,start,end);
        }        
    }
    static int findPivot(int []arr,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if(mid > start && arr[mid] <arr[mid-1] ){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }               
        return -1;
    }

    static int findPivotDuppicate(int []arr,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if(mid > start && arr[mid] <arr[mid-1] ){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end-1] ){
                    return end-1;
                }
                end--;
            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start=mid+1; // we are in first part
                
            }else{
                end=mid-1; // we are in second part
            }
            
        }               
        return -1;
    }
    
    static int binarySearch(int []arr,int target,int start,int end){
        
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]){
                end=mid-1;

            }else if(target > arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
