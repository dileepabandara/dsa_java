package Threads;

class Task3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            {
                System.out.println("Task3: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Task4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            {
                System.out.println("Task4: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class WithMultiThreading {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        task3.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task4.start();
    }
}
