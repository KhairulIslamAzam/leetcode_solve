import java.util.*;
import java.util.stream.Collectors;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        threeSum(nums);
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> triplets = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        int[] e = {nums[i], nums[j], nums[k]};
//                        Arrays.sort(e);
//                        triplets.add(Arrays.stream(e).boxed().toList());
//                    }
//                }
//            }
//        }
//        return triplets.stream().toList();
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = a + nums[left] + nums[right];
                if (sum > 0) {
                    right -= 1;
                } else if (sum < 0) {
                    left += 1;
                } else {
                    triplets.add(Arrays.asList(a, nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }
        return triplets;
    }
}
