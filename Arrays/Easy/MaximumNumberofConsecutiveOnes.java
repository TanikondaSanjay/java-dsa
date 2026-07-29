package Arrays.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumNumberofConsecutiveOnes {
    public int MaxConsecutiveOnes(int[] nums){
        int max_count = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            if(max_count < count ){
                max_count = count;
            }
        }
        return max_count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        MaximumNumberofConsecutiveOnes max = new MaximumNumberofConsecutiveOnes();
        System.out.println(max.MaxConsecutiveOnes(nums));
    }
}