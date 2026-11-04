public class Bus extends Vehicle{
    private int maxPass;


    private final double forRashod = 5;

    public Bus() {
        super();
        maxPass = 10;
    }

    public Bus(String number, 
            double oilStatus, 
            double rashod, 
            double probeg, 
            int maxPass) {
        super(number, oilStatus, rashod, probeg);
        this.maxPass = maxPass;
    }

}
