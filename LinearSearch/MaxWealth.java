public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts={
            {1,2,3},
            {2,2,2,2,2},
            {3,2,1}
            
        };
        System.out.println(maxWealth(accounts)); 


    }
    public static int maxWealth(int [] [] accounts){
        int maxamount=Integer.MAX_VALUE;
        for(int person=0;person<accounts.length;person++){
            int totalamount=0;
            for(int account=0; account<accounts[person].length;account++){
                // System.out.println(person+":"+account);
                totalamount +=accounts[person][account];
                // System.out.println("check total amount:"+totalamount);
            }
            if(totalamount<maxamount){
                maxamount=totalamount;
                // System.out.println("check"+maxamount);
            }
        }
        return maxamount;

    }
}
