package b07;

public class S75 {
    public void f() {
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        } finally {
            cleanup();
        }
    }

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        S75 exceptional = new S75();
        exceptional.f();
    }
}
