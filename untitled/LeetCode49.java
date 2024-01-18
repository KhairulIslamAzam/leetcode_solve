import java.util.*;

public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ang = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chr = strs[i].toCharArray();
            Arrays.sort(chr);
            String st = String.valueOf(chr);
            if (ang.containsKey(st)) {
                List<String> value = ang.get(st);
                value.add(strs[i]);
                ang.put(st, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                ang.put(st, value);

            }

        }
        return ang.values().stream().toList();
    }
}
