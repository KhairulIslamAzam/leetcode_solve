import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] num = {4,1,2,1,2};
        calculateSingleNumber(num);
    }

    public static void calculateSingleNumber(int[] numbers) {
//        List<Integer> singleNumber = new ArrayList<Integer>(numbers.length);
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//                singleNumber.add(numbers[i]);
//            } else {
//                if (singleNumber.contains(numbers[i])) {
//                    singleNumber.remove(singleNumber.indexOf(numbers[i]));
//                } else {
//                    singleNumber.add(numbers[i]);
//                }
//            }
//        }
//
//        if (singleNumber.size() == 0) {
//            System.out.println(0);
//        } else {
//            System.out.println(singleNumber.get(0));
//        }

            int singleNumber = 0;

            for (int i = 0; i < numbers.length; i++) {
                singleNumber ^= numbers[i];
            }

        System.out.println(singleNumber);

    }


}
