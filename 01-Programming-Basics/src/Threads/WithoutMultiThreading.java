package Threads;

class Task1 {
    public void doThis() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task1: " + i);
        }
    }
}

class Task2 {
    public void doThis() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task2: " + i);
        }
    }
}

public class WithoutMultiThreading {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        task1.doThis();
        task2.doThis();
    }
}
