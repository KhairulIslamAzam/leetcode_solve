import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode242 {
    public static void main(String[] args) {
        String s = "tar", t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sAng = new char[s.length()];
        char[] tAng = new char[t.length()];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            sAng[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            tAng[i] = t.charAt(i);
        }

        Arrays.sort(sAng);
        Arrays.sort(tAng);

        for (int i = 0; i < sAng.length; i++) {
            if (sAng[i] != tAng[i]) {
                return false;
            }
        }
        return true;
    }
}
