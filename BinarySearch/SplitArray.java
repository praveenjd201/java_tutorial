public class SplitArray {
    public static void main(String[] args) {
        int [] arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(arr, m));
        
    }
    static int splitArray(int []arr,int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length-1;i++){
            start=Math.max(start, arr[i]); // end of the loop it contains maximum  value  of  array.
            end+=arr[i];
        }
        while(start < end){ // because the the start and end returns the  same value and also it returns the  ans 
            int mid= start + (end-start)/2;
// calculate how many pieces you can divided this in with thi max sum;
            int sum=0;
            int pieces=1;
            for(int num :arr){
                if(sum+num > mid){
// you cannot add this  in the subarray, make new one
// say you add this in new subarray, then sum = num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces > m){ // m is  given in question 
                start=mid+1;
            }else{
                end=mid;  
            }
        }    
        return end; // here  start == end;
    }
}
