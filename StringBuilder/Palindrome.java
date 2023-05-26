import java.rmi.ConnectIOException;

public class Palindrome {
    public static void main(String[] args) {
        String name = "";
        Boolean condition=forPalli(name);

        check(condition);


      
    }
    static Boolean whilepali(String name){
        if(name == null || name.length() == 0) return true;

        int start=0;
        int end=name.length()-1;
        

        while(start <= end){
            if(name.charAt(start)!=name.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }

        }
        return true;
    }
    static Boolean forPalli(String name){
        for(int i=0;i<name.length()/2;i++){
            char start=name.charAt(i);
            char end=name.charAt(name.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    static void check(Boolean condition){
        if(condition){
            System.out.println("it is palindromee");
        }else{
            System.out.println("it not palindore");
        }

    }
}
