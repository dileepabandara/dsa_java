package ObjectOrientedProgramming;

public class MethodOverriding {

    static SubClassZero subClassZero = new SubClassZero();

    public static void main(String[] args) {
        System.out.println("lateMode() - not override");
        subClassZero.lateMode();
        System.out.println("workMode() - override");
        subClassZero.workMode();
    }

}


class SuperClassZero {

    void lateMode() {
        System.out.println("Late Mode for SuperClassZero");
    }
    void workMode() {
        System.out.println("Work Mode for SuperClassZero");
    }

}

class SubClassZero extends SuperClassZero {

    // workMode() is overriding
    void workMode() {
        System.out.println("Work Mode for SubClassZero");
    }
}