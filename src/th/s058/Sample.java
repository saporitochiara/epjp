package th.s058;

public class Sample {
    private int a;
    protected short b;
    static double c;
    // public long d;

    static {
        c = 18;
    }

    public Sample() {
        this.a = 42;
        this.b = 23;
    }

    public void f() {
        System.out.println(a);
    }
}
