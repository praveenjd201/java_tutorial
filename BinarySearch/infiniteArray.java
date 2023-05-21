// Find the position of an element in a sorted array of infinite
//eg-{1,3,5,9,12,19,23,35} ; target = 9; output =3

public class infiniteArray {
public static void main(String[] args) {
    int []arr={1,3,5,9,12,19,23,35,36,38,40,41,43,45,47,49,50,51,56,59,61,63,64,72,74,76,79,80};
    int target=2;
    System.out.println(target_Position(arr, target));
    
}   
static int target_Position (int [] arr,int target){
    int start=0;
    int end=1;
    while(target > arr[end]){
        int newStart=end+1;
        end=end + (end - start +1)*2;
        start=newStart;
        
    }
    return binarySearch(arr,target,start,end);

}
static int binarySearch(int []arr,int target,int start,int end){
    while(start <= end){
        int mid=start+(end-start)/2;
        if (target < arr[mid]){
            end=mid-1;            
        }else if(target >arr[mid]){
            start=mid+1;
        }else{
            return mid;
        }
    }
    return -1;
}
}
