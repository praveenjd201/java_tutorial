import java.util.Scanner;

import javax.swing.SortOrder;

public class Fibo{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=0;
        int b=1;
        int count = 2;
        // int c=2;
        // 0,1,2,3,5,8,13,.....
       while(count <=num){
        int temp=b;
        b=b+a;
        a=temp;
        count++;
        System.out.println(b);

       }
       System.out.println(b);

              
        
            
        }



    }
