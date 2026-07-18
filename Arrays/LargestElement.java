package Arrays;
import java.io.*;
public class LargestElement {
    public int largest(int[] nums){
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        LargestElement le = new LargestElement();
        int res = le.largest(nums);
        System.out.println(res);
    }
}
