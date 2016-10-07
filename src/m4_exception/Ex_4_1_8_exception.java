package m4_exception;

public class Ex_4_1_8_exception {
    public static void main(String[] args) {

        Abc b = new B();
        A a = (A) b;
    }
}

class Abc {}

class A extends Abc {}

class B extends Abc {}