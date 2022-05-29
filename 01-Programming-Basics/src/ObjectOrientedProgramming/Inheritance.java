package ObjectOrientedProgramming;

public class Inheritance {
}


class OldPhone {

    static String brandName = "OLD";
    String colors = "BLACK";

    void call() {
    }

    void sms() {
    }

}

class NewPhone extends OldPhone {

    public static void main(String[] args) {
        System.out.println(brandName);
    }
}