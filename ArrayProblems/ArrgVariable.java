import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrgVariable {
    public static void main(String[] args) {
        arrVar(27,1996,"praveen JD");
        

    }
    static void arrVar(int i,int j,String ...v){
        System.out.println(i+", "+j+", "+Arrays.toString(v));

    }
}
