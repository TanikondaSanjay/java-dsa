package Arrays.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingElement {
    public int missingNumber(int[] nums, int n){
        int sum = 0;
        int arr_sum = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return arr_sum - sum;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int value = Integer.parseInt(st.nextToken());
            if(value > n){
                System.out.println("Number should be less than or equal to n:" +n);
                return;
            }
            nums[i] = value;
        }
        MissingElement me = new MissingElement();
        System.out.println(me.missingNumber(nums, n));
    }
}