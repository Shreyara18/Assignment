import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSort {
    public static void main(String[] args) {
        String[] strings = {"d34", "g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list, strings);
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        Map<Character, List<String>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            List<String> group = new ArrayList<>();
            for (String s : list) {
                if (s.charAt(0) == c) {
                    group.add(s);
                }
            }
            if (!group.isEmpty()) {
                Collections.sort(group);
                map.put(c, group);
                L1.addAll(group);
            }
        }
        for (List<String> group : map.values()) {
            Collections.sort(group, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return Integer.parseInt(s2.substring(1)) - Integer.parseInt(s1.substring(1));
                }
            });
            L2.addAll(group);
        }
        System.out.println("L1: " + L1);
        System.out.println("L2: " + L2);
    }
}
