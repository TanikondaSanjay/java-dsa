package Arrays.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortArrayOfColours {
    public void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j] == index){
                    temp[k] = nums[j];
                    k++;
                }
            }
            index++;
            if(index > 2){
                break;
            }
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
        for(int num:nums){
            System.out.print(num +",");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        SortArrayOfColours s = new SortArrayOfColours();
        s.sortZeroOneTwo(nums);
    }
}