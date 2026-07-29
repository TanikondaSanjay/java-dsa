package Arrays.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubArray {
    public int longestSubArray(int[] nums, int k){
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    int count = j-i+1;
                    if(max < count){
                        max = count;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        int k = Integer.parseInt(br.readLine());
        LongestSubArray ls = new LongestSubArray();
        System.out.println(ls.longestSubArray(nums, k));
    }
}