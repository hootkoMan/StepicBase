package m3_obgect_class_packege.timer;

public class Timer {

    public long measureTime(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - startTime;
    }
}
