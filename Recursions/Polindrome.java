package Recursions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polindrome {
    static int rev = 0;
    public static int isPalindrome(int n){
        if(n==0){
            return rev;
        }
        rev = rev*10+n%10;
        return isPalindrome(n/10);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Polindrome p = new Polindrome();
        int num = isPalindrome(n);
        if(num == n){
            System.out.println("The given number is Palindrome");
        }
        else{
            System.out.println("The given number is not Palindrome");
        }
    }
}