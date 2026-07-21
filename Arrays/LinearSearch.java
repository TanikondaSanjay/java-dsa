package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinearSearch {
    public int linearSearch(int[] nums, int target){
        int key = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                key = i;
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.linearSearch(nums, target));
    }
}
