package threading03;

public class PrimValidiationDemoApp {

    //1979990039, 1989990047, 1991990059, 1891999939, 1891999943, 1991999993
    public static void main(String[] args) throws InterruptedException {

        PrimValidation prim1 = new PrimValidation(1979990039);
        PrimValidation prim2 = new PrimValidation(1989990047);
        PrimValidation prim3 = new PrimValidation(1991990059);
        PrimValidation prim4 = new PrimValidation(1891999939);
        PrimValidation prim5 = new PrimValidation(1891999943);
        PrimValidation prim6 = new PrimValidation(1991999993);
        PrimValidation prim7 = new PrimValidation(1991999999);

        prim1.start();
        prim2.start();
        prim3.start();
        prim4.start();
        prim5.start();
        prim6.start();
        prim7.start();

        prim1.join();
        prim2.join();
        prim3.join();
        prim4.join();
        prim5.join();
        prim6.join();
        prim7.join();

    }
}
