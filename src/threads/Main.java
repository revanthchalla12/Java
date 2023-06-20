package threads;

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();
    }
}
