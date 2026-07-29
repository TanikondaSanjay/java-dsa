package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class UnionOfTwoSortedArrays {
    public int[] UnionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] union = new int[n1 + n2];
        int k = 0;
        for (int i=0;i<n1;i++) {
            union[k++] = nums1[i];
        }
        for(int i=0;i<n2;i++){
            boolean found = false;
            for(int j=0;j<n1;j++){
                if(nums2[i] == nums1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                union[k++] = nums2[i];
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = union[i];
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int[] nums1 = new int[n1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            nums1[i] = Integer.parseInt(st.nextToken());
        }
        int n2 = Integer.parseInt(br.readLine());
        int[] nums2 = new int[n2];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < n2; i++) {
            nums2[i] = Integer.parseInt(st.nextToken());
        }
        UnionOfTwoSortedArrays obj = new UnionOfTwoSortedArrays();
        int[] ans = obj.UnionArray(nums1, nums2);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}