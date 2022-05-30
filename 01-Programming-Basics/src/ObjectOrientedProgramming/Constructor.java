package ObjectOrientedProgramming;

public class Constructor {
    int id;
    String name;

    //Default constructor
    Constructor() {
        this.name = "default constructor";
        this.id = 1;
    }

    //Parameterized constructor
    Constructor(String n, int a) {
        this.name = n;
        this.id = a;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 =
                new Constructor("parameterized constructor", 2);
        System.out.println(obj1.name + " " + obj1.id);
        System.out.println(obj2.name + " " + obj2.id);
    }
}
