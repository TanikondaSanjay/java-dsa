package Recursions;

import java.io.*;

public class Armstrong {
    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+countDigits(n/10);
    }
    public static int isArmstrong(int n, int count){
        if(n == 0){
            return 0;
        }
        int digit = n%10;
        return (int)Math.pow(digit,count) + isArmstrong(n/10,count);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = countDigits(n);
        if(n==0){
            count = 1;
        }
        int sum = isArmstrong(n,count);
        if(sum == n){
            System.out.println("The given number is an Armstrong number");
        }
        else{
            System.out.println("The given number is not an Armstrong Number");
        }
    }
}