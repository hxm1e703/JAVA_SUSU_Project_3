import java.util.Scanner;

public class Route {
    private double lengthKillometres;
    private Scanner scanner = new Scanner(System.in);

    public Route() {
        lengthKillometres = 1.0;
    }
    public Route(double length) {
        this.lengthKillometres = length;
    }

    public void setRoot(double length) { this.lengthKillometres = length; }
    public double getRoot() { return lengthKillometres; } 
    
    public void changeRoot() {
        System.out.print("Введите изменённый маршрут: ");
        int newLength = scanner.nextInt();
        this.setRoot(newLength);
    }
}
