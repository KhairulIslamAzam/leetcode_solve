public class Palindrome {
    public static void main(String[] args) {
        Palindrome rev = new Palindrome();
        System.out.println(rev.isPalindrome(122));
    }

    public boolean isPalindrome(int x) {
//        int rev_num = 0;
//        int temp = num;
//
//        if (num <= -1 || (num % 10 == 0 && num > 9)) {
//            return false;
//        }
//
//        while (num != 0) {
//            int digit = num % 10;
//            rev_num = rev_num * 10 + digit;
//            num /= 10;
//        }
//
//        if (temp == rev_num) {
//            return true;
//        } else if (rev_num == 0) {
//            return true;
//        }
//        return false;
//    }

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }
}

