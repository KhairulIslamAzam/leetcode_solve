import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz s = new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> fizzBuzzList = s.fizzBuzz(n);
        for (String fizzBuzz : fizzBuzzList) {
            System.out.println(fizzBuzz);
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        for (int j = 1; j <= n; j++) {
            if (j % 15 == 0) {
                result.add("FizzBuzz");
            } else if (j % 3 == 0) {
                result.add("Fizz");
            } else if (j % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(j));
            }
        }
        return result;
    }
}
