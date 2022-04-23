package threading02;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter cpA = new ConsolePrinter("A");
        ConsolePrinter cpB = new ConsolePrinter("B");

        Thread threadA = new Thread(cpA);
        Thread threadB = new Thread(cpB);

        threadA.start();
        threadB.start();

        Thread.sleep(5000);

        //threadA.stop(); should not be used anymore (impolite stopping)
        //threadB.stop();
        System.out.println("Abbruch");
        cpA.pleaseStop = true; // polite stopping
        cpB.pleaseStop = true;

        //threadA.interrupt(); // shouldn't be used if polite interruption can be used
        //threadB.interrupt();

        //threadA.join();
        //threadB.join();



        System.out.println("Programm ist beendet.");

    }
}
