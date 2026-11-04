public class Program {
    public static void main(String[] args) {
        Route mainRoute = new Route(100);
        System.out.println(mainRoute.getRoot());
        mainRoute.changeRoot();
    }
}