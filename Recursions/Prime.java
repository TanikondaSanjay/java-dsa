package Recursions;

import java.io.*;

public class Prime {
    public static boolean is_prime(int n,int i){
        if(n<=1){
            return false;
        }
        if(i > (int)Math.sqrt(n)){
            return true;
        }
        if(n%i == 0){
            return false;
        }
        return is_prime(n,i+1);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 2;
        System.out.println(is_prime(n,i));
    }
}