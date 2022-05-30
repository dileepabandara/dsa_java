package ObjectOrientedProgramming;

class SuperClass {

    String className = "SuperClass";
    private int id = 1;

    void workMode() {
        System.out.println("SuperClass Work Mode!");
    }

}

class SubClass extends SuperClass {
    String version = "1.0.1";
}


public class Inheritance {

    static SubClass subClass = new SubClass();

    public static void main(String[] args) {
        System.out.println("Class Name: " + subClass.className);
        // System.out.println("Class ID: " + subClass.id);
        System.out.println("Class Version: " + subClass.version);
        subClass.workMode();
    }
}