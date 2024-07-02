import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumOfOcc {
 
    public static void main(String[] args) {
        UniqueNumOfOcc u = new UniqueNumOfOcc();
        System.out.println(u.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ArrayList<Integer> values = new ArrayList<>();
        map.forEach((k,v) -> {
            values.add(v);
        });
        Set<Integer> occ = new HashSet<>(values);

        if(occ.size() == values.size()){
            return true;
        }
        return false;


    }
}
