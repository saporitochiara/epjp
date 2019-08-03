package b06;

public class S66Main {
    public static void main(String[] args) {
        S66Barker[] barkers = new S66Barker[2];
        
        barkers[0] = new S66Fox();
        barkers[1] = new S66Dog();

        for(S66Barker barker: barkers) {
            System.out.println(barker.bark());
        }
        
        S66BarkAndWag baw = new S66Dog();
        System.out.println(baw.tailWaggingSpeed());

        S66Dog dog = new S66Dog();
        System.out.println(dog.bark(3));
    }
}
