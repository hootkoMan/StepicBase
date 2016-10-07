package m2_syntax;

public class Ex_2_2_9_PowerrOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));//F
        System.out.println(isPowerOfTwo(1));//T
        System.out.println(isPowerOfTwo(-2));//T
        System.out.println("A" + ('\t' +'\u0003'));
    }

    private static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
