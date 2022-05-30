package ObjectOrientedProgramming;

public class ClassesAndObjects {

    static String className = "ClassesAndObjects";
    static int id = 1;

    static FirstClass objectOfFirstClass = new FirstClass();
    static SecondClass objectOfSecondClass = new SecondClass();

    public static void main(String[] args) {
        System.out.println("Let's see what are classes: ");
        System.out.println("-----------------------------------------");
        System.out.println("Root Class Without Object");
        System.out.println("Class Name: " + className + " | id: " + id);
        System.out.println("-----------------------------------------");
        System.out.println("First Class With Object");
        System.out.println("Class Name: " + objectOfFirstClass.className + " | id: " + objectOfFirstClass.id);
        objectOfFirstClass.methodForFirstClass();
        System.out.println("-----------------------------------------");
        System.out.println("Second Class With Object");
        objectOfSecondClass.className = "SecondClass";
        objectOfSecondClass.id = 2;
        System.out.println("Class Name: " + objectOfSecondClass.className + " | id: " + objectOfSecondClass.id);
        System.out.println("-----------------------------------------");
    }

}

class FirstClass {
    String className = "FirstClass";
    int id = 2;

    void methodForFirstClass() {
        System.out.println("methodForFirstClass();");
    }
}

class SecondClass {
    String className;
    int id;
}
