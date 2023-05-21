// package Selectionsort;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class SelectionSortArray {
    public static void main(String[] args) {
        int [] arr={0,-9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++)
        {
            int start=0;
            int length=arr.length-i-1;
            int  maxvalueofIndex= maxIndexValue(arr,start,length);
            swap(arr,maxvalueofIndex,length);
        }
    }
    static void swap(int []arr,int maxvalueofIndex,int length){
        if(arr[maxvalueofIndex] > arr[length]){
            int temp=arr[length];
            arr[length]=arr[maxvalueofIndex];
            arr[maxvalueofIndex]=temp;
        }

    }
    private static int maxIndexValue(int[] arr, int start, int length) {
        int max=start;
        for(int i=start;i<=length;i++){
            if(arr[max] < arr[i]){
                max= i;
            }
            

        }
        return max;
    }
}
