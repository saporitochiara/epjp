package b06;

public abstract class S69Mammal {
    protected int gestation;

    public S69Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "S69Mammal [gestation=" + gestation + "]";
    }
}
