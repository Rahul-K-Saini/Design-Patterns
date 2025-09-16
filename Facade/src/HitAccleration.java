public class HitAccleration {
    private final Engine engine;
    private final FuelCheck fuelCheck;

    public HitAccleration() {
        this.engine = new Engine();
        this.fuelCheck = new FuelCheck();
    }

    public void startCar() throws IllegalStateException {
        fuelCheck.isFuelSufficient();
        if (!fuelCheck.isFuelSufficient()) {
            throw new IllegalStateException("Not enough fuel to start the car");
        }
        else engine.start();
    }

    public void stopCar() {
        engine.stop();
    }
}
