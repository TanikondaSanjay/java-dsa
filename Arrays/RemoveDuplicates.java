package Arrays;
import java.io.*;
import java.util.StringTokenizer;
public class RemoveDuplicates {
    public void non_duplicates(int[] nums){
        for(int i=1;i<nums.length;i++){
            boolean duplicate = false;
            for(int j=0;j<i;j++){
                if(nums[j] == nums[i]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(nums[i] +" ");
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.non_duplicates(nums);
    }
}