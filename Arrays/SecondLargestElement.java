package Arrays;
import java.io.*;
import java.util.StringTokenizer;
public class SecondLargestElement{
    public int secondMaxElement(int[] nums){
        int max = nums[1];
        int second_max = nums[0];
        int n = nums.length;
        for(int i=2;i<n;i++){
            if(nums[i] > max){
                second_max = max;
                max = nums[i];
            }
            else if(nums[i] < max && nums[i] > second_max){
                second_max = nums[i];
            }
        }
        return second_max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        SecondLargestElement se = new SecondLargestElement();
        int res = se.secondMaxElement(nums);
        System.out.println(res);
    }
}