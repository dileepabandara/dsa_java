package ObjectOrientedProgramming;

public class MethodOverloading {

    public static void main(String[] args) {
        method1();
        method1(15);
    }


    // Create 2 methods with same name and different parameters
    static void method1() {
        System.out.println("Method 1");
    }

    static void method1(int x) {
        System.out.println("Method 1: " + x);
    }

}
