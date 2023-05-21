import java.util.Arrays;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class Searhin2D {
    public static void main(String[] args) {
        int[][] arr  ={
            {1,2,3,11},
            {4,5,6},
            {7,8,9}
        };
        for(int row=0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));            
        }
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to search in available 2D array");
        
        int target=in.nextInt();
        int [] found = searchIn(arr, target);
        
        // System.out.println(Arrays.toString(found));
        for(int i=0;i<found.length;i++){
            if(found[i] != -1){
                System.out.println("you entered number is "+ target +". And it is foun on "+Arrays.toString(found)+" th index");
                break;
            }
            else {
                System.out.println("you entered number is not found in our 2D array");
                break;
            } 
           
        }
        
        
            
               
    }
    static int [] searchIn(int [][] arr,int target){
        for(int row=0; row<arr.length;row++){
            for(int col=row; col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
