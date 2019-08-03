package b06;

public class S66Dog implements S66BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return S66BarkAndWag.AVG_WAGGING_SPEED;
    }
}