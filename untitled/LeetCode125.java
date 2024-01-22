import java.util.Arrays;

public class LeetCode125 {
    public static void main(String[] args) {
        String text = "0P";
        System.out.println(isPalindrome(text));
    }

//    public static boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        char[] textBuffer = new char[s.length()];
//        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
//            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
//                textBuffer[j] = s.charAt(i);
//            }
//        }
//
//        String sb = new String(textBuffer);
//        if (s.equalsIgnoreCase(sb)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
