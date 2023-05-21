class PravException extends Exception{
    public PravException(String str){
        super(str);
    }

}

public class ExceptionDemo {
    public static void main(String[] args) {
        int i=12;
        int j=0;

        try{
            j=10/i;
            if (i>10)
            throw new PravException("I value should not be gereater then 10");
        }
        catch(ArithmeticException e){
            System.out.println("the i value should not be zero");

        }
        catch(PravException e){
            System.out.println(e);
        }

        
        

        System.out.println(j);

        System.out.println("hey iam executed");




        
    }
}
