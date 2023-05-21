// package GeekforgeeksProblems;

// problem link :- https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&status[]=solved&status[]=attempted&category[]=Arrays&sortBy=submissions

import java.util.ArrayList;

public class Subarraywithgivensum {
    public static void main(String[] args) {
        int [] arr={1,2,3,7,5};
        int n=5;
        int s=12;
        System.out.println(subarraySum(arr, n, s));
        
        
        
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
      ArrayList <Integer> ans=new ArrayList<>();
        ans.add(-1);
        
        int j=0;
        int sum=0;
        if(s==0){
            return ans;
            
        }
        for(int i=0;i<n; i++){
            sum += arr[i];

            while(sum > s){
                sum=sum-arr[j];
                j++;

            }
            if(sum == s){
                ans.removeAll(ans);
                ans.add(j+1);
                ans.add(i+1);
                break;
                
                
            }

        }
        return ans;   
    }
}

