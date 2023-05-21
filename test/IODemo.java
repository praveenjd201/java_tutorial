import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IODemo {
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num=0;
       
        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)))
        { 
            num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        
       

       


    }
}
