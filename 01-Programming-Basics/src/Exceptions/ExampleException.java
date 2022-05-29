package Exceptions;

public class ExampleException {

    void sampleException() {
        try {
            System.out.println("Method RUN");
        } catch (ArithmeticException e1) {
            System.out.println("Exception 1 : " + e1);
        } catch (NumberFormatException e2) {
            System.out.println("Exception 1 : " + e2);
        } finally {
            System.out.println("Finally");
        }
    }

}

class TestEx {
    public static void main(String[] args) {
        doStuff();
    }

    static void doStuff() {
        System.out.println("---------- With Exception ----------");
        withException();
        System.out.println("---------- Without Exception ----------");
        withoutException();
    }

    static void withoutException() {
        int x = 5 / 0; // Can't divide by zero!
        //ArithmeticException is thrown here
    }

    static void withException() {
        try {
            int x = 5 / 0; // Can't divide by zero!
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            //e.printStackTrace();
        }
    }
}