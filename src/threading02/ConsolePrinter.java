package threading02;

public class ConsolePrinter implements Runnable {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    private void logic() throws InterruptedException {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            Thread.sleep(10);
        }
    }

    @Override
    public void run() {
        try {
            logic();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
