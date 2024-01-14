public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger rev = new ReverseInteger();
        System.out.println(rev.reverse(-4236469));
    }

    public int reverse(int num) {
        int rev_num = 0;

        while (num != 0) {
            int digit = num % 10;
            // Check for potential overflow before performing the reverse operation
            if (rev_num > Integer.MAX_VALUE / 10 || (rev_num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow will occur if the next digit is added
            }
            if (rev_num < Integer.MIN_VALUE / 10 || (rev_num == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow will occur if the next digit is added
            }
            rev_num = rev_num * 10 + digit;
            num /= 10;
        }

        return rev_num;
    }
}
