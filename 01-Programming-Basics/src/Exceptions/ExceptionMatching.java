package Exceptions;

class ExceptionTest {
    void display() {
    }
}

public class ExceptionMatching {

    public static void main(String[] args) {

        exception1();
        exception2();
        exception3();
        exception4();
    }

    static void exception1() {
        try {
            int c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception 1 : " + e.toString());
        }
    }

    static void exception2() {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Exception 2 : " + e.toString());
        }
    }

    static void exception3() {
        try {
            ExceptionTest exceptionTest = null;
            exceptionTest.display();
        } catch (NullPointerException e) {
            System.out.println("Exception 3 : " + e.toString());
        }
    }

    static void exception4() {
        try {
            int[] arr = new int[5];
            arr[7] = 34;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 4 : " + e.toString());
        }
    }
}
