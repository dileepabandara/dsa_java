package Threads;

class A extends Thread{
    public void run(){
        System.out.println("Hello World! FROM A");
    }
}


public class ExampleThread {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}
