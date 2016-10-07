package m2_syntax;

//Реализуйте метод, возвращающий результат побитового сложения (операция ИЛИ) двух величин:
//    1) Сто миллиардов по модулю a, арифметически побитово сдвинутое на b позиций вправо.
//    2) Сто, целочисленно поделённое на c.
public class Ex_2_1_BinaryOperation {
    public static void main(String[] args) {
        int a = 843, b = 0, c = 5;

        long l = 100_000_000_000L;

        long sum = ((l % a) >> b) | (100 / c);
        System.out.println(sum);
    }
}
