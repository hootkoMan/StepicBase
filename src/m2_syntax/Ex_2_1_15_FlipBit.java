package m2_syntax;

public class Ex_2_1_15_FlipBit {
    public static void main(String[] args) {

        System.out.println(flipBit(13, 4));

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(5 ^ 7));

        System.out.println(5 ^ 7);
    }

    private static int flipBit(int value, int bitIndex) {
        return value ^ (int) Math.pow(2, --bitIndex);
    }
}
