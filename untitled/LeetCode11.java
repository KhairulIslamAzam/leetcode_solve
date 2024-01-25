public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //int[] height = {1,2,4,3};
        maxArea(height);
    }

//    public static int maxArea(int[] height) {
//        int result = 0;
//        for (int i = 0 ;i < height.length; i++) {
//            int a = height[i];
//            int x = 0, y = 0;
//            for (int j = i + 1; j < height.length; j++) {
//                if (a < height[j]) {
//                    x = a;
//                    y = j;
//                } else if (a > height[j]) {
//                    x = height[j];
//                    y = j - i;
//                }
//
//                int mult = x * y;
//                if (mult > result) {
//                    result = mult;
//                }
//            }
//        }
//        return result;
//    }

    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        int x = 0, y = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                x = height[left];
                y = right -left;
                left++;
            } else if (height[left] >= height[right]) {
                x = height[right];
                y = right - left;
                right--;
            }

            int mult = x * y;
            if (mult > result) {
                result = mult;
            }
        }
        return result;
    }


//    public int maxArea(int[] height) {
//        int result = 0;
//        int left = 0;
//        int right = height.length - 1;
//
//        while (left < right) {
//            int x = Math.min(height[left], height[right]);
//            int y = right - left;
//
//            int area = x * y;
//            result = Math.max(result, area);
//
//            // Move pointers based on the shorter line
//            if (height[left] < height[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        return result;
//    }
}
