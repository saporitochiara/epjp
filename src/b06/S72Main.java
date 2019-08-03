package b06;

public class S72Main {
    public static void main(String[] args) {
        S72Dog tom = new S72Dog("Tom", 2.42);

        String name = tom.getName();
        double speed = tom.getSpeed();

        System.out.println("Name and speed: " + name + ", " + speed);
    }
}
