package Arrays;

import java.io.*;
import java.util.*;

class CheckArraySorted {
    public boolean is_Sorted(int nums[]){
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        CheckArraySorted as = new CheckArraySorted();
        boolean res = as.is_Sorted(nums);
        System.out.println(res);    
    }
}