package collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','A','B','Z','F');
        //unique - Set
        //Tree
        //Hash
        //LinkedHash

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("TreeSet" + treeSet);

        Set<Character> linkedHash = new LinkedHashSet<>(characters);
        System.out.println("LinkedSet" + linkedHash);

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("HashSet" + hashSet);
    }
}
