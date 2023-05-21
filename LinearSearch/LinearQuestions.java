public class LinearQuestions {
    public static void main(String[] args) {
        // Given an array nums of integers, return
        //  how many of them contain an even number of digits
        // input nums:{12,345,2,6,7896}
        // output: 2

        int [] nums= {0};
        System.out.println(findNumber(nums)); 
        System.out.println(checkDigit(-22));

        
        
         

    }
    static int findNumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)) count++;            
        }

        return count;
    }

    static boolean even(int num){
        return checkDigit(num) % 2 ==0;
    }
    
    static int checkDigit(int num){
        int count = 0;
        if(num<0) num=num * -1;
        else if (num ==0) return 1;
        while(num>0){
            count++;
            num=num/10;            
        }
        return count;

        

    }
    static int evenDigits(int [] nums){
        int evencount=0;
        
        for(int arr:nums){
            int count=0;
            
            // System.out.println(arr);
            while(arr>0){
                arr=arr/10;
                count++;
                
            }
            
            if (count%2==0){
                evencount++;
                // System.out.println("ecount"+evencount);
            }
            
        }

        return evencount;
    }
}
