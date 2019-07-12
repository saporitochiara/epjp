package b06;

public class S60 {
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
