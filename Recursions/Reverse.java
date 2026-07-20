package Recursions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Reverse {
    public int reverse_Number(int n,int temp){
        if(n==0){
            return temp;
        }
        temp = temp*10+n%10;
        return reverse_Number(n/=10,temp);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = 0;
        Reverse r = new Reverse();
        int res = r.reverse_Number(n,temp);
        System.out.println(res);
    }
}