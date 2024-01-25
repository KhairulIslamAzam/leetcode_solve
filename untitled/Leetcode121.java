import java.util.HashMap;
import java.util.Map;

public class Leetcode121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        //int[] prices = {7,6,4,3,1};
        maxProfit(prices);
    }

//    public static int maxProfit(int[] prices) {
//
//        int result = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int i1 = prices[j] - prices[i];
//                if (i1 > result) {
//                    result = i1;
//                }
//            }
//        }
//        return result;
//    }


    public static int maxProfit(int[] prices) {
       int maxProfit = 0;
       int maxPoint = prices[prices.length -1];

       for(int i = prices.length -2; i >= 0; i--){
           maxProfit = Math.max(maxProfit, maxPoint - prices[i]);
           maxPoint = Math.max(maxPoint,prices[i]);
       }
       return maxProfit;
    }

}
