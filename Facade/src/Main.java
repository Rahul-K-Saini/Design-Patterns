public class Main {
    public static void main(String[] args) throws IllegalStateException {
        // Facade Pattern
        /*
            The Facade Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.
            It involves creating a facade class that wraps the complex subsystem and exposes a simpler interface to the client.
            This pattern is useful when you want to hide the complexity of a system and provide a more user-friendly interface.
         */
        CarFacade car = new CarFacade();
        try{
            car.startCar();
            car.stopCar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
