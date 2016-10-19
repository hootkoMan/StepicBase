package m6_generics_collections_streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex_6_2_14_symmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));

        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> tSet1 = new HashSet<T>(set1);
        Set<T> tSet2 = new HashSet<T>(set2);
        Set<T> tSet3 = new HashSet<T>(set2);

        tSet2.retainAll(tSet1);

        tSet3.addAll(set1);

        tSet3.removeAll(tSet2);

        return tSet3;
    }
}
