package m4_exception;


public class Ex_4_1_9_sqrt {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(sqrt(9));
        System.out.println(sqrt(-9));
    }
}
