package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // COntagem de threads ativadas
        System.out.println(Thread.activeCount());

        // Colocar o nome na thread
        Thread.currentThread().setName("MAIN");
        // Nome da thread
        System.out.println(Thread.currentThread().getName());

        // Colocar uma quantiade de prioridades
        Thread.currentThread().setPriority(10);
        // Mostra o número de prioridades
        System.out.println(Thread.currentThread().getPriority());

        // Situação de uma Thread
        System.out.println(Thread.currentThread().isAlive());

        for(int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        
        // Iniciar uma thread
        thread2.start();

        System.out.println(thread2.isAlive());

        thread2.setName("2nd Thread");
        System.out.println(thread2.getName());

    }
}
