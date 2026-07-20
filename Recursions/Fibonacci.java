package Recursions;

import java.io.*;

public class Fibonacci {
    public int fibonacci_Series(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci_Series(n-1)+fibonacci_Series(n-2);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Fibonacci f = new Fibonacci();
        for(int i=0;i<n;i++){
            System.out.print(f.fibonacci_Series(i) +" ");
        }
    }
}