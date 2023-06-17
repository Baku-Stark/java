package Multi_Threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();

        Thread thread2 = new Thread(runnable1);

        // Ambas as thread funcionam juntas
        thread1.start();

        thread1.join(); // o método "join" vai realizar a [thread2] quando a [thread1] ser finalizada
        // ----
        thread2.start();
    }
}
