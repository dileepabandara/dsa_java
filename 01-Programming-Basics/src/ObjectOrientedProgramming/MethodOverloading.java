package ObjectOrientedProgramming;

public class MethodOverloading {

    public static void main(String[] args) {
        createMethod();
        createMethod("createMethod()");
    }


    // Create 2 methods with same name and different parameters
    static void createMethod() {
        System.out.println("Method Name: createMethod()");
    }

    static void createMethod(String methodName) {
        System.out.println("Method Name: " + methodName);
    }

}
