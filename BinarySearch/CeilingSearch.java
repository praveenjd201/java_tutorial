

public class CeilingSearch {
    public static void main(String[] args) {
        int [] arr={1,22,45,78,79,81,85,92};
        char [] letters={'c','f','j'};
        char target='q';
        // System.out.println(ceilingSearch(arr, target));
        System.out.println(ceilingCharSearch(letters, target));
       
        
    }
    static char ceilingCharSearch(char [] letters,char target){
        int start=0;
        int end=letters.length-1;
        

        while(start <= end){
           int mid=start + (end - start)/2;
            
            if(target < letters[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
            
                

        }
        return letters[start % letters.length];

       

    }
    static int ceilingSearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start <= end){
            mid=start + (end - start)/2;
            
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }
            else if(target == arr[mid]){
                return arr[mid];
            }
            // else {
            //     return arr[mid+1];
            // }
                

        }
        return arr[start];
        // if((mid+1) >= arr.length){
        //     return -1;
        // }else   return arr[mid+1];
    }
}
