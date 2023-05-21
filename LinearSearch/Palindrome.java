public class Palindrome {

    public static void main(String[] args) {
       // String str="madfgfam";
       int num=1221;
       if(numPall(num))
        System.out.println("it is pallindrome");
       else 
        System.out.println("not pallindrome");
      
    }
    public static boolean strpall(String str){
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        // System.out.println("rev -  "+rev);
        // System.out.println("str -  "+str);

        return (rev.equals(str));
           

    }
    static boolean numPall(int num){
        int temp=num;
        int rem=0;
        int rev=0;
        while(num>0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
            

        }
        System.out.println("rev -  "+rev);
            System.out.println("temp -  "+temp);
        return temp==rev;
    }
    
}

