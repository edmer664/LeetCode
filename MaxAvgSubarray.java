import java.util.Arrays;

/**
 * MaxAvgSubarray
 */
public class MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return -1;
        }

        double maxSum = Arrays.stream(Arrays.copyOfRange(nums, 0, k)).sum() ;
        double windowSum = maxSum;

        for (int i = 0; i < nums.length - k; i++) {
            windowSum =  windowSum - nums[i] + nums[i + k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum/(double) k;
    }

    public static void main(String[] args) {
        MaxAvgSubarray a = new MaxAvgSubarray();
        System.out.println(a.findMaxAverage(new int[]{0,1,1,3,3}, 4));
    }

}