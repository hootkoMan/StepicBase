package m2_syntax;

public class Test {
    public static void main(String[] args) {
        print(-3, 2);
        print(-3, -5);
        print(3, 2);
        print(3, -3);
    }

    public static void print(int a, int b) {
        System.out.println(Math.abs(a)+ Math.abs(b));
    }


}
