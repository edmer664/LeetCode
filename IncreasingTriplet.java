import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * IncreasingTriplet
 */
public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 1; i < nums.length - 1; i++) {

            if (hasLesser(Arrays.copyOfRange(nums, 0, i), nums[i])
                    &&
                    hasGreater(Arrays.copyOfRange(nums, i + 1, nums.length), nums[i])) {
                return true;
            }
        }
        
        return false;
    }

    private boolean hasGreater(int[] nums, int num) {
        return Collections.max(Arrays.stream(nums).boxed().collect(Collectors.toList())) > num;
    }

    private boolean hasLesser(int[] nums, int num) {
        return Collections.min(Arrays.stream(nums).boxed().collect(Collectors.toList())) < num;
    }


    public static void main(String[] args) {
        IncreasingTriplet app = new IncreasingTriplet();
        System.out.println(app.increasingTriplet(new int[]{1,2,3,4,5}));
    }
}