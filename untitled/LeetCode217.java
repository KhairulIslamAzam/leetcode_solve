import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode217 {
    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 3};
        System.out.println(containsDuplicate(ar));
    }

    public static boolean containsDuplicate(int[] nums) {
//        List<Integer> result = new ArrayList<Integer>(nums.length);
//        for (int i = 0; i < nums.length; i++) {
//            if (i != 0 && result.contains(Integer.valueOf(nums[i]))) {
//                return true;
//            }
//            result.add(Integer.valueOf(nums[i]));
//        }
//        return false;

//        for (int i = 0; i < nums.length; i++) {
//            if (i != 0) {
//                int key = nums[i];
//                for (int j = 0; j < nums.length; j++) {
//                    if (nums[j] == key && i != j) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;


//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == nums[i]) {
//                    return true;
//                }
//            }
//        }
//        return false;

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        if (result.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }

}
