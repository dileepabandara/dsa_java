package ObjectOrientedProgramming;

class PolyClassSuper {
    void print() {
        System.out.println("PolyClassSuper");
    }
}

class PolyClassSub extends PolyClassSuper {
    void print() {
        System.out.println("PolyClassSub");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        /*  Polymorphism - Run subclass' override method through superclass upcasted object

         STEPS:
         1 - Inherit from superclass
         2 - Override method inside subclass
         3 - Upcasting
         4 - Run subclass' override method  */

        PolyClassSuper polyClassSuper = new PolyClassSub();
        polyClassSuper.print();
    }
}
