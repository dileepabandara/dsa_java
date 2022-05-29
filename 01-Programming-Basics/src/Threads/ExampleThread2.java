package Threads;

public class ExampleThread2 extends Thread {

    String name;

    public ExampleThread2(String stringName) {
        this.name = stringName;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            {
                System.out.println(name);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        ExampleThread2 thread1 = new ExampleThread2("1");
        ExampleThread2 thread2 = new ExampleThread2("2");
        ExampleThread2 thread3 = new ExampleThread2("3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
