public class TwoSome {
    public static void main(String[] args) {
        int[] numbers = {2,5,5,3};
        int targets = 10;
        int[] result = twoSumM(numbers, targets);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSumM(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}

