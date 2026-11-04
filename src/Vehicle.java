public class Vehicle {
    protected String number;
    protected double oilStatus;
    protected double rashod;
    protected double probeg;

    public Vehicle() {
        number = "o000ooo";
        oilStatus = 100.0;
        rashod = 5.0;
        probeg = 0;
    }
    
    public Vehicle(String number, 
            double oilStatus, 
            double rashod, 
            double probeg) {
        this.number = number;
        this.oilStatus = oilStatus;
        this.rashod = rashod;
        this.probeg = probeg;
    }

    protected void getFuelConsumption() {
        this.rashod = 10.0;
    }
    //GETTERS
    protected double getRashod() { return this.rashod; }
    protected double getOilStatus() { return this.oilStatus; }
    protected double getProbeg() { return this.probeg; }
    protected String getNumber() { return this.number; }

}