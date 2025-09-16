public class CarFacade {
    private final HitAccleration hitAccleration;

    public CarFacade() {
        this.hitAccleration = new HitAccleration();
    }

    public void startCar() throws IllegalStateException{
        try {
            hitAccleration.startCar();
        }catch (IllegalStateException e){
            throw new IllegalStateException("Cannot start the car: " + e.getMessage());
        }
    }

    public void stopCar() {
        hitAccleration.stopCar();
    }
}
