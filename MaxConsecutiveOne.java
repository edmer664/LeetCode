import java.util.Arrays;

/**
 * MaxConsecutiveOne
 */
public class MaxConsecutiveOne {

    public int longestOnes(int[] nums, int k) {
       
        int count = countZero(nums);

        
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 < p2) {
            if (count > k) {
                int mid = (p2 + p1 + 1 )/2;
                int left = countZero(Arrays.copyOfRange(nums, p1, mid ));
                int right = countZero(Arrays.copyOfRange(nums, mid , p2));
                if (right < left) {
                    p1++;
                } else {
                    p2--;
                }
                count = countZero(Arrays.copyOfRange(nums, p1, p2));
            } else {
                return Math.abs(p1 - p2);
            }

        }
        return k;
    }

    private int countZero(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOne()
                .longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}