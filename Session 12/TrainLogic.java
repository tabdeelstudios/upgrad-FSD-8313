public class TrainLogic {
    public static void main(String[] args) {
        TrainRoute route = new TrainRoute();

        route.addStation("Station A");
        route.addStation("Station B");
        route.addStation("Station C");
        route.addStation("Station D");
        route.addStation("Station E");

        System.out.println("\nInitial Route:");
        route.displayRoute();

        route.removeStation("Station B");
        System.out.println("\nAfter removing Station B: ");
        route.displayRoute();
        route.removeStation("Station D");
        System.out.println("\nAfter removing Station D: ");
        route.displayRoute();
    }
}
