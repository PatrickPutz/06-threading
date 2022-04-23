package threading03;

public class PrimValidation extends Thread {

    private final long number;
    private PrimStatus isPrim;

    public PrimValidation(long number) {
        this.number = number;
    }

    private void validate(){
        this.isPrim = PrimStatus.Unknown;

        for(int i = 2; i < this.number; i++){
            if((this.number % i) == 0) {
                this.isPrim = PrimStatus.IsNotPrim;
                break;
            }
        }

        if(this.isPrim == PrimStatus.Unknown){
            this.isPrim = PrimStatus.IsPrim;
        }

        System.out.println(this.number + ".isPrim = " + this.isPrim);
    }

    @Override
    public void run() {
        validate();
    }
}
