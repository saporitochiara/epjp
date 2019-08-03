package b06;

public class S68Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        S68Abstract ma = new S68Abstract();
//        S68Abstract2 ma2 = new S68Abstract2();

        S68Abstract ma = new S68Concrete();
        ma.anAbstractMethod();

        S68Abstract2 ma2 = new S68Concrete2();
        ma2.aConcreteMethod();
    }
}
