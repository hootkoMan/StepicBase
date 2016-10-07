package m4_exception;

public class Ex_4_1_10_stackTrace {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        if (trace.length <= 3) {
            return null;
        }
        return trace[3].getClassName() + "#" + trace[3].getMethodName();
    }
}
