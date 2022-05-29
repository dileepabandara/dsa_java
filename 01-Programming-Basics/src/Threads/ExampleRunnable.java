package Threads;

class B implements Runnable{
    public void run(){
        System.out.println("Hello World! FROM B");
    }
}


public class ExampleRunnable {
    public static void main(String[] args) {
        B b = new B();
        Thread thread = new Thread(b);
        thread.start();
    }
}
