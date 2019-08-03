package b04;

public class S42MethodCaller {
    public static void main(String[] args) {
        System.out.println(S42.h());
        
        S42 reference = new S42();
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
