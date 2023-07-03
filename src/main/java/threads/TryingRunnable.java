package threads;

public class TryingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The number is : " + i);
        }
    }

    public static void main(String[] args) {
        TryingRunnable TryingRunnable = new TryingRunnable();
        Thread numberThread = new Thread(TryingRunnable);

        numberThread.start();

        try {
            numberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}