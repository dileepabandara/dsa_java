package ObjectOrientedProgramming;

class MainClass {

    MainClass() {
    }

    MainClass(String className) {
        System.out.println("Run " + className + " Constructor");
    }

    void overridingMethod() {
        System.out.println("Run overriding method inside superclass");
    }

}


public class SuperKeyword extends MainClass {

    // super keyword is used to run superclass constructor inside the subclass
    // super keyword is used to run all statements inside override methods on both superclass and subclass
    SuperKeyword() {
        super("MainClass");
        System.out.println("Run SuperKeyword Constructor");
    }

    @Override
    void overridingMethod() {
        super.overridingMethod();
        System.out.println("Run overriding method inside subclass");
    }

    public static void main(String[] args) {
        SuperKeyword superKeyword = new SuperKeyword();
        superKeyword.overridingMethod();
    }

}
