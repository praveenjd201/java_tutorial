import java.util.Scanner;



public class IsPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value to check prime or not:");
        //int n=in.nextInt();
        //System.out.println(isPrime(n));
        int from =in.nextInt();
        int to=in.nextInt();
        // primeNumber(from, to);

        for(int num=from;num<=to;num++){
            if(isPrime(num)==true){
                System.out.println(num+ ",  ");
            }

        }



    }
    static boolean isPrime(int n){
        if(n<=1) return false;      
            
        int c=2;
        while(c*c <=n){
            if(n%c==0)  return false;           
            c++;
        }
        if(c*c > n)
        {
            System.out.println(n);

        }         
        
        return false;
        
            
        }
    static void primeNumber(int from, int to){
        
        for(int num=from;num<=to;num++){
            int count=0;
            for (int i=2;i<=num/2;i++){
                if(num%i == 0){
                    count++;
                    break;
                }
                
            }
            if(count == 0 && num!=1){
                System.out.println(num+", ");
            }


        }

    }
    }

