public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        nums= buildArray(nums);
        System.out.print("[");
        for (int i=0;i<nums.length;i++){

            System.out.print(nums[i]);
            if(i<nums.length-1) System.out.print(",");
        }
        System.out.print("]");
        
    }
    static int[] buildArray(int[] nums) {
        int []arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }

}
