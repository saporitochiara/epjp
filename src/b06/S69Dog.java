package b06;

public class S69Dog extends S69Mammal {
    private S69Tail tail;

    public S69Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new S69Tail(tailLen);
    }

    @Override
    public String toString() {
        return "S69Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
