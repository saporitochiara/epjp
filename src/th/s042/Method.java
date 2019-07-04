package th.s042;

public class Method {
    public static void main(String[] args) {
        System.out.println(MyClass.h());
        
        MyClass reference = new MyClass();
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
