package Arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Left_Rotate_Array_byOne {
    public void rotateArray(int[] nums){
        int first = nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = first;
        for(int num:nums){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Left_Rotate_Array_byOne lr = new Left_Rotate_Array_byOne();
        lr.rotateArray(nums);
    }
}