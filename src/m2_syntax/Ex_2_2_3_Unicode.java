package m2_syntax;

public class Ex_2_2_3_Unicode {
    public static void main(String[] args) {

        System.out.println(charExpression(8));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
