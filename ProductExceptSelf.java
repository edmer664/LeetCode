import java.util.HashMap;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer, Integer> memoizedVal = new HashMap<Integer, Integer>();
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (memoizedVal.get(nums[i]) != null) {
                answer[i] = memoizedVal.get(nums[i]);
                continue;
            }

            boolean isSet = false;
            int ans = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isSet) {
                    ans *= nums[j];
                } else {
                    ans = nums[j];
                    isSet = true;
                }
            }
            answer[i] = ans;
            memoizedVal.put(nums[i], ans);
        }
        return answer;
    }

    public static void main(String[] args) {
        ProductExceptSelf app = new ProductExceptSelf();
        int[] val = app.productExceptSelf(new int[] { 5, 9, 2, -9, -9, -7, -8, 7, -9, 10 });
        for (int i : val) {
            System.out.print( i + ", ");
        }
    }

}
