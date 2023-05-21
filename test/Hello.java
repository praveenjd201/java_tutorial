class Hello{
    public static void main (String []args){
        int a= 1;
        Boolean result=true;
        

        int i=2;
        while(i<=a/2){
            if(a % i == 0){
                result = false; 
                break;
            }              
                               
            i++;
        }
        if (result)
            System.out.println("it is prime number");
        else
            System.out.println("it is not prime number");                
        
    
    }

}


