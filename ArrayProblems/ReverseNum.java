import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int rev=0;
        int num=in.nextInt();

        while(num>0){
            int rem=num%10;
            rev=rev*10 + rem;
            num/=10;
        }
        System.out.println(rev);

    }
}
