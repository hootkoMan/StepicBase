package m3_obgect_class_packege.timer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(() -> new BigDecimal("12345567").pow(100000));
        long time2 = timer.measureTime(() -> getPow()); //вызов метода
        long time3 = timer.measureTime(Main::getPow); //ссылка на метод
        System.out.println(time);
    }

    private static BigDecimal getPow() {
        return new BigDecimal("12345567").pow(100000);
    }
}
