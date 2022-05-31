package ObjectOrientedProgramming;


class SuperClassEx {

}

class SubClassEx extends SuperClassEx {

}


public class UpcastDowncast {

    // Upcast - Put subclass object into superclass object
    SuperClassEx superClassEx = new SubClassEx();

    // Downcast - Put upcasted superclass object into subclass
    SubClassEx subClassEx = (SubClassEx) superClassEx;

    public static void main(String[] args) {

    }

}
