package threading02;

public class ConsolePrinter implements Runnable {

    private String identifier;
    public boolean pleaseStop;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
        this.pleaseStop = false;
    }

    private void logic(){
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            if(this.pleaseStop == true){
                System.out.println(this.identifier + ": Somebody asked me to stop running!");
                break;
            }

            if(Thread.currentThread().isInterrupted()){
                System.out.println(identifier + " was interrupted.");
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void run() {
            logic();
    }
}
