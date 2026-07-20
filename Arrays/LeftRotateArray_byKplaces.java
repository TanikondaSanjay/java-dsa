package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotateArray_byKplaces {
    public void rotate_byK(int[] nums, int k){
        int n = nums.length;
        int temp[] = new int[n];
        for(int i=0;i<nums.length;i++){
            temp[i] = nums[(i+k)%n];
        }
        for(int num:temp){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        LeftRotateArray_byKplaces rk = new LeftRotateArray_byKplaces();
        rk.rotate_byK(nums, k);
    }
}