package Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // hashset doesn't preserve order ex:20,10
        set.add(200);
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set);
        // we have pass the object directly not the index
        set.remove(200);
        // set.clear();
        System.out.println(set.hashCode());
        System.out.println(set);

    }
}
