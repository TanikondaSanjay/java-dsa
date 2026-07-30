package Arrays.Medium;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxRepeatedNumber {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int value = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                    value = nums[j];
                }
            }
            if(count > n/2){
                return value;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        MaxRepeatedNumber max = new MaxRepeatedNumber();
        System.out.println(max.majorityElement(nums));
    }
}