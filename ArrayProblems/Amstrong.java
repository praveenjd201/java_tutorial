
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int from=in.nextInt();
        int to=in.nextInt();
        for(int n=from;n<=to;n++){
            if(isAmstrong(n)==true){
                System.out.println(n);

            }
        }
       

    }
    static boolean isAmstrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            
           
            int rem=n%10;
            rem=rem*rem*rem;
            n=n/10;
            sum+=rem;
        }
        // System.out.println("n"+temp);
        // System.out.println("sum"+sum);
        if (temp==sum) return true;
        return false;
    }
    
}
