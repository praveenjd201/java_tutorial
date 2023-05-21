import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter the String:");
        String str=in.next();
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("Enter the character to search:");
        char target=in.next().charAt(0);

        int found=searhString(str,target);
        if(found != -1)
            System.out.println("the charcter "+target +" is found on "+found+"th elemnt");
        else
            System.out.println("the given character is not found");

        
            
    }
    static int searhString(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target) return i+1;

        }
        return -1;

    } 
    

        
}
