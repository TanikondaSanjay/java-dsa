package Recursions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_of_Digits {
    public int Digits_sum(int n){
        if(n==0){
            return 0;
        }
        return n+Digits_sum(n-1);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Sum_of_Digits ds = new Sum_of_Digits();
        int res = ds.Digits_sum(n);
        System.out.println(res);
    }
}