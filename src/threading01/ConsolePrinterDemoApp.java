package threading01;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter cpA = new ConsolePrinter("printer A");
        ConsolePrinter cpB = new ConsolePrinter("printer B");
        ConsolePrinter cpC = new ConsolePrinter("printer C");
        ConsolePrinter cpD = new ConsolePrinter("printer D");
        System.out.println("Constructor done.");
        //cpA.logic();
        //cpB.logic();

        cpA.start();
        System.out.println("Thread A started.");
        cpB.start();
        System.out.println("Thread B started.");
        cpC.start();
        System.out.println("Thread C started.");
        cpD.start();
        System.out.println("Thread D started.");

        System.out.println("Waiting for A.");
        cpA.join();
        System.out.println("Waiting for B.");
        cpB.join();
        System.out.println("Waiting for C");
        cpC.join();
        System.out.println("Waiting for D");
        cpD.join();

        System.out.println("All Done.");
    }
}
