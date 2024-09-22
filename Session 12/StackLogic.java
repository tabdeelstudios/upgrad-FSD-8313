public class StackLogic {
    public static void main(String[] args) {
        PlateStack stack = new PlateStack();

        stack.addPlate("Plate 1");
        stack.addPlate("Plate 2");
        stack.addPlate("Plate 3");
        stack.addPlate("Plate 4");

        stack.peekPlate();

        stack.removePlate();
        stack.removePlate();

        stack.peekPlate();

        stack.removePlate();
        stack.removePlate();
        stack.removePlate();
    }
}
