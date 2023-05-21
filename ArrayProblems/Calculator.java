import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        float result=0;

        while(true){
            System.out.println("Enter the operator");
            char ch=in.next().trim().charAt(0);
            
            if(ch == '+' || ch == '-' || ch=='*'||ch == '/' || ch =='%'){
                System.out.println("Enter the numbers");
                int num1= in.nextInt();
                int num2= in.nextInt();
                System.out.println();

                if(ch == '+'){
                    result = num1+num2;
                }
                if(ch == '-'){
                    result = num1-num2;
                }
                    
                if(ch == '*'){
                    result = num1*num2;
                }
                if(ch == '/'){
                    if(num2 > 0){
                        result = num1/num2;
                    }else
                    System.out.println("the num is cannot divideded by Zero");
                }
                if(ch == '%'){  
                    if(num2 > 0){
                        result = num1%num2;
                    }else
                    System.out.println("the num is cannot divideded by Zero");
                }
            }else if(ch == 'x' || ch == 'X'){
                    result=0;
                    break;
                }
            else{
                    System.out.println("invalid operator !!");
                    result=0;
                }
                System.out.println(result);

                   
            
        }

        
    }
}
