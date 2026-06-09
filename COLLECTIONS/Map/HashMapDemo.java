package Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "arun");
        h.put(2, "yashwanth");
        h.put(3, "sai");
        h.put(4, "supriya");
        for (int i = 1; i < 5; i++) {
            // hascode -->index bucket --> equals()
            System.out.println(h.get(i));
        }
        System.out.println(h.isEmpty());
        System.out.println(h.remove(2));
        System.out.println(h.size());
        System.out.println(h.containsKey(2));
        HashMap<String, Integer> map = new HashMap<>();
        // here the value will be updated to 100
        map.put("Java", 90);
        map.put("Java", 100);

        System.out.println(map.get("Java"));

    }
}
