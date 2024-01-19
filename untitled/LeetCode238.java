public class LeetCode238 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
       productExceptSelf(nums);
    }

//    public  static int[] productExceptSelf(int[] nums) {
//
//        int [] result = new int[nums.length];
//        int rs = 1;
//        for (int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums.length; j++){
//                if(i != j){
//                    rs = rs * nums[j];
//                }
//            }
//            result[i] = rs;
//            rs = 1;
//        }
//        return result;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }

}
