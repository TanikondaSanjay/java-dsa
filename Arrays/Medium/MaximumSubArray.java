package Arrays.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubArray {
    public int KadaneAlgorithm(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        MaximumSubArray msa = new MaximumSubArray();
        System.out.println(msa.KadaneAlgorithm(nums));
    }
}