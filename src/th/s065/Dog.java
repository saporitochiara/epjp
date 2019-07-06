package th.s065;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}