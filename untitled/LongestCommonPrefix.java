public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"cir","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = prefixMethod(prefix, strs[i]);
        }
        return prefix;
    }

    public static String prefixMethod(String prefix, String arr) {
        String result = "";
        int length = prefix.length() > arr.length() ? arr.length():prefix.length();
        for (int i = 0; i < length; i++) {
            if (prefix.charAt(i) == arr.charAt(i)) {
                result = result + String.valueOf(prefix.charAt(i));
            }else {
                break;
            }
        }
        return result;
    }
}
