package b06;

public class S69Cat extends S69Mammal {
    private S69Tail tail;

    public S69Cat(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new S69Tail(tailLen);
    }

    @Override
    public String toString() {
        return "S69Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
