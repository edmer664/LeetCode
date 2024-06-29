/**
 * MoveZeroes
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for(int i = nums.length; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(j>= nums.length -1){
                    continue;
                }
                if(nums[j] == 0){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
        
        
    }

    public static void main(String[] args) {
        MoveZeroes c = new MoveZeroes();
       int[] nig = new int[]{0,1,0,3,12};
       c.moveZeroes(nig);
       for (int i : nig) {
        System.out.print(i+", ");
       }

    }
}