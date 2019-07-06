package th.s067;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//      MyAbstract ma = new MyAbstract();
//      MyAbstract2 ma2 = new MyAbstract2();

        MyAbstract ma = new MyConcrete();
        ma.anAbstractMethod();

        MyAbstract2 ma2 = new MyConcrete2();
        ma2.aConcreteMethod();
    }
}
