package th.s059;

public class Sample {
    private int a;
    static double c;

    static private double f() {
        return c;
    }

    void g() {
        f();
    }

    public int h() {
        return a / 2;
    }
}
