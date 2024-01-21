import java.util.Arrays;
import java.util.HashSet;

public class LeetCode128 {
    public static void main(String[] args) {
        int[] code = {1, 2, 0, 1};
        longestConsecutive(code);
    }

//    public static int longestConsecutive(int[] nums) {
//
//        if (nums.length == 1) {
//            return 1;
//        }
//        if (nums.length == 0) {
//            return 0;
//        }
//        Arrays.sort(nums);
//        int result = 0;
//        int count = 1;
//        int i = 0;
//        while (i < nums.length - 1) {
//            if (nums[i] + 1 == nums[i + 1]) {
//                count++;
//            } else if (nums[i] == nums[i + 1]) {
//            } else {
//                count = 1;
//            }
//            if (count > result) {
//                result = count;
//            }
//            ++i;
//        }
//        return result;
//    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        // Iterate through the array to find consecutive sequences
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Expand the streak to the right
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the result
                result = Math.max(result, currentStreak);
            }
        }

        return result;
    }
}
