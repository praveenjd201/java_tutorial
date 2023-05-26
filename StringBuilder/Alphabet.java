public class Alphabet{
    public static void main(String[] args) {
        StringBuilder alpha=new StringBuilder();

        // String alphabet="";
        char value=' ';
        
        for(int i=0;i<26;i++){
             value=(char)('a'+i);
             alpha.append(value);    


        }
        System.out.println(alpha);
       
    }


}