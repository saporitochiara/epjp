package b06;

public class S69Main {
    public static void main(String[] args) {
        S69Mammal[] mammals = new S69Mammal[2];
        mammals[0] = new S69Dog(63, 40);
        mammals[1] = new S69Cat(63, 20);

        for (S69Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }
    }
}
