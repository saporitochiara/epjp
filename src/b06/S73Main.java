package b06;

public class S73Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();

        S73Pet pet = new S73Dog("Bob");

        // risky
        S73Dog dog = (S73Dog) pet;
        dog.bark();

        // next line leads to a ClassCastException
        S73Cat cat = (S73Cat) pet;
        System.out.println(System.identityHashCode(cat));

        if (pet instanceof S73Cat) {
            S73Cat tom = (S73Cat) pet;
            tom.meow();
        }
    }
}
