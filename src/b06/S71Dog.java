package b06;

public class S71Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;

	private String name;
	private int weight;

	public S71Dog() {
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}

	public S71Dog(String name) {
		this(name, DEFAULT_WEIGHT);
	}

	public S71Dog(int weight) {
		this(DEFAULT_NAME, weight);
	}

	public S71Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

    @Override
    public String toString() {
        return "S71Dog [name=" + name + ", weight=" + weight + "]";
    }
}
