package ObjectOrientedProgramming;

public class ConstructorExample {
    int id;
    String name;

    //Default constructor
    ConstructorExample() {
        this.name = "default constructor";
        this.id = 1;
    }

    //Parameterized constructor
    ConstructorExample(String n, int a) {
        this.name = n;
        this.id = a;
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        ConstructorExample obj2 =
                new ConstructorExample("parameterized constructor", 2);
        System.out.println(obj1.name + " " + obj1.id);
        System.out.println(obj2.name + " " + obj2.id);
    }
}
