package Arrays.Medium;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int j = 1;
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            j++;
        }
        return new int[]{};
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        int target = Integer.parseInt(br.readLine());
        TwoSum ts = new TwoSum();
        int[] result = ts.twosum(nums, target);
        for(int num:result){
            System.out.print(num +" ");
        }
    }
}