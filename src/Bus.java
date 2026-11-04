public class Bus extends Vehicle{
    //КОНСТАНТЫ
    private final int maxPass;
    private final double forRashod = 1;

    //ПОЛЯ КЛАССА "BUS"
    private int countOfPassenger;

    public Bus() {
        super();
        maxPass = 10;
        countOfPassenger = 0;
    }

    public Bus(int pass) {
        super();
        maxPass = 10;
        countOfPassenger = pass;
        this.rashod = rashod + forRashod * countOfPassenger;
    }

    public Bus(String number, 
            double oilStatus, 
            double rashod, 
            double probeg, 
            int pass, int maxPass) {
        super(number, oilStatus, rashod, probeg);
        this.countOfPassenger = pass;
        this.maxPass = pass;
        this.rashod = rashod + forRashod * countOfPassenger;
    }

}
