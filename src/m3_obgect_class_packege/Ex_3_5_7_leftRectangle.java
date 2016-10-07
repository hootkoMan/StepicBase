package m3_obgect_class_packege;

import java.util.function.DoubleUnaryOperator;

public class Ex_3_5_7_leftRectangle {
    public static void main(String[] args) {

        System.out.println(integrate(x -> 1, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0, h, n = 10000000;
        h = (b - a) * 1 / n;

        for (int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h * i);
        }

        result *= h;
        return result;
    }
}
