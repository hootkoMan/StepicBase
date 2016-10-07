package m2_syntax;

import java.util.Arrays;

public class Ex_2_4_9_Arrays {
    public static void main(String[] args) {
        int[] ar1 = {0,2};
        int[] ar2 = {1,3};
        int[] ar3 = mergeArrays(ar1, ar2);
        System.out.println(Arrays.toString(ar3));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] ints = new int[a1.length + a2.length];

        System.arraycopy(a1,0,ints,0,a1.length);
        System.arraycopy(a2,0,ints,a1.length,a2.length);

        Arrays.sort(ints);

        return ints;
    }

}
