package b06;

public class S72Dog extends S72Pet {
    private double speed;

    public S72Dog(String name) {
        this(name, 0);
    }

    public S72Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}