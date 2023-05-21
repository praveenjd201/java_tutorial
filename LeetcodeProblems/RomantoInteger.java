// package LeetcodeProbems;

// problem link :- https://leetcode.com/problems/roman-to-integer/

import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println("Enter the roman letters : ");
        Scanner in=new Scanner(System.in);
        String roman=in.next();
        System.out.println(romanToInt(roman));
        
        
    }
    static int romanToInt(String s) {
        int total_value=0;
        for(int i=0;i < s.length();i++){
            // System.out.println(s.charAt(i));
            if(i != s.length() -1 && getSymbol(s.charAt(i)) < getSymbol(s.charAt(i+1))){
                 total_value +=getSymbol(s.charAt(i+1)) - getSymbol(s.charAt(i));
                 i++;
            }else{
                total_value +=getSymbol(s.charAt(i));
            }
           
            // System.out.println(total_value);

        }
        return total_value;
    }
    static int getSymbol(char symbol){
        switch (symbol){
            case 'I':
                return 1;
                
            case 'V':
                return 5;
               
            case 'X':
                return 10;
               
            case 'L':
                return 50;
                
            case 'C':
                return 100;
                
            case 'D':
                return 500;
                
            case 'M':
                return 1000;
                
            default:
                return -1;
        }
    }
    
}
