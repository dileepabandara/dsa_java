package ObjectOrientedProgramming;

public class ObjectExample {

    public static void main(String[] args) {

        AnotherClass object = new AnotherClass();
        System.out.println("Name: " + object.name + " | Count: " + object.count);
        object.runClass();

    }

}


class AnotherClass {

    String name = "another";
    int count = 123;

    void runClass() {
        System.out.println("Run AnotherClass !!!");
    }

}