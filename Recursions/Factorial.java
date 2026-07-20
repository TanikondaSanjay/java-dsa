package Recursions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public int recursive_Factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*recursive_Factorial(n-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Factorial f = new Factorial();
        int res = f.recursive_Factorial(n);
        System.out.println(res);
    }
}