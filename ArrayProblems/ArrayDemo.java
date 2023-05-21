import java.util.Arrays;
import java.util.Scanner;

// package ArrayProblems;

public class ArrayDemo {

    

    

    public static void main(String[] args) {
        int [] arr={23,45,12,345,56,78,43,2,10};
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;

        //swap(arr,0,2);
        // maxArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("the reversed array is following  below:");

        reverse(arr);
        System.out.println(Arrays.toString(arr));
        // Scanner in=new Scanner(System.in);
        // String [] str=new String[5];
        // for (int i=0;i<str.length;i++){
        //     str[i]=in.next();

        // }
        // System.out.println(Arrays.toString(str));



        // int num[]=new int[] {10,20,30,78,35,9,36,98,12,9,1};

        // int max=num[0];
        // for(int index=1;index<num.length;index++){
        //     if (num[index]> max)
        //         max=num[index];
            
        // }
        // System.out.println("maximum value in array  is "+ max);




// insert array number using for loop
        // for(int i=0;i<num.length;i++){
        //     num[i]=i;
            
        // } 
        // for (int arr:num){
        //     System.out.println(arr);
        // }

        // ArrayDemo obj=new ArrayDemo();

        // System.out.println(num.length);
        // for (int i=0;i<num.length;i++){
        //     obj.insert(num,i);           
        // }
        // for (int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }

// insert array string using for scanner class...     
    }

    public static void swap(int[] arr,int a,int b){
        int temp=0;
       
        
        // System.out.println(Arrays.toString(arr));

        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        // System.out.println(Arrays.toString(arr));
        
    }

    public static void maxArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxValue < arr[i] ){
                maxValue=arr[i];
            }
            System.out.print(maxValue +" ,");
        }

        System.out.println("the maximum value is" + maxValue);

    }

    public  static void  reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start+=1;
            end-=1;

        }
     

    }
    public static void sortAsc(int[] arr){
        for(int i=0;i<arr.length;i++){
            swap(arr,)
        }

            
    }
}
