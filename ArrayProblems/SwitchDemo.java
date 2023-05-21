import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        
        // switch (fruit){
        // case "Apple":
        //     System.out.println("sweet red apple");
        //     break;
        // case "Grapes":
        //     System.out.println("small fruits");
        //     break;
        // default:
        //     System.out.println("please enter valid fruit");

        // }

        switch (fruit){
        case "Apple" -> System.out.println("sweet red apple");
        case "Grapes" ->System.out.println("small fruits");
        default ->System.out.println("please enter valid fruit");

        }
        

        
      
    }
}
