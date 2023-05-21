//array size will be increasing and then decreasing
// eg - {1,2,4,6,8,7,5,3} ;o/p = 4

// q.1 find peak arrry posion of givin mountain array
// q.2 find the  target element in  bitonic array
//  possibilities : 1. first find the peak element index
// 2. if target lessthan peakarray element, binary search in ASC.
// 3. if target greaterthan peakarray element, binary search in DESC.

public class BitonicArray {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,8,7,5,3};
        int target=9;
        System.out.println(targetElement_Position(arr,target));

        
    }

    static int targetElement_Position(int arr[],int target){
        int peakindex=peakindex(arr);
        // System.out.println(peakindex);
        int firstpart=orderagnostic(arr, target, 0, peakindex);
        if(firstpart != -1){
            return firstpart;
        }

        return orderagnostic(arr, target, peakindex, arr.length-1);

    }

    static int peakindex(int [] arr){
        int  start =0;
        int end=arr.length-1;
        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
               end=mid; 
            }else{
                start=mid+1;
            }
        }
        return  start;
    }
    static int orderagnostic(int [] arr,int target,int start,int end){
        boolean isAsc=  arr[start] < arr[end]; 
            
        while(start <= end){
            int mid=start+ (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{
                if(target > arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }


        return -1;
    }
}
